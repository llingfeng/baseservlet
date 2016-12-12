package com.omg.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by admin on 2016/11/4.
 */
public class LoginFilter implements Filter {
    private FilterConfig config;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        req.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        String noLoginPaths = config.getInitParameter("NoLoginPaths");
        if(noLoginPaths != null && !"".equals(noLoginPaths)){
            String[] paths = noLoginPaths.split(";");
            for (String path : paths) {
                if(path == null || "".equals(path)) continue;
                if(request.getRequestURI().indexOf(path) != -1){
                    filterChain.doFilter(req,resp);
                    return;
                }
            }
        }
        String name = (String) session.getAttribute("name");
        if(name != null && !"".equals(name)){
            filterChain.doFilter(req,resp);
        }else {
            response.sendRedirect(request.getContextPath()+"/login.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
