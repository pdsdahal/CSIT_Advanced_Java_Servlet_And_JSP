package com.texas.servletconfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletConfigDemo implements Servlet {

	private ServletConfig servletConfig;

	public void init(ServletConfig config) throws ServletException {
		this.servletConfig = config;
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		
		PrintWriter pw = response.getWriter();
		
		Enumeration<String> params = servletConfig.getInitParameterNames();
		while(params.hasMoreElements()) {
			String keyName =  params.nextElement();
			String value = servletConfig.getInitParameter(keyName);
			pw.println(keyName + " : "+value);
		}
		
		pw.close();
	}

	public void destroy() {

	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null;
	}

}
