package com.bjpowernode.ajax.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @时间: 2023-05-15
 * @作者： ppgo8
 * @描述： 对应07-使用XML交换数据.html
 *       学员信息动态显示
 *       后端返xml字符串
 **/
@WebServlet("/ajaxrequest7")
public class AjaxRequest8Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 设置响应类型：xml
        response.setContentType("text/xml;charset=utf-8");
        PrintWriter out = response.getWriter();

        // 返回数据，这里就不连接数据库了直接写死
        StringBuilder xml = new StringBuilder();
        xml.append("<students><student>");
        xml.append("<name>张三</name>");
        xml.append("<age>22</age>");
        xml.append("<addr>天河区</addr>");
        xml.append("</student>");
        xml.append("<student>");
        xml.append("<name>李四</name>");
        xml.append("<age>23</age>");
        xml.append("<addr>番禺区</addr>");
        xml.append("</student>");
        xml.append("</students>");
        // 返回
        out.print(xml);
    }
}
