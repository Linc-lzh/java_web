package com.tuling.part2;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ListenerDemo1 implements ServletContextListener {
    /**
     * 当ServletContext对象创建的时候，会调用
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象创建contextInitialized...");
        ServletContext servletContext = servletContextEvent.getServletContext();
        String contextLoadConfig = servletContext.getInitParameter("contextLoadConfig");
        System.out.println("contextLoadConfig:"+contextLoadConfig);
    }

    /**
     * 当ServletContext对象销毁的时候，会调用
     * @param servletContextEvent
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象销毁的contextDestroyed...");
    }
}
