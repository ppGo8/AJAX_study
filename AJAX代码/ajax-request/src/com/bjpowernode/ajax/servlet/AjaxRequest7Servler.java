package com.bjpowernode.ajax.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * @时间: 2023-05-14
 * @作者： ppgo8
 * @描述： 对6进行改进:访问数据库中的数据,手动拼接为JSON字符串,返回给前端；
 **/

@WebServlet("/ajaxrequest5")
public class AjaxRequest7Servler extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // 连接数据库,查询所有的学生
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        // 为拼接json做准备
        StringBuilder json = new StringBuilder();
        String jsonStr = "";

        try {
            // 1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","1234");
            // 3.获取数据库操作对象
            String sql = "select name,age,addr from t_stu";
            ps = conn.prepareStatement(sql);
            // 4.执行查询
            rs = ps.executeQuery();
            // 5.处理结果集
            json.append("[");
            while (rs.next()){
                // 获取每个学生的信息
                String name = rs.getString("name");
                String age = rs.getString("age");
                String addr = rs.getString("addr");
                // 手动拼接JSON字符串,示例数据 [{"name":"张三","age":22,"addr":"番禺区" },{"name":"张三","age":22,"addr":"番禺区" }]
                // 一共7段落 {"name":"    张三    ","age":    22    ,"addr":"    番禺区    "},
                json.append("{\"name\":\" ");
                json.append(name);
                json.append("\",\"age\":");
                json.append(age);
                json.append(",\"addr\":\"");
                json.append(addr);
                json.append("\"},");    // 注意最后一行的数据需要删掉逗号
            }
            json.append("]");
            // 不想要逗号 但是没办法直接删除逗号；于是直接把逗号及之后字母都删除了，再把误删的需要的补充回来
            jsonStr = json.substring(0, json.length() - 2) + "]";

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6.释放数据
            if (rs!= null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps!= null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!= null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        // 后端响应JSON字符串给前端
        out.print(jsonStr);

    }
}
