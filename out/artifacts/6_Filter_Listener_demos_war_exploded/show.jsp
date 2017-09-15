
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/14
  Time: 11:03
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示所有ip访问过的servlet的次数</title>
</head>
<body>
<table align="center" width="60%" border="1">
    <tr>
        <th>ip</th>
        <th>次数</th>
    </tr>
    <c:forEach items="${applicationScope.map}" var="entry">
    <tr>
        <td>${entry.key}</td>
        <td>${entry.value}</td>
    </tr>
        </c:forEach>
</table>
</body>
</html>
