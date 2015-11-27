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
    
    <title>商品详情</title>
    
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
  <s:if test="goods.goodspicses.size==0">
  	<img src="./images/1.jpg" height="150px" width="100px"/>
  </s:if>
  <s:else>
   <s:iterator value="goods.goodspicses" status="st">
   	
   </s:iterator>
   </s:else>
   <br>
   ${goods.goodsname }<br>
  商场价:${goods.mallvalue }&nbsp;&nbsp;&nbsp;&nbsp;
 商城价:${goods.marketvalue }<br>
 商品热度:${goods.craze }&nbsp;&nbsp;&nbsp;&nbsp;
 商品好评度:${goods.niceinfo }<br>
 <a href="#">加入购物车</a>&nbsp;&nbsp;&nbsp;&nbsp;
 <a href="#">直接购买</a>
  </body>
</html>
