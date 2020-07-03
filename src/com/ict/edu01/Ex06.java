package com.ict.edu01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex06")
public class Ex06 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 응답을 위한 문서 처리(text/html;) 및 한글 처리(UTF-8)
				response.setContentType("text/html; charset=UTF-8");
				
				PrintWriter out = response.getWriter();
				
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				
				out.println("<head>");
				out.println("<meta charset='UTF-8'>");
				out.println("<title> a link </title>");
				out.println("</head>");
					
				out.println("<body>");
				
				out.println("<a href='https://www.google.com'>구글로 이동 1</a>");
				out.println("<a href='https://www.google.com' target='_blank'>구글로 이동 2</a>");
				
				out.println("<a href='/200626_servlet/Ex04'>문서04로 이동</a>");
				out.println("<a href='" + request.getContextPath() + "/Ex04'>문서04로 이동</a>");
			
				out.println("</body>");
				out.println("</html>");
	}

}
