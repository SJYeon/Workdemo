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
    
    <title>My JSP 'cginfolist.jsp' starting page</title>
    
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
  <a href="addcginfo.jsp">添加收货人信息</a>
  地址列表：<br>

 	<s:iterator value="cgList" status="st" >
 	 收货人姓名: <s:property value="name" />&nbsp;&nbsp;&nbsp;
 	收货人手机:<s:property value="phone"/>&nbsp;&nbsp;&nbsp;
 	收货地址:<s:property value="address"/>&nbsp;&nbsp;&nbsp;
 	</s:iterator>
  </body>
</html>
