package com.bjpowernode.javaweb.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @时间: 2023-05-14
 * @作者： ppgo8
 * @描述：
 **/
@WebServlet("/request")   //只需要写最低一级的文件路径；不需要加项目名,不然就错了
public class OldRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 响应信息到浏览器
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        // 向浏览器输出HTML代码
        out.print("欢迎学习ajax");
    }
}
