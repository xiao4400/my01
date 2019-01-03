<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/19 0019
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书本查询</title>
    <%@ include file="/common/head.jsp"%>
</head>
<body>
<f:form action="${ctx}/sys/book/list" method="post" modelAttribute="book" >
    书名:<f:input path="name" /><br/>
    <input type="submit" value="ok"/>
</f:form>
<table border="1px">
<tr>
    <td>书名</td>
    <td>作者</td>
    <td>章节</td>
    <td>价格</td>
    <td>类型</td>
    <td>操作</td>
</tr>
<c:forEach var="v" items="${bookList}" >
    <tr>
        <td>${v.name}</td>
        <td>${v.author}</td>
        <td>${v.code}</td>
        <td>${v.price}</td>
        <td>${v.type}</td>
        <td>......</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
