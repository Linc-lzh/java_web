package com.tuling.part1;

import javax.servlet.*;
import java.io.IOException;

public class FilterDemo1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("在访问Servlet之前执行了....");
        filterChain.doFilter(servletRequest,servletResponse);//放行
        System.out.println("在访问Servlet之后执行了....");
    }

    @Override
    public void destroy() {

    }
}
