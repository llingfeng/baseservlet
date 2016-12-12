package com.omg.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * Created by admin on 2016/11/3.
 */
public class FirstFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter before...");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("doFilter after...");
    }

    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
