<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	${requestScope.failmessage }
    <form action="register" method="post">
    手机号：<input name="users.phone"><br>
    密 码：<input name="users.password" type="password"> <br>
    确认密码：<input type="password"><br>
    邀请人id：<input name="inviterid"> <br>
    邮箱：<input name="users.email"><br>
    所在省：<select name="users.province">
    <option value="陕西">陕西</option>
    </select>
    市：<select name="users.city">
    <option value="西安市">西安市</option>
    </select>
    区： <select name="users.area">
   <option value="雁塔区">雁塔区</option>
    </select>
     具体地点：<select name="users.local">
    <option value="西安电子科技大学老校区">西安电子科技大学老校区</option>
    </select>
    <br>
    <input type="submit" value="注册">
    </form>
  </body>
</html>
