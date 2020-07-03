package com.ict.edu01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* 페이지 이동

2. forwarding 포워딩
- 페이지 이동 시 기존의 request, response 값을 가지고 감
- 기존의 파라미터 값이 유지됨
- 주소창에 최초 접속한 주소가 보임
- 사용법	>>>  request.getRequestDispatche("이동할_주소").forward(request, response);

*/
@WebServlet("/Ex13")
public class Ex13 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		out.println("<h2> Ex13 </h2>");
		out.println("<h3>");
		out.println("id : " + id);
		out.println("pw : " + pw);
		out.println("</h3>");
		
		request.getRequestDispatcher("ex14.html").forward(request, response);
		
	}

}
