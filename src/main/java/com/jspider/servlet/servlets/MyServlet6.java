package com.jspider.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/MyServlet6")
public class MyServlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
{
	int num1=Integer.parseInt(req.getParameter("num1"));
	int num2=Integer.parseInt(req.getParameter("num2"));
	int sum=num1+num2;
	resp.setContentType("text/html");
	PrintWriter write=resp.getWriter();
    write.println("<h1> sum of " + num1+  " and " + num2+ " is " +sum+ "</h1>");	
}

}
