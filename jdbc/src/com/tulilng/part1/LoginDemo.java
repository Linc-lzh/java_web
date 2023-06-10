package com.tulilng.part1;

import java.sql.*;
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1，在控制台录入用户名，密码，去数据库查询是否存在记录；如果存在，则登录成功；否则，登录失败
        Scanner scan = new Scanner(System.in);
        System.out.println("请录入用户名：");
        String name = scan.nextLine();
        System.out.println("请输入密码：");
        String pwd = scan.nextLine();


        //1,注册驱动
        //Class.forName("com.mysql.jdbc.Driver");
        //2,获取连接
//        String url = "jdbc:mysql://localhost:3306/tuling";
//        String username = "root";
//        String password = "root";
//        Connection connection = DriverManager.getConnection(url, username, password);
        Connection connection = DBUtils.getConnection();
        //3,获取执行SQL语句的对象
        Statement stmt = connection.createStatement();
        //4,执行SQL
        String sql = "SELECT * FROM users WHERE username= '"+name+"' AND PASSWORD='"+pwd+"'";
        System.out.println("sql:"+sql);
        ResultSet rs = stmt.executeQuery(sql);
        //5,处理结果
        if(rs.next()){//只要有记录，可以判断登录成功
            System.out.println("登录成功");
        }else{
            System.out.println("输入的用户名或者密码错误");
        }

        //6,关闭资源
//        rs.close();
//        stmt.close();
//        connection.close();
        DBUtils.closeAll(connection,stmt,rs);


    }
}
