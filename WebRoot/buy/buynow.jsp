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
    
    <title>直接购买</title>
    
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
    <form action="" method="post">
     选择收货地址:<br>
     <s:iterator value="cglist" status="st">
     	<s:if test="#st.count==1">
    
     		<input name="" checked="checked" type="radio" value="${address}${' ' }${name }${' ' }${phone}"  >
     	<s:property value="address"/>&nbsp;&nbsp;&nbsp;<s:property value="name"/>&nbsp;&nbsp;<s:property value="phone"/>
     	</s:if>
     	<s:else>
     		<input name="" type="radio" value=<s:property value="address"/>+"  "+<s:property value="name"/>+"  "+<s:property value="phone"/> />
     		<s:property value="address"/>&nbsp;&nbsp;&nbsp;<s:property value="name"/>&nbsp;&nbsp;&nbsp;<s:property value="phone"/>
     	</s:else>
     </s:iterator>
     <br>
     商品详情：<br>
     商店:${bngoods.proxys.teamname }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
  <s:iterator value="bngoods.goodspicses" status="st">
  	<s:if test="#st.count==1">
  		<img src=<s:property value="src"/> height="150px" width="100px"/>
  	</s:if>
  </s:iterator> 
  <br>
  ${bngoods.goodsname }
  <br>
  单价:${bngoods.marketvalue }
  <br>
  购买数量：${bnsum }
  <br>
  总价:${bnsum*bngoods.marketvalue}
  <br>
  <input type="submit" value="提交">
    </form>
  </body>
</html>
