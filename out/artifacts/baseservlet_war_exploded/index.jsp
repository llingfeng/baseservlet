<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/11/3
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>标题</title>
</head>
<body>
welcome this is page gogogo
<%
    int[] num = {1, 2, 3, 4};
    request.setAttribute("num", num);
%>
<br>
<c:forEach items="${num}" var="item" varStatus="status" step="2">
    ${status.index}&nbsp;${item}<br>
</c:forEach>
<%--注意：step为循环的步长。每次隔两个单位输出一个。--%>
<br>
<br>
<jsp:useBean id="test" class="com.omg.bean.SimpleBean"></jsp:useBean>
<jsp:setProperty name="test" property="message"></jsp:setProperty>
SimpleBean:
<jsp:getProperty name="test" property="message"></jsp:getProperty>

<%
    int count = 1;
%>
count:<%= ++count%>
</body>
</html>
