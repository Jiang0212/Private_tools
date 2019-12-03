/*
 * package com;
 * 
 * import java.io.IOException; import javax.servlet.ServletException; import
 * javax.servlet.annotation.WebServlet; import javax.servlet.http.Cookie; import
 * javax.servlet.http.HttpServlet; import javax.servlet.http.HttpServletRequest;
 * import javax.servlet.http.HttpServletResponse; import
 * javax.servlet.http.HttpSession;
 * 
 *//**
	 * Servlet implementation class LoginServlet
	 *//*
		 * 
		 * public class LoginServlet extends HttpServlet { private static final long
		 * serialVersionUID = 1L;
		 * 
		 * @Override protected void doGet(HttpServletRequest req, HttpServletResponse
		 * resp) throws ServletException, IOException { // TODO Auto-generated method
		 * super.doGet(req, resp); }
		 * 
		 * protected void doPost(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { //获取表单数据 //处理中文问题
		 * request.setCharacterEncoding("utf-8"); String username =
		 * request.getParameter("username"); String password =
		 * request.getParameter("password"); //校验用户名
		 * if("itcast".equalsIgnoreCase(username)) { //将用户名保存到cookie中，发送给客户端浏览器 }
		 * //当再次打开login.jsp是，login.jsp会读取request中的cookie，把他显示到用户名文本框中
		 * 
		 * Cookie cookie = new Cookie("username", username);//创建cookie
		 * cookie.setMaxAge(40*60*20); response.addCookie(cookie);
		 * 
		 * //成功则保存数据到session中 //重定向到succ1.jsp HttpSession session =
		 * request.getSession();//获取session值 session.setAttribute("username",
		 * username);//向session域中保存用户名 response.sendRedirect("/session2/succ1.jsp");
		 * }else { //失败则转发到login.jsp request.setAttribute("msg", "用户名或密码错误！");
		 * request.getRequestDispatcher("/session2/login.jsp").forward(request,response)
		 * ;//转发到登录界面 } }
		 * 
		 * } }
		 */