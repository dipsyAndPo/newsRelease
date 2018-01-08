package org.lesson.dao;

import org.lesson.entity.Comment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbComment {
    private static PreparedStatement statement=null;
    private static Connection conn=null;
    private static ResultSet set=null;
    private static List<Comment> comments=null;

    public static List<Comment> GetComment(int nid){
        comments=new ArrayList<Comment>();
        conn=DbConn.openConn();
        String sql="select * from comment where nid=?";
        try {
            statement=conn.prepareStatement(sql);
            statement.setInt(1,nid);
            set=statement.executeQuery();
            while(set.next()){
                int cid=set.getInt("cid");
                String cname=set.getString("cname");
                String cimg=set.getString("cimg");
                String ccontext=set.getString("ccontext");
                String ctime=set.getString("ctime");
                Comment comment=new Comment(cid,nid,cname,cimg,ccontext,ctime);
                comments.add(comment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DbUserInfo.closeAll();
        return comments;
    }

    public static  boolean addComment(Comment comment){
        conn=DbConn.openConn();
        int i=0;
        String sql="INSERT INTO comment (nid, cname, cimg, ccontext) VALUES (?,?,?,?)";
        try {
            statement=conn.prepareStatement(sql);
            statement.setInt(1,comment.getNid());
            statement.setString(2,comment.getCname());
            statement.setString(3,comment.getCimg());
            statement.setString(4,comment.getCcontext());
            i=statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DbUserInfo.closeAll();
        if (i>0){
            return true;
        }else {
            return false;
        }

    }
}
