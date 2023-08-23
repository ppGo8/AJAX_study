package com.bjpowernode.ajax.servlet;

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
 * @描述： 对5进行改进：在后端返回JSON字符串,让前端自己拼接成据;后端不管拼接数据。
 **/

/*@WebServlet("/ajaxrequest5")*/  //这里一定要+/不然会出问题

public class AjaxRequest6Servlet extends HttpServlet {
   /* @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 连接数据库，查询学员信息，拼接HTML代码，响应HTML代码到浏览器（这里就不再连接数据库了，写死了。）
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // 连接数据库，拼接HTML代码
        String jsonStr = "[{\"name\":\"张三\",\"age\":22,\"addr\":\"番禺区\" }, " +
                          "{\"name\":\"李四\",\"age\":24,\"addr\":\"天河区\"}]";
        // 后端响应JSON字符串给前端
        out.print(jsonStr);
    } */
}

