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
		//�������
		//����������Զ���ת��utf-8
		//response.setContentType("text/html;charset = utf-8");
		//��utf-8��ʾ
		response .setCharacterEncoding("uft-8");
		
		PrintWriter out = response.getWriter();
		//����һ�����棨html��
		out.println("<h1>�û���¼</h1>");
		out.println("<from action= ' 'method = 'post'>");
		out.println("�û���:<input type = 'text' name = 'username'/><br/>");
		out.println("��    ��:<input type = 'password' name = 'password'/><br/>");
		out.println("<input type = 'submit' value = '��¼'/><br/>");
		out.println("</from>");
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
