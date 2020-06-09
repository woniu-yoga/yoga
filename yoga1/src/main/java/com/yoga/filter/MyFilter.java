package com.yoga.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("into my super filter");
        HttpServletRequest r = (HttpServletRequest)servletRequest;
        MyRequest my = new MyRequest(r);
        filterChain.doFilter(my, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
