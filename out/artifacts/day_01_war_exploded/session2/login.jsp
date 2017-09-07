<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/25
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h1>登录</h1>
<%
    String message = "";
    String msg = (String) request.getAttribute("msg");
    if (msg != null) {
        message = msg;
    }
    String uname = "";
    Cookie[] cookies = request.getCookies();
    for (Cookie c : cookies) {
        if (c.getName().equals("uname")) {
            uname = c.getValue();
        }


    }
%>
<font color="red"><%=message%>
</font>
<%--<font color="red"><%=msg%></font>--%>
<form action="${pageContext.request.contextPath}/LoginServlet" method="post">
    <%--把cookie中用户名显示到输入框中--%>

    <label > 用户名：</label>
    <input type="text" name="username" value="<%=uname%>"/>
    <br/>
    <label width="20px"> 密 &nbsp 码：</label>
    <input type="password" name="password"/>
    <br/>
    <label width="20px"> 验证码：</label>
    <input type="text" name="VerifyCode"/>

    <img src="${pageContext.request.contextPath}/VerifyCodeServlet"/>
    <br/>


    <input type="submit" value="登录"/>
</form>

</body>
</html>
