package com.tuling.part1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;


@WebServlet("/requestDemo3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求编码
        request.setCharacterEncoding("utf-8");

        //a. String getParameter(String name):根据参数名称获取参数值    username=zs&password=123
        String username = request.getParameter("username");
        System.out.println("username:"+username);
        String password = request.getParameter("password");
        System.out.println("password:"+password);
        //b. String[] getParameterValues(String name):根据参数名称获取参数值的数组  hobby=xx&hobby=game
        String[] loves = request.getParameterValues("love");
        System.out.println("loves:"+ Arrays.toString(loves));

        System.out.println("-------------------------");
        //c. Enumeration<String> getParameterNames():获取所有请求的参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String paramName = parameterNames.nextElement();
            String[] parameterValues = request.getParameterValues(paramName);
            System.out.println(paramName+":"+Arrays.toString(parameterValues));
        }
        System.out.println("-------------------------");
        //d. Map<String,String[]> getParameterMap():获取所有参数的map集合
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            System.out.println(entry.getKey()+":"+Arrays.toString(entry.getValue()));
        }

    }
}
