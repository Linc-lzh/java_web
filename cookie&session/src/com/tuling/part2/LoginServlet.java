package com.tuling.part2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //1,获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //2,调用业务逻辑层获取处理
        HttpSession session = request.getSession();
        //响应乱码
        response.setContentType("text/html;charset=utf-8");
        if(("admin".equals(username)&&"123".equals(password))||("zhangsan".equals(username)&&"123".equals(password))){//这种写法可以避免空指针
            //登录成功，保存用户的登录信息
            session.setAttribute("username",username);
            //重定向，两次请求
            response.sendRedirect("/cookie_session/middleServlet");
        }else{
            //直接响应登录失败的信息
            PrintWriter writer = response.getWriter();
            writer.write("用户名或者密码错误，请重新登录!!");
        }
    }
}
