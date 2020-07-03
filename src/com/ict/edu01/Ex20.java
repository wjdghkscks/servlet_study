package com.ict.edu01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.Cmd04;
import com.ict.model.Cmd05;
import com.ict.model.Cmd06;

@WebServlet("/Ex20")
public class Ex20 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd");
		String res = "";
		
		// request와 respond가     필요하면 	forwarding
		//					   필요하지 않으면 	redirect
		switch (cmd) {
			case "1":
				// 성적 구하기 페이지로 redirect
				response.sendRedirect("ex21_1.html");
				break;
				
			case "2":
				// 사칙연산 구하기 페이지로 redirect
				response.sendRedirect("ex21_2.html");
				break;
				
			case "3":
				// 알바비 구하기 페이지로 redirect
				response.sendRedirect("ex21_3.html");
				break;
			
			// case 1-3 은 redirect, case 4-6 은 method
				
			case "4":
				// 성적 처리 메소드
				Cmd04 c04 = new Cmd04();
				res = c04.exec(request, response);
				break;
				
			case "5":
				// 사칙연산 메소드
				Cmd05 c05 = new Cmd05();
				res = c05.exec(request, response);
				break;
			
			case "6":
				// 알바비 계산 메소드
				Cmd06 c06 = new Cmd06();
				res = c06.exec(request, response);
				break;
		}
		
		out.println("<h1>결과</h1>");
		out.println("<p>" + res + "</p>");
		
	}

}
