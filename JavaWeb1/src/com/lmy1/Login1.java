package com.lmy1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login1 extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		//解决乱码
		//告诉浏览器自动跳转到utf-8
		//response.setContentType("text/html;charset = utf-8");
		//以utf-8显示
		response .setCharacterEncoding("uft-8");
		
		PrintWriter out = response.getWriter();
		//返回一个界面（html）
		out.println("<h1>用户登录</h1>");
		out.println("<from action= ' 'method = 'post'>");
		out.println("用户名:<input type = 'text' name = 'username'/><br/>");
		out.println("密    码:<input type = 'password' name = 'password'/><br/>");
		out.println("<input type = 'submit' value = '登录'/><br/>");
		out.println("</from>");
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
