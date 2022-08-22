package Servlets;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DbConnection.Features;




@WebServlet("/InsertFlight")
public class InsertFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
			String name=request.getParameter("name");
			String from=request.getParameter("from");
			String to=request.getParameter("to");
			String departure=request.getParameter("departure");
			String time=request.getParameter("time");
			String price=request.getParameter("price");
			
			HashMap<String,String> flight=new HashMap<>();
			flight.put("id", id);
			flight.put("name", name);
			flight.put("from", from);
			flight.put("to", to);
			flight.put("date", departure);
			flight.put("time", time);
			flight.put("price", price);
			
			try {
				Features d=new Features();
				HttpSession session=request.getSession();
				if(d.insertFlight(flight)) {
					
					session.setAttribute("message", "Flight Added Successfully");
				}
				else {
					session.setAttribute("message", "Invalid Details");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.print("error");
				e.printStackTrace();
			}
			response.sendRedirect("insertsuccess.jsp");
			
		}

	}


