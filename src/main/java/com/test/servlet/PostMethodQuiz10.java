package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz10")
public class PostMethodQuiz10 extends HttpServlet {
	// private final을 선언한 변수를 사용하면 재할당하지 못하며, 
	// 해당 필드, 메서드별로 호출할 때마다 새로이 값이 할당(인스턴스화)한다.
	// 인스턴스화: 클래스로부터 객체를 만드는 과정
	private final Map<String, String> userMap =  new HashMap<String, String>() {
		{
			put("id", "marobiana");
			put("password", "qwerty1234");
			put("name", "신보람");
		}
	};
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");   
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>결과</title></head><body>");
		if (userMap.get("id").equals(id) == false) {
			out.print("id가 일치하지 않습니다.");
		} else if (userMap.get("password").equals(password) == false) {
			out.print("password가 일치하지 않습니다.");
		} else {
			out.print(userMap.get("name") + "님 환영합니다!!!");
		}
		out.print("</body></html>");
	}
}
