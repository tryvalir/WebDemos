<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/25
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功页面1</title>
</head>
<body>
<%
    String username = (String) session.getAttribute("username");
    if (username == null) {
        request.setAttribute("msg","您还没有登录，请重新登录");
        request.getRequestDispatcher("/session2/login.jsp").forward(request,response);
        return;
    }
%>
<h1>成功登录啦！></h1>

欢迎<%=session.getAttribute("username")%>小同学登录页面


</body> </html>
