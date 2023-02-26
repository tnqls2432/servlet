package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz03")
public class UrlMappingQuiz03 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
	
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>마론달 뉴스</title></head></body>");
		out.print("<h1>[단독] 고양이가 야옹합니다.</h1>");
		out.print("<p>기사 입력 시간: " + format.format(now) + "</p><hr>");
		out.print("끝");
		out.print("</body></html>");
	
	}
}
