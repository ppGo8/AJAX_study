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
 * @描述： ajax动态展示学员列表，在后端使用拼接字符串的方式；
 *        AjaxRequest6Servlet后端只返回JSON数组。
 **/

/* @WebServlet("/ajaxrequest5") */  //这里一定要+/不然会出问题
public class AjaxRequest5Servlet extends HttpServlet {
    /* @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 连接数据库，查询学员信息，拼接HTML代码，响应HTML代码到浏览器（这里就不再连接数据库了，写死了。）
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // 连接数据库，拼接HTML代码
        StringBuilder html = new StringBuilder();

        // 目前存在的缺点：在后端的java代码中又开始拼接HTML代码了。显然这是在后端java中写前端的HTML代码。不好维护。
        // 能不能直接将数据返回，给WEB前端数据就行了。让WEB前端能够拿到数据就行，然后页面展示的功能交给WEB前端来处理。
        // 我们后端的java代码能不能只返回数据？？？？可以。（返回数据可以采用JSON的格式，也可以采用XML的格式）
        html.append("<tr>");
        html.append("<td>1</td>");
        html.append("<td>王五</td>");
        html.append("<td>20</td>");
        html.append("<td>北京大兴区</td>");
        html.append("</tr>");
        html.append("<tr>");
        html.append("<td>2</td>");
        html.append("<td>李四</td>");
        html.append("<td>22</td>");
        html.append("<td>北京海淀区</td>");
        html.append("</tr>");

        out.print(html);
    } */
}

