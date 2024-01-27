package com.jspider.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyServlet2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter print=resp.getWriter();
print.println("<h5>Hello</h5> ");
	}
	

}
