<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'perinfo.jsp' starting page</title>
    
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
    个人信息 <br>
     ID:${users.id}<br>
    手机号:${users.phone }    <a href="">修改</a><br>
     E-mail:${users.email }    <a href="">验证邮箱</a>  <a href="">修改</a><br>
     所在地：省: ${users.province }  市:${users.city } 区:${users.area } 具体地址: ${users.local }     <a href="">修改</a><br>
     用户类型: <s:if test="#users.usersclass == ordinary">普通用户</s:if>
     <s:else>商家</s:else><br>
     积分: ${users.integral } <br>
     注册时间: ${users.registratetime }
  </body>
</html>
