<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/8
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>欢迎学习request</title>
  </head>
  <body>
  <a href="/day_04_request/AServlet?xxx=XXX&yyy=YYY">点击这里用get方式显示超链接中参数</a>
  <form action="/day_04_request/AServlet" method="post">
用户：<input type="text" name="username"><br/>
密码：<input type="password" name="password"><br/>
爱好：<input type="checkbox" name="hobby" value="eat">吃饭
  <input type="checkbox" name="hobby" value="sleep">睡觉
  <input type="checkbox" name="hobby" value="program">码代码
  <br/>
      <input type="submit" value="提交">
  </form >
  </body>
</html>
