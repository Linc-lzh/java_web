package com.tuling.part2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet("/sessionDemo1")
public class SessionDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1,获取Session对象
        HttpSession session = request.getSession();
        System.out.println("session.id:"+session.getId());
        //2,共享数据
        //session.setAttribute("data","zhoujielun");
        session.setAttribute("data","hello,msg");//可以存中文吗？

        //设置一下session的超时时间
        //session.setMaxInactiveInterval(10);
        //session.invalidate();
    }
}
