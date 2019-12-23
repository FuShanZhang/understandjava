package com.zfs.jdbc;

import java.sql.*;

public class JDBCTest01 {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/students?useSSL=false";
    static final String USER = "root";
    static final String PASS = "846915103";

    public static void main(String[] args) {

        Connection conn  = null;
        Statement stmt = null;

        try{
            //注册jdbc驱动
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //执行查询
           // System.out.println("实例话Statement对象");
            stmt = conn.createStatement();
            String sql;
            sql = "select * from student";
            ResultSet rs = stmt.executeQuery(sql);

            //展开结果集数据库
            while (rs.next()){
                //通过字段检索
                int id  = rs.getInt("id");
                String name = rs.getString("name");
                String pwd = rs.getString("pwd");

                //输出数据
                System.out.print("Id: " + id );
                System.out.print(" ,name " + name);
                System.out.println(" , pwd " + pwd);
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       // System.out.println("Goodbye");
    }

}
