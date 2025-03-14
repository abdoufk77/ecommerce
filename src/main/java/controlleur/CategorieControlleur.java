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


@WebServlet("/admin/categorie")
public class CategorieControlleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ICategoireService categoireService;
	
	@Override
	public void init() throws ServletException {
		categoireService = new CategoireServiceImp();
	}
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<CategorieDTO> categories = categoireService.getAllCategorie();
		request.setAttribute("categories", categories);
		request.getRequestDispatcher("/admin/categorie.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
