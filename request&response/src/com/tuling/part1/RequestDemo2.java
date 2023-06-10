package com.tuling.part1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;


@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //1，
//        • String getHeader(String name):通过请求头的名称获取请求头的值
//        • Enumeration<String> getHeaderNames():获取所有的请求头名称
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String headName = headerNames.nextElement();
            String headValue = request.getHeader(headName);
            System.out.println(headName+":"+headValue);
        }
        //request.getHeader("user-agent");
    }
}
