package com.jspider.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/MyServlet3")
public class MyServlet3 extends  HttpServlet {
	private static final long serialVersionUID = 1L;
	
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	
	doPost(req,resp);
}
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 {
	resp.setContentType("text/html");
	PrintWriter write=resp.getWriter();
	write.println("<h1>Second way</h1>");
	}

 }
}
