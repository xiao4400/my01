<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/21 0021
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ include file="/common/head.jsp"%>
</head>
<body>
<h1>图片上传</h1>
<f:form action="${ctx}/sys/file/upload" method="post" enctype="multipart/form-data" modelAttribute="MyfileVo" >
    <input type="file" name="img" />
    <f:hidden path="bookId" />
    <input type="submit" value="上传" />
</f:form>
</body>
</html>
