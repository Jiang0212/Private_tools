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
<title>verifycode</title>
<%
	String message = "";
	String mes = (String) request.getAttribute("msg");
	if(mes != null){
		message = mes;
	}
%>
<script type="text/javascript">
	function  _change() {
		var imageEle = document.getElementById("img");
		imageEle.src = "/SessionTest/VerifyCodeServlet?a=" + new Date().getTime();
	}
</script>
</head>
<body>
	<h1><%=message %></h1>
	<form action="LoginServlet" method="post">
		用户名：<input type="text" name="username" /><br />
		密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" /><br />
		验证码：<input type="text" name="verifyCode" /> <img id="img"
			src="/SessionTest/VerifyCodeServlet" size="3" />
			<a href="javascript:_change()" />换一张</a><br /> <input type="submit" value="登录">
	</form>
</body>
</html>