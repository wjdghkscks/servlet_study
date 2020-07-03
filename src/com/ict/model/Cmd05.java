package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cmd05 {

	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		String msg = "";
		
		int su1 = Integer.parseInt(request.getParameter("su1"));
		int su2 = Integer.parseInt(request.getParameter("su2"));
		String op = request.getParameter("op");
		
		int result = 0;
		
		switch (op) {
		
			case "+": result = su1 + su2; break;
			
			case "-": result = su1 - su2; break;
			
			case "*": result = su1 * su2; break;
			
			case "/": result = su1 / su2; break;
			
		}
		
		msg = "연산 결과 " + su1 + " " + op + " " + su2 + " 의 값은 " + result + "입니다.";
		
		return msg;
	}
	
}
