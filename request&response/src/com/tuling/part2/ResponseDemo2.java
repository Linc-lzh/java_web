package com.tuling.part2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/responseDemo2")
public class ResponseDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //1，获取参数
        String name = request.getParameter("name");
        System.out.println("ResponseDemo2获取参数name:"+name);

        //2,获取共享的数据
        String data = (String)request.getAttribute("data");
        System.out.println("获取request范围共享的数据data："+data);

//        设置服务器端响应的编码格式
//        设置客户端响应内容的头内容的文件类型及编码格式
//        response.setCharacterEncoding("utf-8");
//        response.setHeader("Content-type","text/html;charset=utf-8");
        //推荐的方式
        response.setContentType("text/html;charset=utf-8");
//        //3,响应一下
//        PrintWriter writer = response.getWriter();
//        writer.write("重定向处理完毕，返回浏览器");
        //writer.write("重定向处理完毕，返回浏览器");

//        ServletOutputStream os = response.getOutputStream();
//        os.write("处理完毕".getBytes("utf-8"));
    }
}
