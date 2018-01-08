package org.lesson.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.lesson.dao.DbComment;
import org.lesson.dao.DbNews;
import org.lesson.entity.Comment;
import org.lesson.entity.News;

import java.util.List;

public class Action_News extends ActionSupport implements ModelDriven<News> {

    private News news=new News();
    private Comment comment= new Comment();
    private List<Comment> comments=null;
    private List<News> newss=null;

    public String addNews(){

        if (DbNews.addNews(news)){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }

    public String selectAll(){
        newss= DbNews.getNews();
        if(newss.size()>0){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }
    public String getById(){

        news=DbNews.getById(news.getNid());
        comments= DbComment.GetComment(news.getNid());
        System.out.println(news);
        return SUCCESS;
    }




    public News getModel() {
        return news;
    }

    public List<News> getNewss() {
        return newss;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public Comment getComment() {
        return comment;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void setNewss(List<News> newss) {
        this.newss = newss;
    }

}
