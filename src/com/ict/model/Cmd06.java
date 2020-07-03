package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cmd06 {

	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		String msg = "";
		
		int time = Integer.parseInt(request.getParameter("time"));
		int dan = 8590;
		int pay = 0;
		
		if (time > 8) {
			// 초과 근무 시 수당
			pay = (int)(1.5 * dan * (time - 8)) + (dan * 8);
		} else {
			// 일반 근무 시 수당
			pay = dan * time;
		}
		
		msg = "이번달 수당은 " + pay + "원 입니다.";
		
		return msg;
	}
	
}
