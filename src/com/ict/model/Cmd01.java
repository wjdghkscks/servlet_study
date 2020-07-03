package com.ict.model;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cmd01 {

	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		// 처리 결과를 저장하는 변수
		String msg = "";
		
		// 오늘 날짜 구하기
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day	= now.get(Calendar.DATE);
		
		msg = year + "년 " + month + "월 "  + day + "일 입니다.";
		
		return msg;
	}
	
}
