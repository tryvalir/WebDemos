<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/29
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用基于url重写来实现sessionid传递</title>
</head>
<body>
<a href="/day_01/AServlet">点击</a>
<a href="/day_01/AServlet;JSESSIONID=<%=session.getId()%>">点击</a>
<a href="/day_01/AServlet;JSESSIONID=<%=session.getId()%>">点击</a>
<%--实际使用中使用下面的写法，这样第一次访问Aservlet时request中没有jsessionid的cookie时，
会自动添加新创建的session的jsessionid属性，而如果request中已经存在session的cookie,那么就不添加这个属性--%>
<%
out.print(response.encodeURL("/day_01/AServlet"));
%>

</body>
</html>
