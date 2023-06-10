package com.tulilng.part1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 工具类，Arrays，Collections
 */
public class DBUtils {
    private static Properties properties = null;
    //只需要加载一次，而且是在所有的方法调用之前加载
    static{

         properties = new Properties();
        //因为这个数据库的配置文件属于源码的一部分，那么我更习惯将配置放在src这个路径下
        InputStream is = DBUtils.class.getClassLoader().getResourceAsStream("db.properties");

        //1,注册驱动
        try {
            properties.load(is);
            Class.forName(properties.getProperty("driverClass"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    /**
     * 获取连接方法
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        //2,获取连接
//        String url = "jdbc:mysql://localhost:3306/tuling";
//        String username = "root";
//        String password = "root";

        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    /**
     * 关闭资源
     * @param connection
     * @param stmt
     * @param rs
     */
    public static void closeAll(Connection connection, Statement stmt, ResultSet rs) {
        //先开后关闭
        try {
            if(rs!=null){
                rs.close();
            }
            if(stmt!=null){
                stmt.close();
            }
            if(connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("url:"+url);
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }
}
