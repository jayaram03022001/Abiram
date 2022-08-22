package Servlets;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import DbConnection.Features;



@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	    	String email=request.getParameter("email");
			String password=request.getParameter("password");
			
			try {
				Features d=new Features();
				
				if(d.checkAdmin(email,password)) {
					response.sendRedirect("menu.jsp");
				}
				else {
					HttpSession session=request.getSession();
					session.setAttribute("message", "Invalid Details");
					response.sendRedirect("AdminPage.jsp");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}


