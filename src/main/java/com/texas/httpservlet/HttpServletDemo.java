package com.texas.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletDemo extends HttpServlet {

	public void init(ServletConfig config) {

	}

	protected void doPost(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws IOException {
		String username = httpRequest.getParameter("username");
		String password = httpRequest.getParameter("password");
		PrintWriter pw = httpResponse.getWriter();
		pw.println("Username : "+username + " Password : "+password);
	}

	protected void doGet(HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		System.out.println("Inside the do Get");
	}

	public void destroy() {

	}
}
