<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/18 0018
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第一个页面</title>
    <%@ include file="/common/head.jsp" %>
</head>
<body>
<h1>hello word</h1>
<ul>
    <li><a href="${ctx}/sys/book/toAdd">书本添加</a></li>
    <li><a href="${ctx}/sys/book/list">书本查询</a></li>
</ul>
<div>
    <a href="${ctx}/sys/file/toUpdate">上传图片</a>

</div>
</body>
</html>
