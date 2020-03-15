package com.hogwarts.testcase;
import java.sql.*;
import java.text.ParseException;

public class ConSql {
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载数据库驱动
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    ConSql() {}
//建立数据库连接
    public static Connection getConn(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://192.168.1.21:3306/", "root","root");//连接数据库
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
//断开连接
    public static void closeConn(Connection conn){
        try {
            if(conn != null ){
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Statement getStmt(Connection conn){
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stmt;
    }

    public static PreparedStatement getPStmt(Connection conn,String sql){
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pstmt;
    }

    public static void closeStmt(Statement stmt){
        try {
            if(stmt != null ){
                stmt.close();
                stmt = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ResultSet executeQuery(Statement stmt,String sql){
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static void closeRs(ResultSet rs){
        try {
            if(rs != null ){
                rs.close();
                rs = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet executeQuery(Connection conn,String sql){//重载
        ResultSet rs = null;
        try {
            rs = conn.createStatement().executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    //插入数据
    public static void saveinfo(Object[] data) throws ParseException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn= ConSql.getConn();
            String sql = "insert into xingyuetester.testxing set name=(?),age=(?); ";
            pstmt = ConSql.getPStmt(conn, sql);
            pstmt.setString(1,(String) data[0]);
            pstmt.setString(2, (String) data[1]);
            /*pstmt.setString(3,(String) data[2]);
            pstmt.setString(4,(String) data[3]);
            pstmt.setString(5,(String) data[4]);
            pstmt.setString(6,(String) data[5]);
            pstmt.setString(7 ,(String) data[6]);*/
            pstmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            ConSql.closeStmt(pstmt);
            ConSql.closeConn(conn);
        }
    }
    //查询数据
    public static void findinfo(Object[] data) throws ParseException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn= ConSql.getConn();
            String sql = "SELECT * FROM xingyuetester.testxing WHERE id=12";
            pstmt = ConSql.getPStmt(conn, sql);
            ResultSet rs = pstmt.executeQuery(sql);
            int id;
            String name, age;
            while (rs.next()) {
                try {
                    // 获得id值
                    id = rs.getInt("id");
                    // 获得名字
                    name = rs.getString(2);
                    // 获得年龄
                    age = rs.getString(3);
                    System.out.println("id="+id + ", name=" + name + ", age=" + age);
                } finally {

                }
                if (!rs.next()) break;
                }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            ConSql.closeStmt(pstmt);
            ConSql.closeConn(conn);
        }
    }
}








