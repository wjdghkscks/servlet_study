package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cmd02 {

	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		// 처리 결과를 저장하는 변수
		String msg = "";
		
		// 오늘 운수 구하기
		msg = "오늘의 행운 지수는 " + String.valueOf((int)(Math.random()*101)) + "% 입니다.";
		
		return msg;
	}
	
}
