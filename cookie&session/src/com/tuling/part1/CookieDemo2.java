package com.tuling.part1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;


@WebServlet("/cookieDemo2")
public class CookieDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //3,获取其他Servlet共享的数据
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();

            //修改一下cookie的值
//            if(name.equals("data")){
//                cookie.setValue("newzhangsan");
//                response.addCookie(cookie);
//            }
            //删除cookie
//            if(name.equals("data")){
//                cookie.setMaxAge(0);
//                response.addCookie(cookie);
//            }


            //特殊字符的处理
            if(name.equals("data")){
                String value = URLDecoder.decode(cookie.getValue(),"UTF-8");
                System.out.println("有特殊字符的value:"+value);
            }

            //System.out.println(name+":"+value);
        }





    }
}
