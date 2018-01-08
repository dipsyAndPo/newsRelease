package org.lesson.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.lesson.dao.DbUserInfo;
import org.lesson.entity.UserInfo;

public class Action_UserInfo extends ActionSupport implements ModelDriven<UserInfo> {
    private UserInfo userInfo=new UserInfo();

    public String login(){
        userInfo= DbUserInfo.getlogin(userInfo.getUame(),userInfo.getUpsw());
        if(userInfo!=null){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }


    public UserInfo getModel() {
        return userInfo;
    }
}
