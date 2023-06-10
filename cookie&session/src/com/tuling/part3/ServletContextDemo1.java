package com.tuling.part3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet("/servletContextDemo1")
public class ServletContextDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




        //1,首先获取ServletContext
        //ServletContext servletContext = this.getServletContext();
        ServletContext servletContext = request.getServletContext();
        //2,共享数据
        Integer count = (Integer) servletContext.getAttribute("count");
        if(count==null){
            count=1;
            servletContext.setAttribute("count",1);

        }else{
            count++;
            servletContext.setAttribute("count",count);
        }

        //3，将访问的次数响应到前端页面上
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("应用被访问了"+count+"次");


        //获取项目的真实路径
        String realpath=servletContext.getRealPath("/");

        System.out.println("realpath:"+realpath);
        System.out.println("上下文路径："+servletContext.getContextPath());//上下文路径（应用程序名称）
    }
}
