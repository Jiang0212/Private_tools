<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>向session域中保存数据</h1>
	<%
		//HttpSession session2 = request.getSession();
		session.setAttribute("aaa", "AAA");
		response.encodeUrl(arg0);
	%>
</body>
</html>