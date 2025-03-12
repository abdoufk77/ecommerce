package controlleur;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;
import service.ILoginService;
import service.LoginService;

@WebServlet("/login")
public class LoginControlleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ILoginService loginService ;
	
	@Override
	public void init() throws ServletException {
		loginService = new LoginService();
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/auth/login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		boolean isAuthenticated = loginService.IsUserAuthenticated(email,password);
		System.out.print(isAuthenticated);
		
		if(isAuthenticated) {
			response.sendRedirect("admin/dashboard");
		}else {
			response.sendRedirect("/login");
		}
	}

}
