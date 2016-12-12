package com.omg.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by admin on 2016/11/4.
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        if(name != null && password != null && !"".equals(name) && !"".equals(password)){
            if("admin".equals(name) && password.equals("123")){
                HttpSession session = req.getSession();
                session.setAttribute("name",name);
                session.setAttribute("password",password);
                session.setMaxInactiveInterval(3000);
                Cookie cookie = new Cookie("username",name);
                cookie.setMaxAge(60);
                req.getRequestDispatcher("/success.jsp").forward(req,resp);
            }else {
                resp.sendRedirect(req.getContextPath()+"/error.jsp");
            }
        }else {
            resp.sendRedirect(req.getContextPath()+"/login.jsp");
        }
    }
}
