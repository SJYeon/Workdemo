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
    
    <title>商品搜索</title>
    
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
   <form action="searchgoods" method="post">
   <s:if test="address.province == null || address.province ==''">
   	<input type="hidden" name="address.province" value="address.province">
   	<input type="hidden" name="address.city" value="address.city">
   	<input type="hidden" name="address.area" value="address.area">
   	<input type="hidden" name="address.local" value="address.local">
   	${address.local}
   	</s:if>
   	<s:else>
   	<input type="hidden" name="address.province" value="陕西">
   	<input type="hidden" name="address.city" value="西安市">
   	<input type="hidden" name="address.area" value="雁塔区">
   	<input type="hidden" name="address.local" value="西安电子科技大学老校区">
   	西安电子科技大学老校区
   	</s:else>
   	&nbsp;&nbsp;&nbsp;
   	<input name="searchcont" >
   	<input type="submit" value="查询">
   </form>
  </body>
</html>
