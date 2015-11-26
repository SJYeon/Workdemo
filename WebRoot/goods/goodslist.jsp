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
    
    <title>商品列表</title>
    
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
    搜索结果：<br>
    <s:iterator value="searchList" status="st" >
	  <s:if test="goodspicses.size==0 || goodspicses==null">
	  <a href="#"><img src="./images/1.jpg" height="150px" width="100px"/></a>	
	  </s:if>
	  <s:else>
		  <s:iterator value="goodspicses" status="st1">
		  	<s:if test="#st1.count==0">
		  		<img src=<s:property value="src" />  height="60px" width="45px"/>
		  	</s:if>
		  </s:iterator>
	  </s:else>
	  <br>
	  <s:property value="goodsname"/>
	  <br>
	  市场价:<s:property value="mallvalue"/>
	  &nbsp;&nbsp;&nbsp;
	 商城价:<s:property value="marketvalue"/>
  </s:iterator>
  </body>
</html>
