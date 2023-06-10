package com.tuling.part1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet("/requestDemo4")
public class RequestDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求的参数
        String username = request.getParameter("username");
        System.out.println("RequestDemo4 获取的username:"+username);
        //数据的共享
        request.setAttribute("msg","Hello");
        //请求转发
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/requestDemo5");
//        requestDispatcher.forward(request,response);
        request.getRequestDispatcher("/requestDemo5").forward(request,response);
    }
}
