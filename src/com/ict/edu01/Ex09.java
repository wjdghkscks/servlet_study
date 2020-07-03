package com.ict.edu01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex09")
public class Ex09 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
				
		response.setContentType("text/html; charset=UTF-8");
				
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		
		int sum = kor + eng + math;
		double avg = (int)(sum / 3 * 10.0) / 10.0 ;
		String hak = "";
		
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
		
		out.print("<h2><ul>");
			out.print("<li> 이름 : " + name + "</li>");
			out.print("<li> 국어 : " + kor + "</li>");
			out.print("<li> 영어 : " + eng + "</li>");
			out.print("<li> 수학 : " + math + "</li>");
			out.print("<li> 총점 : " + sum + "</li>");
			out.print("<li> 평균 : " + avg + "</li>");
			out.print("<li> 학점 : " + hak + "</li>");
		out.print("</ul></h2>");
		
		
		
		
	}

}
