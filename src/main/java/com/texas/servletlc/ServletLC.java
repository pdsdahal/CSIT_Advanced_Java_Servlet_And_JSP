package com.texas.servletlc;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletLC implements Servlet {

	public ServletConfig getServletConfig() {
		return null;
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Inside the init class...");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("Inside server method");
	}
	
	public void destroy() {
		
	}

	public String getServletInfo() {
		return null;
	}

	

	

}
