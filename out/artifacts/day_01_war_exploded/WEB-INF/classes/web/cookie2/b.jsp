<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除cookie</title>
</head>
<body>
<h1>删除cookie</h1>
<%
Cookie cookie1=new Cookie("aaa","AAA");
cookie1.setMaxAge(0);
 response.addCookie(cookie1); 

	
%>
</body>
</html>