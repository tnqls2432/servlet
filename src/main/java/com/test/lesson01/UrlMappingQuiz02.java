package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz02 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 한글 깨짐
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		//날짜 생성
		Date now = new Date();
		
		//출력: 현재 시간은 몇시 몇분 몇초 입니다.
		SimpleDateFormat sdf = new SimpleDateFormat("현재 시간은 HH시 mm분 ss초 입니다");
		PrintWriter out = response.getWriter();
		out.println(sdf.format(now));
	}
}
