<%--
  Created by IntelliJ IDEA.
  User: 大根同学
  Date: 2018/1/5
  Time: 0:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>show</title>
    <link rel="stylesheet" href="lib/bootstrap-3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/allpage.css">
    <script type="text/javascript" src="lib/jquery-1.12.4/jquery1.12.4.min.js"></script>
    <script type="text/javascript" src="lib/bootstrap-3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/allpage.js"></script>

</head>
<body>
<img src="images/logo.png" style="float: left">
<div class="text-center form-group text-center container">
<h1>新闻娱乐网</h1>
    <ul class="nav nav-tabs">
        <li><a href="index.jsp">登录</a></li>
        <li class="active"><a href="selectAll">新闻展示</a></li>
        <li><a href="addNews.jsp">新闻发布</a></li>
        <li><input type="text" placeholder="输入你要搜索的新闻" class="form-control"> </li>
        <li class="text-right"><button class="btn btn-info btn-search" onclick="select()">查找</button></li>
    </ul>

    <table cellpadding="1" class="text-center table tab-content table-bordered table-striped table-hover">
        <thead >
        <tr id="th-center">
            <th>编号</th>
            <th>标题</th>
            <th>发布时间</th>
            <th>发布人</th>
        </tr>
        </thead>
        <tbody class="">
        <c:forEach items="${newss}" var="li">
            <tr>
                <td>${li.nid}</td>
                <td><a href="getById?nid=${li.nid}">${li.ntitle}</a></td>
                <td>${li.ntime}</td>
                <td>${li.urealname}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <h3 class="text-center"><a href="addNews.jsp">发布新闻</a></h3>
</div>
<div class="text-right">
<s:debug></s:debug>
<a href="selectAll">刷新</a>
</div>
</body>
</html>
