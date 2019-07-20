package com.qf.zhouhaifeng.controller;

import com.qf.zhouhaifeng.service.UserService;
import com.qf.zhouhaifeng.util.ApplicationContextUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher( "/index.jsp" ).forward( req,resp );

        //调用接口方法
        getService().sayHi();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost( req, resp );
    }

   private UserService getService(){

        return (UserService) ApplicationContextUtil.getBean( "userService" );

    }


}
