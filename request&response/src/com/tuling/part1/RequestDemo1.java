package com.tuling.part1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //获取请求行的信息

//        a. 获取请求方式 ：GET
//        • String getMethod()
        String method = request.getMethod();
        System.out.println("请求方式："+method);
//        b. 获取虚拟目录：/day21
//        • String getContextPath()
        String contextPath = request.getContextPath();
        System.out.println("项目访问路径:"+contextPath);
//        c. 获取Servlet路径: /demo1
//        • String getServletPath()

        String servletPath = request.getServletPath();
        System.out.println("servlet的访问路径："+servletPath);


//        d. 获取get方式请求参数：name=zhangsan
//        • String getQueryString()
        String queryString = request.getQueryString();
        System.out.println("get方式的请求参数："+queryString);
//        e. 获取请求URI：/day21/demo1
//        • String getRequestURI():		/day21/demo1
        String requestURI = request.getRequestURI();
        System.out.println("requestURI:"+requestURI);
//        • StringBuffer getRequestURL() :http://localhost/day21/demo1
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("requestURL:"+requestURL);
//      f. 获取协议及版本：HTTP/1.1
//        • String getProtocol()
        String protocol = request.getProtocol();
        System.out.println("protocol:"+protocol);
//      g. 获取客户机的IP地址：
//        • String getRemoteAddr()
        String remoteAddr = request.getRemoteAddr();
        System.out.println("remoteAddr:"+remoteAddr);

        //
    }
}
