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
  <a href="./cginfo/addcginfo.jsp">添加收货人信息</a>
  地址列表：<br>
  	<s:if test="list.size() == 0">
  	您还没有收货人信息，请添加！
  	</s:if>
 	<s:iterator value="cgList" status="st" >
 	 收货人姓名: <s:property value="name" />&nbsp;&nbsp;&nbsp;
 	收货人手机:<s:property value="phone"/>&nbsp;&nbsp;&nbsp;
 	收货地址:<s:property value="address"/>&nbsp;&nbsp;&nbsp;
 	<a href="deletecginfo?id=<s:property value="id"/>">删除</a>&nbsp;&nbsp;&nbsp;
 	<a href="getcginfobuid?id=<s:property value="id"/>">更新信息</a>
 	<br>
 	</s:iterator>
  </body>
</html>
