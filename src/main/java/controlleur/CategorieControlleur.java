package controlleur;

import java.io.IOException;
import java.util.List;


import dto.CategorieDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CategoireServiceImp;
import service.ICategoireService;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/admin/categorie/*")
public class CategorieControlleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ICategoireService categoireService;
	
	@Override
	public void init() throws ServletException {
		categoireService = new CategoireServiceImp();
	}
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		String motCle = request.getParameter("motCle");
		
		if(path == null || path.equals("/")) {
			
			if(motCle != null) {
				List<CategorieDTO> categories = categoireService.getCategorieByMc(motCle);
				request.setAttribute("categories", categories);
				request.setAttribute("motCle", motCle);
				request.getRequestDispatcher("/admin/categorie.jsp").forward(request, response);
				return;
			}
			
			List<CategorieDTO> categories = categoireService.getAllCategorie();
			request.setAttribute("categories", categories);
			request.getRequestDispatcher("/admin/categorie.jsp").forward(request, response);
			
		}else if(path.equals("/add")) {
			request.getRequestDispatcher("/admin/addCategorie.jsp").forward(request, response);
			
		}else if (path.matches("/\\d+")) {  
	        Long id = Long.parseLong(path.substring(1)); 
	        categoireService.supprimerCategorie(id);
	        response.sendRedirect("/E-commerce/admin/categorie");
	        
	    }else if (path.matches("/\\d+/edit")) { 
            Long id = Long.parseLong(path.substring(1, path.indexOf("/edit")));
            CategorieDTO categorieDTO = categoireService.getCategorieById(id);
            request.setAttribute("categorie",categorieDTO);
            request.getRequestDispatcher("/admin/editCategorie.jsp").forward(request, response);
	    	
        }else {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
		}	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		
		if(path.equals("/add")) {
			String categorie = request.getParameter("categorie");
			categoireService.ajouterCategorie(new CategorieDTO(categorie));
			response.sendRedirect("/E-commerce/admin/categorie");
			
		}else if (path.matches("/\\d+/edit")) { 
            Long id = Long.parseLong(path.substring(1, path.indexOf("/edit")));
            String categorieName = request.getParameter("categorie");
            CategorieDTO categorieDTO = new CategorieDTO(id,categorieName);
            categoireService.editCategorie(id,categorieDTO);
            response.sendRedirect("/E-commerce/admin/categorie");
	       
	    }else {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
	}

}
