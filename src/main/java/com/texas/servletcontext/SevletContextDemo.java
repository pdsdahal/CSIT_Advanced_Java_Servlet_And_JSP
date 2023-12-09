package com.texas.servletcontext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SevletContextDemo extends GenericServlet {

	private ServletContext context;

	public void init(ServletConfig config) {
		this.context = config.getServletContext();
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		Enumeration<String> params = context.getInitParameterNames();
		while (params.hasMoreElements()) {
			String keyName = params.nextElement();
			String value = context.getInitParameter(keyName);
			pw.println(keyName + " : " + value);
		}
		pw.close();
	}

	public void destroy() {

	}

}
