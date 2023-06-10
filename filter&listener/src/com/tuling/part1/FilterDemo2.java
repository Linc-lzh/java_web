package com.tuling.part1;

import javax.servlet.*;
import java.io.IOException;

public class FilterDemo2 implements Filter {
    /**
     * 初始化的方法，只执行一次；在服务器启动后，会创建Filter对象，然后调用init方法。只执行一次。用于加载资源
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init()方法....");
    }

    /**
     * 每一次请求被拦截资源时，会执行。执行多次
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter。。。");
    }

    /**
     * 在服务器关闭后，Filter对象被销毁。如果服务器是正常关闭，则会执行destroy方法。只执行一次。用于释放资源
     */
    @Override
    public void destroy() {
        System.out.println("destroy()...");
    }
}
