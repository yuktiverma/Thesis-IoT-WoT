package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheckController
 */
@WebServlet("/LoginCheckController")
public class LoginCheckController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheckController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		
		String password=request.getParameter("password");
		if(username.equals("divya")&&password.equals("pass"))
		response.sendRedirect("view/index.jsp");
		if(username.equals("gauri")&&password.equals("pass"))
			response.sendRedirect("view/index1.jsp");
		if(username.equals("admin")&&password.equals("pass"))
			response.sendRedirect("view/adminPortal.jsp");
		if(username.equals("guest")&&password.equals("pass"))
			response.sendRedirect("view/authfail.jsp");
	}

}
