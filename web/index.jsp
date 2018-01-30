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
  <img src="images/logo.png" style="float: left">
    <form action="login" method="post" role="form">
      <div class="form-group text-center container" >
        <h1>新闻发布后台管理</h1>
        <ul class="nav nav-tabs">
          <li class="active"><a href="index.jsp">登录</a></li>
          <li><a href="selectAll">新闻展示</a></li>
          <li><a href="addNews.jsp">新闻发布</a></li>
          <li><input type="text" placeholder="输入你要搜索的新闻" class="form-control"> </li>
          <li class="text-right"><button class="btn btn-info btn-search" onclick="select()">查找</button></li>
        </ul>
        <h1><small>请登录</small></h1>

        <table align="center" class="table-bordered table  text-center">
          <tr>
            <td>账号:</td>
            <td><input type="text" name="uame" class="form-control" placeholder="请输入账号"></td>
          </tr>


          <tr>

            <td>密码:</td>
            <td><input type="text" name="upsw" class="form-control" placeholder="请输入密码"></td>
          </tr>
          <tr>
            <td colspan="2"><input type="submit" value="登录" class="btn btn-success"></td>
          </tr>
        </table>
      </div>

    </form>
    <a href="selectAll">刷新</a>
  </body>
</html>
