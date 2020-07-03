package com.ict.edu01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex10")
public class Ex10 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// 배열로 받은 파라미터 값을 처리하는 코딩
		String[] hobby = request.getParameterValues("hobby");
		String[] program = request.getParameterValues("program");
		
		
		out.println("<h2> 가입정보 </h2>");
		out.println("<ul>");
			for (String k : hobby) {
				out.println("<li>"+ k +"</li>");
			}
		out.println("</ul>");
		
		out.println("<h2> 가입정보 </h2>");
		out.println("<ul>");
		for (String k : program) {
			out.println("<li>"+ k +"</li>");
		}
		out.println("</ul>");
		
	}

}
