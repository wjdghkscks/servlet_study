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

1. redirect
- 페이지 이동 시 기존 request, response 정보가 사라지고 새로운 request, response 정보 생성
- 따라서 기존의 파라미터 값이 사라짐
- 주소창에 최종 주소가 보임
- 사용법	>>> response.sendRedirect("이동할_주소")
		  		response.sendRedirect("Ex12")			>> servlet으로 이동할 때
		  		response.sendRedirect("ex12.html")		>> HTML 문서로 이동할 때
- 주로 로그인 실패 창에서 사용됨

*/
@WebServlet("/Ex11")
public class Ex11 extends HttpServlet {
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
		
		// 파라미터 값은 id와 pw
		out.println("<h2> Ex11 </h2>");
		out.println("<h3>");
		out.println("id : " + id);
		out.println("pw : " + pw);
		out.println("</h3>");
		
		response.sendRedirect("Ex12");
		// response.sendRedirect("ex12.html");
		
		
	}

}
