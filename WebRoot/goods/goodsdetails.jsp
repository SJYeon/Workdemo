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
   	<img src=<s:property value="src" />  height="150px" width="100px"/>
   </s:iterator>
   </s:else>
   <input id="gid" type="hidden" value=${goods.id }>
   <br>
   ${goods.goodsname }<br>
  商场价:${goods.mallvalue }&nbsp;&nbsp;&nbsp;&nbsp;
 商城价:${goods.marketvalue }<br>
 商品热度:${goods.craze }&nbsp;&nbsp;&nbsp;&nbsp;
 商品好评度:${goods.niceinfo }<br>
 数量：<input id="bnsum" name="bnsum" onblur=buynow(this) value="1"> 库存(${goods.totalnum })
 <br>
 <script type="text/javascript">
 	function buynow(a){
 		var bnsum=document.getElementById("bnsum").value;
 		var gid=document.getElementById("gid").value;
 		//alert(gid);
 		var a=document.getElementById("bn");
 		a.href="buynow?goodsid="+gid+"&bnsum="+bnsum;
 	}
 </script>
 <a href="#">加入购物车</a>&nbsp;&nbsp;&nbsp;&nbsp;
 <a id="bn" href="buynow?goodsid=${goods.id}&bnsum=1">直接购买</a>
  
  </body>
</html>
