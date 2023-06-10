package com.tuling.part2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet("/sessionDemo2")
public class SessionDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //3,获取共享的数据
        HttpSession session = request.getSession();
        System.out.println("session.id:"+session.getId());
        String data = (String)session.getAttribute("data");
        System.out.println("session范围共享的数据data:"+data);
    }
}
