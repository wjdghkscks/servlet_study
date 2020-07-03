package com.ict.edu01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 
[서블릿 Servlet]

* URL Mapping
- 웹에서 해당 페이지를 호출하는 이름
- localhost:8090/프로젝트_이름/URL_mapping_주소
 
*/

@WebServlet("/Ex01")
public class Ex01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex01() {
        super();
        System.out.println("서블릿 페이지 생성자");
        // init() 자동 호출
    }

    /*	init 메소드
    	생성자 역할을 하는 메소드
    	서블릿 객체를 초기화하는 역할 (최초 1회 호출)
    */
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("init()");
		//service() 자동 호출
		
	}

	// request	: 클라이언트에서 들어온 요청 정보를 가지고 있는 변수
	// response	: 클라이언트에게 결과를 보여줄 수 있는 응답 정보를 가지고 있는 변수
	
	/*	service 메소드
		- 사용자 요청 방식에 따라 알맞는 메소드를 자동으로 호출하는 역할
		- 요청 방식
	   		1) post 방식
	   		 - body에 정보를 담아서 보내는 방식
	   		 - 대용량, 내용이 보이지 않음
	   		 - doPost() 를 호출
	   		2) get 방식
	   		 - Head에 정보를 담아서 보내는 방식
	   		 - 저용량, 내용을 볼 수 있음
	   		 - doGet() 를 호출
	   	- 요청 방식을 표시하지 않는 경우, get 방식을 따름
	*/
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("service()");
		
		if (request.getMethod().equalsIgnoreCase("get")) {
			doGet(request, response);
		} else if (request.getMethod().equalsIgnoreCase("post")) {
			doPost(request, response);
		}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
	}

	/*	destroy 메소드
		- 해당 프로젝트를 tomcat에서 내려올 때 사용되는 메소드
	*/
	public void destroy() {
		System.out.println("destroy");
	}
}
