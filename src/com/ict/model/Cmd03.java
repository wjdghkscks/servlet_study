package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cmd03 {

	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		// 처리 결과를 저장하는 변수
		String msg = "";
		
		// IP 구하기
		String ip = request.getRemoteAddr();
		
		msg = "당신의 IP 주소는 " + ip + " 입니다.";
		
		return msg;
	}
	
}
