package org.lesson.entity;

public class UserInfo {
    private int uid;
    private String uame;
    private String upsw;
    private String urealname;

    public UserInfo() {
        super();
    }

    public UserInfo(int uid) {
        this.uid = uid;
    }


    public UserInfo(int uid, String uame, String upsw, String urealname) {
        this.uid = uid;
        this.uame = uame;
        this.upsw = upsw;
        this.urealname = urealname;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uid=" + uid +
                ", uame='" + uame + '\'' +
                ", upsw='" + upsw + '\'' +
                ", urealname='" + urealname + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUame() {
        return uame;
    }

    public void setUame(String uame) {
        this.uame = uame;
    }

    public String getUpsw() {
        return upsw;
    }

    public void setUpsw(String upsw) {
        this.upsw = upsw;
    }

    public String getUrealname() {
        return urealname;
    }

    public void setUrealname(String urealname) {
        this.urealname = urealname;
    }
}
