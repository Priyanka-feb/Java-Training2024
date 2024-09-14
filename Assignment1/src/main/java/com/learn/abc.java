package com.learn;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class abc
 * @param <PrintWriter>
 */
@WebServlet("/annotation")
public class abc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	       String var1= request.getParameter("var1");
	       String var2=request.getParameter("var2");
	       response.setContentType("text/html");
	       
	      PrintWriter writer = response.getWriter();
			writer.append("Welcome " + var1 + var2);
			writer.close();
	       
	       
	}	
}
	
	

