package cn.privatetools.image;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 校验验证码
		 * 1.从session中获取正确的验证码
		 * 2.从表单中获取用户填写的验证码
		 * 3.进行比较！
		 * 4.如果相同，向下运行，否则保存错误信息到request域中，转发到login.jsp
		 * */
		String sessionCode = (String)request.getSession().getAttribute("session_vcode");
		String paramCode = request.getParameter("verifyCode");
		System.out.println(sessionCode);
		System.out.println(paramCode);
		
		if (!paramCode.equalsIgnoreCase(sessionCode)) {
			request.setAttribute("msg", "验证码错误！");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			return;
		}else {
			request.setAttribute("msg", "验证码正确！");
			request.getRequestDispatcher("index2.jsp").forward(request, response);
			return;
		}
	}

}
