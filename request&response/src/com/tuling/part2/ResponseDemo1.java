package com.tuling.part2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //1，获取参数
        String name = request.getParameter("name");
        System.out.println("ResponseDemo1获取参数name:"+name);

        //2，响应结果给客户端
//        PrintWriter writer = response.getWriter();
//        writer.write("hello,"+name);

        //2，共享数据
        request.setAttribute("data","100");
        //3,重定向
//        response.setStatus(302);//重定向
//        response.setHeader("location","/request_response/responseDemo2");
        response.sendRedirect("/request_response/responseDemo2");//注意：重定向的时候，一定要写项目访问路径
    }
}
