package org.lesson.dao;

import org.lesson.entity.News;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbNews {
    private static PreparedStatement statement=null;
    private static Connection conn=null;
    private static ResultSet set=null;
    private static List<News> newss;
    public  static List<News> getNews(){
        newss=new ArrayList<News>();
        conn=DbConn.openConn();
        String sql="SELECT userinfo.urealname,news.* FROM  news LEFT JOIN userinfo ON news.uid = userinfo.uid;";
        try {
            statement=conn.prepareStatement(sql);
            set=statement.executeQuery();
            while(set.next()){
                int nid=set.getInt("nid");
                int uid=set.getInt("uid");
                String ntitle=set.getString("ntitle");
                String ncontext=set.getString("ncontext");
                String ntime=set.getString("ntime");
                String urealname=set.getString("urealname");
                News news=new News(nid,uid,ntitle,ncontext,ntime,urealname);
                newss.add(news);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DbUserInfo.closeAll();
        return newss;
    }

    public static boolean addNews(News news){
        int i=0;
        conn=DbConn.openConn();
        String sql="INSERT INTO news (ntitle, ncontext) VALUES(?,?)";
        try {
            statement=conn.prepareStatement(sql);
            statement.setString(1,news.getNtitle());
            statement.setString(2,news.getNcontext());
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
    //获取一个新闻
    public static News getById(int nid){
        News news=new News();
        conn=DbConn.openConn();
        String sql="SELECT userinfo.urealname,news.* FROM  news LEFT JOIN userinfo ON news.uid = userinfo.uid where nid=?";
        try {
            statement=conn.prepareStatement(sql);
            statement.setInt(1,nid);
            set=statement.executeQuery();
            while(set.next()){
                int uid=set.getInt("uid");
                String ntitle=set.getString("ntitle");
                String ncontext=set.getString("ncontext");
                String ntime=set.getString("ntime");
                String urealname=set.getString("urealname");
                news=new News(nid,uid,ntitle,ncontext,ntime,urealname);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DbUserInfo.closeAll();
        return news;
    }

}
