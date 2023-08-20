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
 * @时间: 2023-05-11
 * @作者： ppgo8
 * @描述：验证用户名是否存在
 **/
@WebServlet("/ajaxrequest5")
public class AjaxRequest5Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 获取用户名
        String username = request.getParameter("username");
        // 布尔标记
        boolean flag = false;   // 用户名不存在为false
        // 连接数据库验证代码是否可用
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // 1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Success loading sqlserver Driver!");
            // 2.获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", "root", "1234");
            // 3.获取预编译的数据库操作对象
            String sql = "select id,name from t_user where name = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            // 4.执行sql语句
            rs = ps.executeQuery();
            // 5.处理结果集
            if (rs.next()){
                // 用户名已存在
                flag = true;
            }


        } catch(Exception e) {
            System.out.print("Error loading sqlserver Driver!");
            e.printStackTrace();
        } finally {
            // 6.释放资源
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        // 响应结果给浏览器
        response.setContentType("text/html;charser=UTF-8");
        PrintWriter out = response.getWriter();
        if (flag){
            // 用户名存在,不可以用
            out.print("<font color=red>用户名存在,不可以用</font>");
        }else{
            // 用户名不存在,可用
            out.print("<font color=green>用户名不存在,可用</font>");
        }
    }
}
