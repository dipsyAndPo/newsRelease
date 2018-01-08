CREATE DATABASE newPro
  GO
USE newPro
  GO
CREATE TABLE userinfo
(
  uid int PRIMARY KEY IDENTITY (1,1),
  uame VARCHAR(50) NOT NULL ,
  upsw VARCHAR(50) NOT NULL ,
  urealname VARCHAR(50) NOT NULL
);
CREATE TABLE news
(
  nid int PRIMARY KEY IDENTITY (1,1),
  uid int REFERENCES userinfo(uid) ,
  ntitle VARCHAR(50) NOT NULL ,
  ncontext VARCHAR(500) NOT NULL ,
  ntime DATETIME NOT NULL DEFAULT (getdate())
)

CREATE TABLE comment
(
  cid int PRIMARY KEY  IDENTITY (1,1),
  nid int REFERENCES news(nid),
  cname VARCHAR(50) NOT NULL ,
  cimg VARCHAR(30) NULL ,
  ccontext VARCHAR(500) NOT NULL ,
  ctime DATETIME NOT NULL DEFAULT (getdate())
)

INSERT INTO userinfo (uame, upsw, urealname) VALUES ('yyt','123','系统管理员');
INSERT INTO news (uid, ntitle, ncontext) VALUES (1,'习近平视察中部战区陆军某师 登上99A坦克','中共中央总书记、国家主席、中央军委主席习近平3日视察中部战区陆军某师，贯彻新时代党的强军思想，大抓实战化军事训练。习近平代表党中央和中央军委，向全体解放军指战员、武警部队官兵、民兵预备役人员致以新年祝福。');
INSERT INTO news (uid, ntitle, ncontext) VALUES (1,'朝韩时隔两年再通话 现场细节首次披露','据CNN报道，（朝韩双方）在呼叫时使用绿色、标有“北”字样的电话听筒，而接电话则使用红色听筒。这两种颜色如有需要时可交换。电脑屏幕上方字样为“南北直通电话”，左右两个时钟分别显示韩国和朝鲜的当地时间。');
INSERT INTO news (uid, ntitle, ncontext) VALUES (1,'刘国中任陕西省代省长','　刘国中被任命为陕西省副省长、代省长]1月4日，省十二届人大常委会第三十九次会议在西安召开。省人大常委会副主任胡悦主持全体会议，副主任姚引良、刘小燕、朱静芝、李晓东、张迈曾、吴前进、李金柱和秘书长韩水岐等出席。 ');

INSERT INTO comment (nid, cname, cimg, ccontext) VALUES (1,'水友1号','**','沙发~~~~');

SELECT userinfo.urealname,news.*
FROM  news LEFT JOIN userinfo ON news.uid = userinfo.uid WHERE nid=1;

drop table userinfo;
drop table news;
DELETE  comment;
