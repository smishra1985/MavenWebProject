package com.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("userName..."+request.getParameter("userName"));
		System.out.println("password..."+request.getParameter("password"));
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(userName.equalsIgnoreCase("sourabh") && password.equals("maharaj")){
			response.sendRedirect("success.jsp");	
		} else{
			response.sendRedirect("error.jsp.........");
		}
		

		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("This is the Test Servlet........");

		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			out.print("<br/>Header Name: <em>" + headerName);
			String headerValue = request.getHeader(headerName);
			out.print("</em>, Header Value: <em>" + headerValue);
			out.println("</em>");
		}

		out.println("<hr/>");
		String authHeader = request.getHeader("authorization");
		String encodedValue = authHeader.split(" ")[1];
		out.println("Base64-encoded Authorization Value: <em>" + encodedValue);
		//String decodedValue = Base64.base64Decode(encodedValue);
		out.println("</em><br/>Base64-decoded Authorization Value: <em>" + encodedValue);
		out.println("</em>");
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
