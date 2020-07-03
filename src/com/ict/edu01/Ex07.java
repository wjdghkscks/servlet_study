package com.ict.edu01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex07")
public class Ex07 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청 request 에 대한 한글 처리
		request.setCharacterEncoding("UTF-8");
		
		// 2. 응답 response 에 대한 문서 처리 및 한글 처리
		response.setContentType("text/html; charset=utf-8");
		// 3. 출력 처리
		PrintWriter out = response.getWriter();
		
		/* [파라미터]
			- 클라이언트가 서버에 요청 시 함께 보내는 정보
			- 페이지에서 다른 페이지로 이동할 때 함께 보내는 정보
			- 파라미터의 자료형은 무조건 String 또는 String[]
			
			- get 방식 	: 주소창에 파라미터 노출
						>>> ?name1=value1&name2=value2
			- post 방식	: 주소창에 파라미터 노출 X
			
			- 파라미터 값을 처리하는 메소드들 (request)
			
				1) request.getParameter() : String
				- 파라미터 값이 하나일 때 사용
				
				2) request.getParameterValues() : String[]
				- 같은 이름의 파라미터가 여러개일 때 사용
				
				3) request.getParameterMap() : 
				- 맵 형식의 파라미터를 받을 때 사용
				
				4) request.getParameterNames() : String[]
				- 열거형의 파라미터를 받을 때 사용
		*/
		
		// 이름 name 과 나이 age 가 파라미터 값으로 넘어왔을 때 처리하기
		out.println("<h2> 서블릿 파라미터 예제 </h2>");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		out.println("<h3>");
		out.println("<p>이름: " + name + "</p>");
		out.println("<p>나이: " + age + "</p>");
		out.println("</h3>");
		
		out.println("<hr>");
		
		// su1, su2 파라미터에 숫자값이 들어오며, su1과 su2를 더한 값을 출력하기
		out.println("<h2> 서블릿 파라미터 예제2 </h2>");
		
		int s1 = Integer.parseInt(request.getParameter("su1"));
		int s2 = Integer.parseInt(request.getParameter("su2"));
		
		int res = s1 + s2;
		
		out.println("<h3>");
		out.println("<p> 결과: " + String.valueOf(res) + " </p>");
		out.println("</h3>");
		
	}

}
