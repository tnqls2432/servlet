<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz01</title>
</head>
<body>
<%!
	// jsp의 선언문 문법을 사용해서 1부터 N까지의 합을 구하는 함수를 만드세요.
	
	public int getSum(int n) {
	int sum = 0;
	for (int i = 1; i <= n; i++) {
		sum += i;
	}
	return sum;
}

%>
<%
int[] scores = {80, 90, 100, 96, 80};
int sum = 0;
for (int i = 0; i < scores.length; i++) {
	sum += scores[i];
}
double average = sum / (double) scores.length;

List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
int score = 0;
for (int i = 0; i < scoreList.size(); i++) {
	if (scoreList.get(i).equals("O")) {
		score += 100 / scoreList.size();
	}
}

//4. 나이 구하기
String birthDay = "20010820";
String year = birthDay.substring(0, 4);
//out.print(year);
int age = 2021 - Integer.parseInt(year) + 1;
%>


<h1>1부터 50까지의 합은 <%=getSum(50)%>입니다.</h1>
<h1>평균 점수는 <%=average%>입니다.</h1>
<h1>채점 결과는 <%=score%>점 입니다.</h1>
<h1><%=birthDay %>의 나이는 <%=age %>세 입니다.</h1>
</body>
</html>