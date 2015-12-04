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
  <!--  
    <form action="bnorder" method="post">
     选择收货地址:<br>
     <s:iterator value="cglist" status="st">
     	<s:if test="#st.count==1">
    
     		<input name="orders.orderaddress.address" checked="checked" type="radio" value="${address}${' ' }${name }${' ' }${phone}"  >
     	<s:property value="address"/>&nbsp;&nbsp;&nbsp;<s:property value="name"/>&nbsp;&nbsp;<s:property value="phone"/>
     	</s:if>
     	<s:else>
     		<input name="orders.orderaddress.address" type="radio" value=<s:property value="address"/>+"  "+<s:property value="name"/>+"  "+<s:property value="phone"/> />
     		<s:property value="address"/>&nbsp;&nbsp;&nbsp;<s:property value="name"/>&nbsp;&nbsp;&nbsp;<s:property value="phone"/>
     	</s:else>
     </s:iterator>
     <br>
     商品详情：<br>
     商店:${bngoods.proxys.teamname }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
    <input type="hidden" name="orders.orderseller.pname" value=${bngoods.proxys.teamname }>
    <input type="hidden" name="orders.orderseller.pid" value=${bngoods.proxys.id }>

  <s:if test="bngoods.goodspicses.size != 0">  
  <s:iterator value="bngoods.goodspicses" status="st">
  	<s:if test="#st.count==1">
  		<img src=${src } height="150px" width="100px"/>
  		<input type="hidden" name="orders.ordergoodses[0].gpic" value=${src } >
  	</s:if>
  </s:iterator> 
  </s:if> 
  <s:else>
  		<img src="./images/1.jpg" height="150px" width="100px"/>
  		<input type="hidden" name="orders.ordergoodses[0].gpic" value="./images/1.jpg" >
  </s:else>
  <br>
  ${bngoods.goodsname }
  <input type="hidden" name="orders.ordergoodses[0].gname" value=${bngoods.goodsname }>
  <br>
  单价:${bngoods.marketvalue }
   <input type="hidden" name="orders.ordergoodses[0].gprice" value=${bngoods.marketvalue }>
 
  <br>
  购买数量：${bnsum }
  <input type="hidden" name="orders.ordergoodses[0].gsum" value=${bnsum }>
  <br>
  总价:${bnsum*bngoods.marketvalue}
  <br>
  付款方式:&nbsp;&nbsp;<input type="radio" name="orders.state" value="nopay" checked="checked">&nbsp;线上付款
  &nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="orders.state" value="offline" >&nbsp;线下付款
  <input type="hidden" name="orders.ordergoodses[0].gid" value=${bngoods.id }>
  <br>
  <input type="submit" value="提交">
    </form>
  -->
     
    <form action="bnorder" method="post">
     选择收货地址:<br>
     <s:iterator value="cglist" status="st">
     	<s:if test="#st.count==1">
    
     		<input name="orderaddress.address" checked="checked" type="radio" value="${address}${' ' }${name }${' ' }${phone}"  >
     	<s:property value="address"/>&nbsp;&nbsp;&nbsp;<s:property value="name"/>&nbsp;&nbsp;<s:property value="phone"/>
     	</s:if>
     	<s:else>
     		<input name="orderaddress.address" type="radio" value=<s:property value="address"/>+"  "+<s:property value="name"/>+"  "+<s:property value="phone"/> />
     		<s:property value="address"/>&nbsp;&nbsp;&nbsp;<s:property value="name"/>&nbsp;&nbsp;&nbsp;<s:property value="phone"/>
     	</s:else>
     </s:iterator>
     <br>
     商品详情：<br>
     商店:${bngoods.proxys.teamname }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
    <input type="hidden" name="orderseller.pname" value=${bngoods.proxys.teamname }>
    <input type="hidden" name="orderseller.pid" value=${bngoods.proxys.id }>

  <s:if test="bngoods.goodspicses.size != 0">  
  <s:iterator value="bngoods.goodspicses" status="st">
  	<s:if test="#st.count==1">
  		<img src=${src } height="150px" width="100px"/>
  		<input type="hidden" name="ordergoods.gpic" value=${src } >
  	</s:if>
  </s:iterator> 
  </s:if> 
  <s:else>
  		<img src="./images/1.jpg" height="150px" width="100px"/>
  		<input type="hidden" name="ordergoods.gpic" value="./images/1.jpg" >
  </s:else>
  <br>
  ${bngoods.goodsname }
  <input type="hidden" name="ordergoods.gname" value=${bngoods.goodsname }>
  <br>
  单价:${bngoods.marketvalue }
   <input type="hidden" name="ordergoods.gprice" value=${bngoods.marketvalue }>
 
  <br>
  购买数量：${bnsum }
  <input type="hidden" name="ordergoods.gsum" value=${bnsum }>
  <br>
  总价:${bnsum*bngoods.marketvalue}
  <br>
  付款方式:&nbsp;&nbsp;<input type="radio" name="orders.state" value="nopay" checked="checked">&nbsp;线上付款
  &nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="orders.state" value="offline" >&nbsp;线下付款
  <input type="hidden" name="ordergoods.gid" value=${bngoods.id }>
  <br>
  <input type="submit" value="提交">
    </form>
  </body>
</html>
