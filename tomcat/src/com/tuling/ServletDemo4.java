package com.tuling;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("ServletDemo4 doGet()....");

        System.out.println("通用处理请求begin....");
        System.out.println(".....");
        System.out.println("通用处理请求end....");
        //doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("ServletDemo4 doPost()....");
//        System.out.println("通用处理请求begin....");
//        System.out.println(".....");
//        System.out.println("通用处理请求end....");
        doGet(req,resp);
    }
}
