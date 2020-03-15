package com.hogwarts.testcase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

    public class SelectSql {
        public static void main(String[] args) {
            try {
                // 加载数据库驱动
                Class.forName("com.mysql.jdbc.Driver");
                // 声明数据库db_database17的URL
                String url = "jdbc:mysql://192.168.1.21:3306/";
                // 数据库用户名
                String user = "root";
                // 数据库密码
                String password = "root";

                // 建立数据库连接，获得连接对象conn
                Connection conn = DriverManager.getConnection(url, user, password);
                // 创建一个 Statment对象
                Statement stmt = conn.createStatement();

                // 生成一条sql语句
                String sql = "SELECT * FROM xingyuetester.testxing ";
                // 执行查询，把查询的结果赋值给结果集对象
                ResultSet rs = stmt.executeQuery(sql);

                // 声明两个变量分别表示id和年龄
                int id;
                // 声明3个变量分别表示用户名，密码和性别
                String name, age;
                // "\t"等价于8个空格
                System.out.println("id\t名字\t年龄");
                // 遍历结果集
                while (rs.next()) {
                    // 获得id值
                    id = rs.getInt("id");
                    // 获得用户名
                    name = rs.getString(2);
                    // 获得密码
                    age = rs.getString("age");
                    System.out.println(id + "\t" + name + "\t" + age);
                }

            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }


