<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/11/4
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/login" method="post">
        用户名：<input type="text" name="name">
        密码：<input type="text" name="password">
        <input type="submit" value="提交">
    </form>
</body>
</html>
