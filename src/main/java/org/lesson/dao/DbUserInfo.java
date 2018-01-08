package org.lesson.dao;

import org.lesson.entity.UserInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUserInfo {
    private static PreparedStatement statement=null;
    private static Connection conn=null;
    private static ResultSet set=null;

    public static UserInfo getlogin(String uame,String upsw){
        UserInfo userInfo=null;
        conn=DbConn.openConn();
        String sql="select * from userinfo where uame=? and upsw=? ";
        try {
            statement=conn.prepareStatement(sql);
            statement.setString(1,uame);
            statement.setString(2,upsw);
            set=statement.executeQuery();
            while(set.next()){
                int uid=set.getInt("uid");
                String urealname=set.getString("urealname");
                userInfo=new UserInfo(uid,uame,upsw,urealname);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeAll();
        return userInfo;
    }

    public static void closeAll(){
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(set!=null){
            try {
                set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        set=null;
        statement=null;
    }
}
