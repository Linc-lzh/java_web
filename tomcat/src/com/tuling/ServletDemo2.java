package com.tuling;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo2  implements Servlet {
    /**
     * 当我第一次访问servlet的时候，会初始化Servlet示例，而且只执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init()......");
    }

    /**
     * 获取配置
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务的方法，也就是真正处理请求，返回响应的方法，每一次请求都会调用一次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("ServletDemo2  service()......");
//        int i = 10/0;

    }

    /**
     * 获取Servlet的一些信息
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁的方法，也就是tomcat正常停止的时候，会在销毁Servlet实例之前调用destroy
     */
    @Override
    public void destroy() {
        System.out.println("destroy()......");
    }
}
