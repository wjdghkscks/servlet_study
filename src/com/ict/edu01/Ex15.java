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

3. <a> 링크
- 파라미터 값을 가져갈것인지 버릴 것인지 선택할 수 있음
- 현재 화면이 보이며, <a> 링크 부분을 클릭해야만 이동

*/
@WebServlet("/Ex15")
public class Ex15 extends HttpServlet {
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
		out.println("<h2> Ex15 </h2>");
		out.println("<h3>");
		out.println("id : " + id);
		out.println("pw : " + pw);
		out.println("</h3>");
		
		out.println("<a href='Ex16'>서블릿/정보X</a><br>");
		out.println("<a href='Ex16?id=" + id + "&pw=" + pw + "'>서블릿/정보O</a><br>");
		out.println("<a href='ex16.html'>html/정보X</a><br>");
		out.println("<a href='ex16.html?id=" + id + "&pw=" + pw + "'>html/정보O</a>");
		
		
	}

}
