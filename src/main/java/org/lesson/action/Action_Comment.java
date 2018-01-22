package org.lesson.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.lesson.dao.DbComment;
import org.lesson.entity.Comment;

public class Action_Comment extends ActionSupport implements ModelDriven<Comment> {

    private Comment comment= new Comment();

    public String addComment(){
        DbComment.addComment(comment)  ;
        return SUCCESS;
    }

    public Comment getModel() {
        return comment;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
