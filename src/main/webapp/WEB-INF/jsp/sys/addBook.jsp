<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/18 0018
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ include file="/common/head.jsp" %>
</head>
<body>
<h1>新增书籍</h1>
<f:form action="${ctx}/sys/book/add" method="post" modelAttribute="book" >
    书名:<f:input path="name" /><br/>
    价格:<f:input path="price" /><br/>
    章节:<f:input path="code" /><br/>
    类型:<f:input path="type" /><br/>
    作者:<f:input path="author" /><br/>
    <f:select path="cid">
        <f:options items="${cid}"></f:options>
    </f:select>
    <input type="submit" value="ok"/>
</f:form>
</body>
</html>
