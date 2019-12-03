<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ "/";
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>succ1</h1>
<%
	String username = "";
	username = (String)request.getAttribute("username");
	if(username == null){
		//向request中放置错误信息，转发到login.jsp
		request.setAttribute("msg", "您还未登录");
		request.getRequestDispatcher("/session2/login.jsp").forward(request, response);
		return ;
	}
%>
<p>欢迎<%=username %>参观</p>

</body>
</html>