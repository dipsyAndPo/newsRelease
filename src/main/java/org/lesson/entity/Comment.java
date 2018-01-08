package org.lesson.entity;

public class Comment {
    private int cid;
    private int nid;
    private String cname;
    private String cimg;
    private String ccontext;
    private String ctime;

    public Comment() {
        super();
    }

    public Comment(int cid, int nid, String cname, String cimg, String ccontext, String ctime) {
        this.cid = cid;
        this.nid = nid;
        this.cname = cname;
        this.cimg = cimg;
        this.ccontext = ccontext;
        this.ctime = ctime;
    }


    @Override
    public String toString() {
        return "Comment{" +
                "cid=" + cid +
                ", nid=" + nid +
                ", cname='" + cname + '\'' +
                ", cimg='" + cimg + '\'' +
                ", ccontext='" + ccontext + '\'' +
                ", ctime='" + ctime + '\'' +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg;
    }

    public String getCcontext() {
        return ccontext;
    }

    public void setCcontext(String ccontext) {
        this.ccontext = ccontext;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }
}
