package org.lesson.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {
    private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url="jdbc:sqlserver://localhost:1433;DatabaseName=newPro";
    private static String user = "sa";
    private static String password = "123456";
    private static Connection conn=null;

    public static Connection openConn(){
        try {
            Class.forName(driver);
            conn= DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConn(){
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conn=null;
        }
    }


}
