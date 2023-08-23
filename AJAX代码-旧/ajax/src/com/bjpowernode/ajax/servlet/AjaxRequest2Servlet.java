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

@WebServlet("/ajaxrequst2")
public class AjaxRequest2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 设置响应的内容、字符集
        response.setContentType("text/html;charset=UTF-8");
        // 获取响应流
        PrintWriter out = response.getWriter();
        // 响应
        // out.print("<font color=red>用户名已经存在!!!</font>");

        // 获得ajax get请求的数据
        String userid = request.getParameter("userid");
        String pwd = request.getParameter("pwd");

        out.print("用户id:" + userid + "," + "用户密码:" + pwd);
    }
}
