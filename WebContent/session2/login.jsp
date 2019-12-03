<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 本页面提供登录界面 -->
<body>
	<h1>登录</h1>
	<%
		String uname = "";		
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(Cookie c:cookies){
				if("username".equals(c.getName()))
					uname = c.getValue();
			}
		}
		
	%>
	<%
		String message = "";
		String msg = (String) request.getAttribute("msg");//获取request域中的名为msg的参数
		if (msg != null) {
			message = msg;
		}
	%>
		<font color="red"><b><%=message %></b></font>
	
	<font color="red"><b><%=message %></b></font>
	<form action="LoginServlet" method="post" >
		用户名：<input type="text" name="username" value="<%=uname%>"/><br /> 
		密 码:<input	type="password" name="password" /><br />
		 <input type="submit"
			value="提交">
	</form>
</body>
</html>