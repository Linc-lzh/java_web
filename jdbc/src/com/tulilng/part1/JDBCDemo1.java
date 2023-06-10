package com.tulilng.part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1,注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2,连接数据库
        String url = "jdbc:mysql://localhost:3306/tuling";//连接数据库的url
        String username = "root";//连接数据库的用户名
        String password = "root";//连接数据库的密码
        Connection conn = DriverManager.getConnection(url, username, password);
        //3,获取执行SQL语句的对象
        Statement stmt = conn.createStatement();
        //4,定义执行SQL 语句
        //String sql = "INSERT INTO person(NAME,age,sex) VALUES('zhoujielun',33,'男')";
        //String sql = "update person set age =100 where id = 4";
        String sql = "delete from person where id=4";
        int row = stmt.executeUpdate(sql);//执行完会返回受影响的行数
        //5，处理结果
        if(row>=0){
            System.out.println("执行成功");
        }
        //6，释放资源
//        stmt.close();
//        conn.close();
        DBUtils.closeAll(conn,stmt,null);


    }
}
