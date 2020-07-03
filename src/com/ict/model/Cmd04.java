package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cmd04 {

	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		String msg="";
		
		// 파라미터값 name, kor, eng, math
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		
		// 총합
		int sum = kor + eng + math;
		
		// 평균
		double avg = (int)(sum/3.0*10)/10.0;
		
		// 학점
		String hak="";
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
		
		msg = name + "의 총점은 " + sum + "점, 평균은 " + avg + "점, 최종 학점은 " + hak +"입니다.";
		
		return msg;
	}
	
}
