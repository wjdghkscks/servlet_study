package com.ict.edu01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.Cmd01;
import com.ict.model.Cmd02;
import com.ict.model.Cmd03;

@WebServlet("/Ex19")
public class Ex19 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String com = request.getParameter("com");
		String res = "";
		
		switch (com) {
		
		case "1":
			
			// 객체 생성 및 메소드 실행
			Cmd01 c01 = new Cmd01();
			res = c01.exec(request, response);
			
			break;
			
		case "2":
			
			Cmd02 c02 = new Cmd02();
			res = c02.exec(request, response);
			
			break;
			
		case "3":
			
			Cmd03 c03 = new Cmd03();
			res = c03.exec(request, response);
			
			break;
		}
		
		out.println("<h1>결과</h1>");
		out.println("<p>" + res + "</p>");
		
	}

}
