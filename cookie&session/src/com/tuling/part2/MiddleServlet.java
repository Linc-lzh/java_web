package com.tuling.part2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet("/middleServlet")
public class MiddleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //3，获取session共享的信息
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("username");
        //响应乱码
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("欢迎您，"+username);
    }
}
