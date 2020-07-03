package com.ict.edu01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex04")
public class Ex04 extends HttpServlet {
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
		out.println("<title> 테이블 </title>");
		out.println("<style type='text/css'>");
			out.println("table, th, td {");
				out.println("border: 1px solid green;");
				out.println("color: #f9f9f9;");
			out.println("} thead {");
				out.println("background-color: tomato;");
			out.println("} table {");
				out.println("margin: auto;");
				out.println("width: 700px;");
				out.println("background-color: #ff9925;");
			out.println("} td {");
				out.println("text-align: center;");
			out.println("} .city {");
				out.println("background-color: #333;");
				out.println("color: white;");
				out.println("margin: 20px;");
				out.println("padding: 20px;");
				out.println("width: 300px;");
				out.println("float: left; }");
		out.println("</style>");
		out.println("</head>");
		
		out.println("<body>");
		
		out.println("<table>");
			out.println("<col style='background-color: green;'>");
			out.println("<col style='background-color: purple;'>");
			out.println("<colgroup span='2' style='background-color: teal;'>");
		out.println("<thead>");
		out.println("<tr>");
			out.println("<th>방 이 름</th>");
			out.println("<th>대 상</th>");
			out.println("<th>크 기</th>");
			out.println("<th>가 격</th>");
		out.println("</tr>");		
		out.println("</thead>");
		out.println("<caption style='color: black;'>테이블 2</caption>");
		out.println("<tbody>");
		out.println("<tr>");
			out.println("<td>유채방</td>");
			out.println("<td>여성</td>");
			out.println("<td rowspan='3'>4인실</td>");
			out.println("<td rowspan='4'>1인 20,000원</td>");
		out.println("</tr>");
		out.println("<tr>");
			out.println("<td rowspan='2'>동백방</td>");
			out.println("<td>동성</td>");
		out.println("</tr>");
		out.println("<tr>");
			out.println("<td>가족</td>");
		out.println("</tr>");
		out.println("<tr>");
			out.println("<td>천혜향방</td>");
			out.println("<td>누구나</td>");
			out.println("<td>2인실</td>");
		out.println("</tr>");
		out.println("</tbody>");
		out.println("</table>");
		
		out.println("<br><hr>");
		
		out.println("<div class='city'>");
			out.println("<h2>London</h2>");
			out.println("<p>London is the capital of England.</p>");
		out.println("</div>");
		
		out.println("<div class='city'>");
		out.println("<h2>Paris</h2>");
		out.println("<p>Paris is the capital of France.</p>");
		out.println("</div>");
		
		out.println("<div class='city'>");
		out.println("<h2>Seoul</h2>");
		out.println("<p>Seoul is the capital of Korea.</p>");
		out.println("</div>");
		
		out.println("</body>");
		out.println("</html>");
		
		// 입력 과정에서 매우 비효율적
		// 따라서 컨트롤러로만 사용
		
		
		
		
		
	}

}
