<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/14
  Time: 15:46
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h1>请登录</h1>
<% String message="";
    String msg = (String)request.getAttribute("msg");
if(msg!=null){
    message=msg;
}
%>
<font color="red"><%=message%>
</font>
<form action="LoginServlet" method="post">
用户名：<input type ="text" name="username"/><br/>
        <input type="submit" value="提交"/>
</form>
</body>
</html>
