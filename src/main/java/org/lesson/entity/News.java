package org.lesson.entity;

public class News {

    private int nid;
    private int uid;
    private String ntitle;
    private String ncontext;
    private String ntime;
    private String urealname;

    public News() {
        super();
    }

    public News(int nid, int uid, String ntitle, String ncontext, String ntime) {
        this.nid = nid;
        this.uid = uid;
        this.ntitle = ntitle;
        this.ncontext = ncontext;
        this.ntime = ntime;
    }

    public News(int nid, int uid, String ntitle, String ncontext, String ntime, String urealname) {
        this.nid = nid;
        this.uid = uid;
        this.ntitle = ntitle;
        this.ncontext = ncontext;
        this.ntime = ntime;
        this.urealname = urealname;
    }

    @Override
    public String toString() {
        return "News{" +
                "nid=" + nid +
                ", uid=" + uid +
                ", ntitle='" + ntitle + '\'' +
                ", ncontext='" + ncontext + '\'' +
                ", ntime='" + ntime + '\'' +
                ", urealname='" + urealname + '\'' +
                '}';
    }

    public String getUrealname() {
        return urealname;
    }

    public void setUrealname(String urealname) {
        this.urealname = urealname;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public String getNcontext() {
        return ncontext;
    }

    public void setNcontext(String ncontext) {
        this.ncontext = ncontext;
    }

    public String getNtime() {
        return ntime;
    }

    public void setNtime(String ntime) {
        this.ntime = ntime;
    }
}
