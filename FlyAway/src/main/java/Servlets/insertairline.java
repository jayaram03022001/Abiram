package Servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DbConnection.Features;

/**
 * Servlet implementation class insertairline
 */
@WebServlet("/insertairline")
public class insertairline extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertairline() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		
		HashMap<String,String> airline=new HashMap<>();
		airline.put("id", id);
		airline.put("name", name);
		
		
		try {
			Features d=new Features();
			boolean result=d.insertairline(airline);
			HttpSession session=request.getSession();
			if(result) {
				session.setAttribute("message", " Added Successfully");
			}
			else {
				session.setAttribute("message","Invalid Details");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("insertsuccess.jsp");
	}

}

