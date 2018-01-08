<%--
  Created by IntelliJ IDEA.
  User: 大根同学
  Date: 2018/1/5
  Time: 1:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="lib/bootstrap-3.3.7/css/bootstrap.min.css">
    <script type="text/javascript" src="lib/jquery-1.12.4/jquery1.12.4.min.js"></script>
    <script type="text/javascript" src="lib/bootstrap-3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/allpage.js"></script>
    <link rel="stylesheet" href="css/allpage.css">
</head>
<body>
<img src="images/logo.png" style="float: left">
<div class="text-center form-group text-center container">
    <h1>新闻娱乐网</h1>
    <ul class="nav nav-tabs">
        <li><a href="index.jsp">登录</a></li>
        <li><a href="selectAll">新闻展示</a></li>
        <li class="active"><a href="addNews.jsp">新闻发布</a></li>
        <li><input type="text" placeholder="输入你要搜索的新闻" class="form-control"> </li>
        <li class="text-right"><button class="btn btn-info btn-search" onclick="select()">查找</button></li>
    </ul>

    <div align="center" class="">
        <h3><b>${News.ntitle}</b></h3>
        <h5>发布人:${News.urealname}发布时间:${news.ntime}</h5>
        <p class="">${news.ncontext}</p>
    </div>
<hr>
    <form action="addComment" method="post">
        <input type="text" name="nid" style="display: none" value="${News.nid}">
        <h3>留言板</h3>
        <hr>
    <div class="container ">
        <c:forEach items="${comments}" var="li">
            <div style="width: 800px" class="table-bordered row center-block">
                <div class="col-md-3">
                <img src="images/${li.cimg}" class="imgcss img-circle"><br>
                </div>
                <br>
                <span><b><a href="#">${li.cname}</a></b>&nbsp; 第${li.cid}楼 </span>
                <div class="divsize ">
                <p>${li.ccontext}</p>
                </div>
                    ${li.ctime} &nbsp; <a href="#">回复</a> &nbsp; <a href="#">送礼</a>
            </div>
        </c:forEach>
    </div>
<br><br>
        <table class="table table-bordered">
            <tr>
                <td>选择头像</td>
                <td>
                    <input type="radio" name="cimg" value="ico1.png" ><img src="images/ico1.png" class="img-circle"> &nbsp;
                    <input type="radio" name="cimg" value="ico2.png" ><img src="images/ico2.png" class="img-circle"> &nbsp;
                    <input type="radio" name="cimg" value="ico3.png" ><img src="images/ico3.png" class="img-circle"> &nbsp;
                    <input type="radio" name="cimg" value="ico4.png" ><img src="images/ico4.png" class="img-circle"> &nbsp;
                </td>
            </tr>
            <tr>
                <td>你的名字：</td>
                <td><input type="text" name="cname" class="form-control"></td>
            </tr>
            <tr>
                <td>请输入你的留言</td>
                <td>
                    <textarea class="form-control" rows="3" name="ccontext"></textarea>
                </td>
            </tr>
            <tr><td colspan="2" class="text-center"><input type="submit" value="提交" class="btn-success btn btn-block"></td></tr>
        </table>
    <s:debug></s:debug>
</div>
</form>
</body>
</html>
