package com.tuling.part1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;


@WebServlet("/cookieDemo1")
public class CookieDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1,创建Cookie对象
        //Cookie cookie = new Cookie("data","zhangsan");
        //特殊字符的问题
        //Cookie cookie = new Cookie("data","hello,msg");
        Cookie cookie = new Cookie("data", URLEncoder.encode("hello,msg","UTF-8"));
        cookie.setMaxAge(60);//单位是s
        //2,通过response发送数据到客户端
        response.addCookie(cookie);
    }
}
