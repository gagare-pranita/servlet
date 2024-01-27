package com.jspider.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/MyServlet8")
public class MyServlet8 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("pranita@gmail.com");
		String[] course=req.getParameterValues("course");
		resp.setContentType("text/html");
		PrintWriter write=resp.getWriter();
		write.println("<h1>Stufdent info:</h1>");
		write.println("<h1>" +name+ "</h1>");
		write.println("<h1>" +email+ "</h1>");
		for(String courses:course)
		{
			write.println("<h1>" +course+ "</h1>");
			
		}
		
	
	}

}
