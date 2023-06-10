package com.tuling.part1;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//@WebFilter(filterName = "FilterDemo3",value = "/*")
public class FilterDemo3 implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("FilterDemo3 的放行之前doFilter.....");
        chain.doFilter(request, response);
        System.out.println("FilterDemo3 的放行之后doFilter.....");
    }
}
