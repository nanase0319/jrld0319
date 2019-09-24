package com.nanase;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo5
 */
@WebServlet("/ServletDemo5")
public class ServletDemo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 取出ServletContext中存的次数
		int count = (Integer) getServletContext().getAttribute("count");
		// 显示到页面
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("<h1>网站被访问了 "+count+" 次!</h1>");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
