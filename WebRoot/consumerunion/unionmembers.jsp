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
    
    <title>My JSP 'unionmembers.jsp' starting page</title>
    
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
    消费联盟成员列表:<br>
    <s:if test="unionMembers.size() == 0">
    	您还没有联盟会员，快去分享注册吧！
    </s:if>
    <s:else>
    <s:iterator value="unionMembers" status="st">
    	用户id：<s:property value="id"/>&nbsp;&nbsp;&nbsp;
    	用户注册时间：<s:property value="registratetime"/>&nbsp;&nbsp;&nbsp;
    	用户手机号: <s:property value="phone" />
    	<br>
    </s:iterator>
    </s:else>
  </body>
</html>
