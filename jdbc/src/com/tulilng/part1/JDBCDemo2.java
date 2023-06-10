package com.tulilng.part1;

import java.sql.*;

public class JDBCDemo2 {
    public static void main(String[] args) {


        try {
            //1,注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2,连接数据库
            String url = "jdbc:mysql://localhost:3306/tuling";
            String username = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, username, password);

            //3,获取执行SQL的对象
            Statement stmt = connection.createStatement();

            //4,执行SQL
            String sql = "SELECT id,name FROM person";
            //执行后的结果集
            ResultSet resultSet = stmt.executeQuery(sql);
            //5,处理结果
            while(resultSet.next()){
                //一列一列获取
//                int id = resultSet.getInt("id");
                int id = resultSet.getInt(1);//从1开始
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String sex = resultSet.getString("sex");

                System.out.println(id+"-"+name+"-"+age+"-"+sex);
            }

            //6,释放资源
            resultSet.close();
            stmt.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
