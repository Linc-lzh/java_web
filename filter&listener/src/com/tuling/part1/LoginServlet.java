package com.tuling.part1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
        //1,获取请求参数
        String username = request.getParameter("username");
        System.out.println("username:"+username);

        //2,响应一下
//        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("登录成功,欢迎您，"+username);
    }
}
