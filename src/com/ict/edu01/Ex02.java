package com.ict.edu01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping
@WebServlet("/hello")
public class Ex02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex02() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// '서블릿'은 Java 를 기반으로 HTML 태그를 사용하여 웹 브라우저에 표현
		
		// 2. 응답 response 에 대한 한글 처리
		response.setContentType("text/html; charset=UTF-8;"); 
		// 3. 브라우저에 출력
		PrintWriter out = response.getWriter();
		
		// 4. HTML <body> 내용 입력
		out.println("<h1>서블릿 예제</h1>");
		out.println("<h2>Hello World!</h2>");
		
		out.println("서블릿 예제");
		out.println("Hello World!");
		
	}

}
