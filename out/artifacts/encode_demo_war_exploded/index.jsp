<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/15
  Time: 9:24
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用filter解决全站乱码问题</title>
  </head>
  <body>
  <a href="/encode_demo/AServlet?username=欧阳哈哈哈哈">get请求</a>
  <form action="/encode_demo/AServlet" method="post">
   输入中文请求参数： <input type="text" name="username"/><br/>
    <input type="submit" value="提交"/>

  </form>
  </body>
</html>
