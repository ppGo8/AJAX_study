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
 * @描述： 发送ajax请求动态展示学院列表,处理来自06.html的请求
 **/

@WebServlet("ajaxrequest6")
public class AjaxRequest6Servlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        // 连接数据库，展示学员信息，拼接HTML代码（这里就不连接数据库，写死了）
//        response.setContentType("text/html;charset=utf-8");
//        PrintWriter out = response.getWriter();
//
//        // 连接数据库,拼接HTML代码
//        StringBuffer html = new StringBuffer();
//
//        // 目前存在的缺点：在后端拼接前端的html代码不好维护
//        html.append("<tr>");
//        html.append("<tr>");
//        html.append("<td>1</td>");
//        html.append("<td>张三</td>");
//        html.append("<td>22</td>");
//        html.append("<td>广州天河区</td>");
//        html.append("</tr>");
//        html.append("<tr>");
//        html.append("<td>2</td>");
//        html.append("<td>李四</td>");
//        html.append("<td>24</td>");
//        html.append("<td>广州番禺区</td>");
//        html.append("</tr>");
//
//        out.println(html); // 会自动把html转换成字符型
//
//    }
}
