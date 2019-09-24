package com.nanase;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo3
 */
@WebServlet("/ServletDemo3")
public class ServletDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ServletConfig config;
	@Override
	// config实例由容器提供
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		test(response);
	}
	// 获取所有的参数及参数值
	private void test(HttpServletResponse response) throws IOException {
		Enumeration<String> e = config.getInitParameterNames();
		while (e.hasMoreElements()) {
			String paramName = (String) e.nextElement();
			String paramValue = config.getInitParameter(paramName);
			response.getWriter().write(paramName + ":" + paramValue + "<br/>");
		}
	}

}
