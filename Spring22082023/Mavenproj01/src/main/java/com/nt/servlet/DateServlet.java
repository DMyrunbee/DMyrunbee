package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/dateurl")
public class DateServlet extends HttpServlet {
   protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	   PrintWriter pw=res.getWriter();
	   res.setContentType("text/html");
	   pw.println("<h1>date and time is::"+new Date()+"</h1>");
	   pw.println("<br><a href='index.html'>home</a>");
	   pw.close();
   }
}
