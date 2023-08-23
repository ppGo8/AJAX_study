package com.bjpowernode.ajax.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @时间: 2023-05-11
 * @作者： ppgo8
 * @描述：
 **/
@WebServlet("/ajaxrequest4")
public class AjaxRequest3Servlet extends HttpServlet {
    @Override
    // 注意下面是doPost请求；如果前端发送的请求和后端处理的方式不一致，会返回405错误
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // out.print("<font color=red>用户名已经存在</font>");
        // 获取前端提交的数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 返回给前端
        out.print("用户名是："+username+"密码是:"+password);
    }
}
