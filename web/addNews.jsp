<%--
  Created by IntelliJ IDEA.
  User: 大根同学
  Date: 2018/1/4
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" href="lib/bootstrap-3.3.7/css/bootstrap.min.css">
    <script type="text/javascript" src="lib/jquery-1.12.4/jquery1.12.4.min.js"></script>
    <script type="text/javascript" src="lib/bootstrap-3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/allpage.js"></script>
    <link rel="stylesheet" href="css/allpage.css">
</head>
<body>
<form action="addNews" method="post" role="form">
    <img src="images/logo.png" style="float: left">
    <div class="form-group text-center container" >
        <h1>新闻娱乐网</h1>

        <ul class="nav nav-tabs">
            <li><a href="index.jsp">登录</a></li>
            <li><a href="selectAll">新闻展示</a></li>
            <li class="active"><a href="addNews.jsp">新闻发布</a></li>
            <li><input type="text" placeholder="输入你要搜索的新闻" class="form-control"> </li>
            <li class="text-right"><button class="btn btn-info btn-search" onclick="select()">查找</button></li>
        </ul>
        <h3>发布你的新闻</h3>

        <table align="center" class="table-bordered table  text-center">
            <tr>
                <td>新闻标题:</td>
                <td><input type="text" name="ntitle" class="form-control" placeholder="请输入新闻的标题"></td>
            </tr>
            <tr>
                <td>新闻内容:</td>
                <td>
                    <textarea name="ncontext" class="form-control" rows="3"></textarea>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="登录" class="btn btn-success btn-block"></td>
            </tr>
        </table>
    </div>
</form>
<a href="selectAll">刷新</a>
</body>
</html>
