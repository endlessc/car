package com.car.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user/*")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //private	 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String URL=request.getRequestURL().toString();                            //获取访问的url地址(不包括参数信息)
		String setPath = URL.substring(URL.lastIndexOf("/")+1);
		
		//判断请求访问进行业务处理
		if(setPath.toUpperCase().startsWith("REGISTER")){  //注册

		}else if(setPath.toUpperCase().startsWith("LOGIN")){ //登陆 
		
		}else if(setPath.toUpperCase().startsWith("UPDATE")){ //更新用户信息
			
		}else if(setPath.toUpperCase().startsWith("RESETPASSWORD")){ //修改密码 
			
		}else if(setPath.toUpperCase().startsWith("USER-LIST")){ //获取用户列表
			
		}else if(setPath.toUpperCase().startsWith("DELETE")){ //删除用户
			
		}else{
			//返回主页
		}
	}

}
