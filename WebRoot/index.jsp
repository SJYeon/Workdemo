<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
  <head>
    <base href="<%=basePath%>">
    
   <title>首页</title>
	<meta charset="UTF-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
	<link rel="stylesheet" href="css/module/module.css">
	<link rel="stylesheet" href="css/reset/reset.css">
	<link rel="stylesheet" type="text/css" href="css/index/index.css">
	<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
	<script type="text/javascript">
    function change(){
        var sp=document.getElementById('hot');
        var sp1=document.getElementById('pro');
        var inp=document.getElementById('inp');
        var inp1=document.getElementById('inp1');
        inp.style.display="none";
        inp1.style.display="block";
        sp1.style.color="#747474";
        sp1.style.background="#fff";
        sp.style.color="#fff";
        sp.style.background="#44af36";
    }
    function rechange(){
        var sp=document.getElementById('hot');
        var sp1=document.getElementById('pro');
        var inp=document.getElementById('inp');
        var inp1=document.getElementById('inp1');
        inp1.style.display="none";
        inp.style.display="block";
        sp.style.color="#747474";
        sp.style.background="#fff";
        sp1.style.color="#fff";
        sp1.style.background="#44af36";
    }
    function getSale(){
        var l1=document.getElementById('sale');
        var l2=document.getElementById('limit');
        var l3=document.getElementById('hotv');
        var l4=document.getElementById('new');
        var dv=document.getElementById('dv');
        var dv1=document.getElementById('dv1');
        var dv2=document.getElementById('dv2');
        var dv3=document.getElementById('dv3');
        l1.className="active";
        l2.className="";
        l3.className="";
        l4.className="";
        dv.style.display="none";
        dv1.style.display="block";
        dv2.style.display="none";
        dv3.style.display="none";
    }
    function getLimit(){
        var l1=document.getElementById('sale');
        var l2=document.getElementById('limit');
        var l3=document.getElementById('hotv');
        var l4=document.getElementById('new');
        var dv=document.getElementById('dv');
        var dv1=document.getElementById('dv1');
        var dv2=document.getElementById('dv2');
        var dv3=document.getElementById('dv3');
        l2.className="active";
        l1.className="";
        l3.className="";
        l4.className="";
        dv.style.display="block";
        dv1.style.display="none";
        dv2.style.display="none";
        dv3.style.display="none";
    }
    function getHotv(){
        var l1=document.getElementById('sale');
        var l2=document.getElementById('limit');
        var l3=document.getElementById('hotv');
        var l4=document.getElementById('new');
        var dv=document.getElementById('dv');
        var dv1=document.getElementById('dv1');
        var dv2=document.getElementById('dv2');
        var dv3=document.getElementById('dv3');
        l3.className="active";
        l2.className="";
        l1.className="";
        l4.className="";
        dv2.style.display="block";
        dv1.style.display="none";
        dv.style.display="none";
        dv3.style.display="none";
    }
    function getNew(){
        var l1=document.getElementById('sale');
        var l2=document.getElementById('limit');
        var l3=document.getElementById('hotv');
        var l4=document.getElementById('new');
        var dv=document.getElementById('dv');
        var dv1=document.getElementById('dv1');
        var dv2=document.getElementById('dv2');
        var dv3=document.getElementById('dv3');
        l4.className="active";
        l2.className="";
        l3.className="";
        l1.className="";
        dv3.style.display="block";
        dv1.style.display="none";
        dv2.style.display="none";
        dv.style.display="none";
    }
    $(function(){
        window.onload = function()
        {
            var $li = $('#tab li');
            var $tab = $('#s-right ');

            $li.mouseover(function(){
                var $this = $(this);
                var $t = $this.index();
                $li.removeClass();
                $this.addClass('active');
                $tab.css('display','none');
                $tab.eq($t).css('display','block');
            })
        }
    });
</script>
</head>
  
  <body>
<div class="head">
    <div class="cont">
        <div class="fl">
            <span class="head_tit">
                欢迎光临优粮我卖网！
            </span>

            <s:if test="#session.phone!=null" >
            欢迎用户${sessionScope.phone}, <a>退出</a>
            </s:if>
            
            <s:else>
           
            <a href="login.jsp">登录 </a>
            <a href="register.jsp">免费注册</a>
            </s:else>
           
        </div>
        <div class="fl">
            <i class="iconfont ico">&#xe60a;</i>
            <span class="head_tit">送货至：</span>
            <a>
                <b>山东青岛</b>
            </a>
        </div>
        <div class="fr">
            <ul>
                <a class="my">
                    <li class="list">我的优粮<i class="iconfont">&#xe607;</i>
                    <div class="mine">
                        <div class="m-top">
                            <div class="m-center">
                                <img src="images/40.png">
                                <p>用户名</p>
                                <p>信息&nbsp;<b>0</b></p>
                            </div>
                            <div class="m-final">
                                <ul>
                                    <li>待处理订单</li>
                                    <li>咨询回复</li>
                                    <li>返修退换货</li>
                                </ul>
                                <ul>
                                    <li>我的关注</li>
                                    <li>我的账户</li>
                                    <li>我的订制商城</li>
                                </ul>
                            </div>
                        </div>
                        <p class="para">最近浏览</p><p class="more">更多<i class="iconfont">&#xe601;</i></p>
                        <ul>
                            <li class="ll">
                                <img src="images/10.jpg">
                            </li>
                            <li class="ll">
                                <img src="images/11.jpg">
                            </li>
                            <li class="ll">
                                <img src="images/12.jpg">
                            </li>
                            <li class="ll">
                                <img src="images/13.jpg">
                            </li>
                        </ul>
                    </div>
                    </li>
                </a>
                <li class="space me"></li>
                <li class="list"><i class="iconfont ico1">&#xe602;</i><a>购物车</a></li>
                <li class="space"></li>
                <li class="list"><i class="iconfont ico2">&#xe622;</i><a>手机优粮</a><i class="iconfont">&#xe607;</i>
                </li>
                <li class="space"></li>
                <li class="list"><a>卖家中心</a><i class="iconfont">&#xe607;</i></li>
                <li class="space"></li>
                <li class="list"><a>客户服务</a><i class="iconfont">&#xe607;</i></li>
                <li class="space"></li>
                <li class="list"><i class="iconfont ico3">&#xe627;</i><a>网站导航</a><i class="iconfont">&#xe607;</i>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="ad">
    <img src="images/top.jpg">
</div>
<div class="search">
    <div class="logo">
        <img src="images/logo.png">
    </div>
    <div class="img">
        <img src="images/ad.jpg">
    </div>
    <div class="sear">
        <span class="s-pro" id="pro" onclick="rechange()">商品</span>
        <span class="s-active" id="hot" onclick="change()">热铺</span>
        <div class="input" id="inp">
            <i class="iconfont">&#xe620;</i>
            <input placeholder="推广商品名称">
            <span>搜索</span>
        </div>
        <div class="inputp" id="inp1">
            <i class="iconfont">&#xe620;</i>
            <input placeholder="推广商户名称">
            <span>搜索</span>
        </div>
        <span class="sp">海米大虾</span>
        <span class="sp">日照绿茶</span>
        <span class="sp">黑猪肉</span>
        <span class="sp">香菇</span>
    </div>
    <div class="right">
        <div class="code">
            <span>微信逛优粮</span>
            <img src="images/code.jpg">
        </div>
    </div>
</div>
<div class="top">
    <div class="left">
        商品分类
    </div>
    <div class="right">
        <ul>
            <li class="active">特色农产品</li>
            <li>联农百货</li>
            <li>坤农农资</li>
            <li>优粮惠</li>
            <li>本地生活</li>
            <li>优粮农场</li>
        </ul>
        <span class="sp">消费者保障</span>
    </div>
</div>
<div class="middle">
    <div class="menu">
        <ul>
            <li class="l1">
            <i class="iconfont ico1">&#xe62e;</i>
            <h3>水果蔬菜</h3>
            <p>水果&nbsp;&nbsp;蔬菜&nbsp;&nbsp;果蔬礼盒</p>
            <div class="submenu">
                <div class="s-menu">
                    <h3 class="s-tit">蔬菜</h3>
                    <p class="s-sort">新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类&nbsp;新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类</p>
                </div>
            </div>
            </li>
            <li class="l2">
            <i class="iconfont ico2">&#xe609;</i>
            <h3>肉类禽蛋</h3>
            <p>猪肉&nbsp;&nbsp;牛肉&nbsp;&nbsp;鸡肉</p>
            <div class="submenu">
                <div class="s-menu">
                    <h3 class="s-tit">蔬菜</h3>
                    <p class="s-sort">新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类&nbsp;新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类</p>
                </div>
            </div>
            </li>
            <li class="l3">
            <i class="iconfont ico3">&#xe62f;</i>
            <h3>海鲜水产</h3>
            <p>鱼&nbsp;&nbsp;虾&nbsp;&nbsp;贝</p>
            <div class="submenu">
                <div class="s-menu">
                    <h3 class="s-tit">蔬菜</h3>
                    <p class="s-sort">新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类&nbsp;新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类</p>
                </div>
            </div>
            </li>
            <li class="l4">
            <i class="iconfont ico4">&#xe604;</i>
            <h3>粮油副食</h3>
            <p>大米&nbsp;&nbsp;食用油&nbsp;&nbsp;面粉</p>
            <div class="submenu">
                <div class="s-menu">
                    <h3 class="s-tit">蔬菜</h3>
                    <p class="s-sort">新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类&nbsp;新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类</p>
                </div>
            </div>
            </li>
            <li class="l5">
            <i class="iconfont ico5">&#xe613;</i>
            <h3>零食冲饮</h3>
            <p>日照绿茶&nbsp;&nbsp;休闲食品</p>
            <div class="submenu">
                <div class="s-menu">
                    <h3 class="s-tit">蔬菜</h3>
                    <p class="s-sort">新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类&nbsp;新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类</p>
                </div>
            </div>
            </li>
            <li class="l6">
            <i class="iconfont ico6">&#xe62b;</i>
            <h3>生态日用</h3>
            <p>小家电&nbsp;&nbsp;洗衣粉&nbsp;&nbsp;牙膏</p>
            <div class="submenup">
                <div class="s-menu">
                    <h3 class="s-tit">蔬菜蔬菜</h3>
                    <p class="s-sort">新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类&nbsp;新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类</p>
                </div>
            </div>
            </li>
            <li class="l7">
            <i class="iconfont ico7">&#xe60d;</i>
            <h3>手工艺品</h3>
            <p>珊瑚饰品&nbsp;&nbsp;根雕&nbsp;&nbsp;贝壳</p>
            <div class="submenu">
                <div class="s-menu">
                    <h3 class="s-tit">蔬菜</h3>
                    <p class="s-sort">新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类&nbsp;新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类新鲜蔬菜&nbsp;有机蔬菜&nbsp;食用鲜菌&nbsp;果菜类</p>
                </div>
            </div>
            </li>
        </ul>
    </div>
    <div class="advert">
        <div class="big">
            <ul>
                <li><img src="images/3.jpg"></li>
            </ul>
        </div>
        <div class="medium">
            <img src="images/4.jpg">
        </div>
        <div class="small">
            <ul>
                <li>
                <img src="images/5.jpg">
                </li>
                <li>
                <img src="images/6.jpg">
                </li>
                <li>
                <img src="images/7.jpg">
                </li>
                <li>
                <img src="images/8.jpg">
                </li>
            </ul>
        </div>
        <div class="last">
            <img src="images/9.jpg">
        </div>
    </div>
    <div class="final">
        <div class="f-top">
            <p>优粮快报</p>
            <i class="iconfont">更多&#xe629;</i>
        </div>
        <div class="f-middle">
            <span>
                <p><b>【公告】</b>优粮我卖网正式运行</p>
                <p><b>【公告】</b>优粮我卖网正式运行</p>
                <p><b>【公告】</b>优粮我卖网正式运行</p>
                <p><b>【公告】</b>优粮我卖网正式运行</p>
                <p><b>【公告】</b>优粮我卖网正式运行</p>
                <p><b>【公告】</b>优粮我卖网正式运行</p>
            </span>
        </div>
        <div class="f-serv">
            <p>便民服务</p>
        </div>
        <div class="f-final">
            <ul>
                <li class="active">话费</li>
                <li>机票</li>
                <li>车票</li>
                <li>火车票</li>
            </ul>
        </div>
        <div class="f-bottom">
            <span class="title">话费缴费</span>
            <span class="num">号码<input placeholder="移动、联通、电信"></span>
            <span class="num">面值<input placeholder="100"><i>￥98.1</i></span>
            <span class="commit">快速充值</span>
        </div>
    </div>
</div>
<div class="activity">
    <div class="positon">
    <div class="a-buy">
        <ul>
            <li class="active" id="limit" onmouseover="getLimit()">限时抢购</li>
            <li id="sale" onmouseover="getSale()">超值促销</li>
            <li id="hotv" onmouseover="getHotv()">火热农村</li>
            <li id="new" onmouseover="getNew()">新品上市</li>
        </ul>
    </div>
    <div class="part" id="dv">
    <div class="a-product">
        <img src="images/10.jpg">
        <p>
            <b>【买一赠一】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    <div class="a-product">
        <img src="images/11.jpg">
        <p>
            <b>【买一赠一】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    <div class="a-product">
        <img src="images/12.jpg">
        <p>
            <b>【买一赠一】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    <div class="a-product">
        <img src="images/12.jpg">
        <p>
            <b>【买一赠一】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    </div>
    <div class="part1"  id="dv1">
    <div class="a-product">
        <img src="images/10.jpg">
        <p>
            <b>【买一赠二】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    <div class="a-product">
        <img src="images/11.jpg">
        <p>
            <b>【买一赠二】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    <div class="a-product">
        <img src="images/12.jpg">
        <p>
            <b>【买一赠一】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    <div class="a-product">
        <img src="images/12.jpg">
        <p>
            <b>【买一赠一】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    </div>
    <div class="part1"  id="dv2">
    <div class="a-product">
        <img src="images/10.jpg">
        <p>
            <b>【买一赠三】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    <div class="a-product">
        <img src="images/11.jpg">
        <p>
            <b>【买一赠三】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    <div class="a-product">
        <img src="images/12.jpg">
        <p>
            <b>【买一赠一】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    <div class="a-product">
        <img src="images/12.jpg">
        <p>
            <b>【买一赠一】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    </div>
    <div class="part1"  id="dv3">
    <div class="a-product">
        <img src="images/10.jpg">
        <p>
            <b>【买一赠四】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    <div class="a-product">
        <img src="images/11.jpg">
        <p>
            <b>【买一赠四】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    <div class="a-product">
        <img src="images/12.jpg">
        <p>
            <b>【买一赠一】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    <div class="a-product">
        <img src="images/12.jpg">
        <p>
            <b>【买一赠一】</b>
            优粮我卖网自营大棚香菇&nbsp;500g/份
        </p>
        <span class="sp1">￥16.80</span><span class="sp2">￥18.80</span>
        <span class="sp3">剩余时间<b>12</b>小时<b>13</b>分<b>08</b>秒</span>
    </div>
    </div>
    </div>
    <div class="star">
        <span><i class="iconfont">&#xe603;</i>明星单品</span>
        <img src="images/14.jpg">
    </div>
</div>
<div class="show">
    <div class="s-title">
        <img class="tit" src="images/35.png">
        <h3>水果蔬菜</h3>
        <img class="logo" src="images/37.png">
        <ul id="tab">
            <li class="active">热门<span class="spa">|</span></li>
            <li>有机蔬菜<span class="spa">|</span></li>
            <li>特色水果<span class="spa">|</span></li>
            <li>优粮农场<span class="spa">|</span></li>
            <li>国产水果<span class="spa">|</span></li>
            <li>进口水果</li>
        </ul>
    </div>
    <div class="s-left">
        <img src="images/15.jpg">
        <div class="s-bot">
            <p class="sp1"><b>【特惠】</b>西红柿特卖<i class="iconfont">&#xe601;</i></p>
            <p class="sp1"><b>【特惠】</b>西红柿特卖<i class="iconfont">&#xe601;</i></p>
            <p class="sp2">有机蔬菜&nbsp;特色蔬菜&nbsp;鲜食用菌</p>
        </div>
    </div>
    <div class="s-right" id="s-right" style="display:block">
        <ul>
            <li>
                <div class="s-product">
                    <img src="images/17.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
            <li>
                <div class="s-product">
                    <img src="images/18.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
            <li>
                <div class="s-product">
                    <img src="images/19.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
            <li>
                <div class="s-product">
                    <img src="images/20.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
        </ul>
        <ul>
            <li class="l-bottom">
                <div class="s-product">
                    <img src="images/21.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
            <li class="l-bottom">
                <div class="s-product">
                    <img src="images/22.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
            <li class="l-bottom">
                <div class="s-product">
                    <img src="images/23.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
            <li class="l-bottom">
                <div class="s-product">
                    <img src="images/24.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
        </ul>
    </div>
    <div class="s-right" id="s-right">
        <ul>
            <li>
                <div class="s-product">
                    <img src="images/17.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥18.80</b>&nbsp;/份</span>
                </div>
            </li>
            <li>
                <div class="s-product">
                    <img src="images/18.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥18.80</b>&nbsp;/份</span>
                </div>
            </li>
            <li>
                <div class="s-product">
                    <img src="images/19.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
            <li>
                <div class="s-product">
                    <img src="images/20.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
        </ul>
        <ul>
            <li class="l-bottom">
                <div class="s-product">
                    <img src="images/21.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
            <li class="l-bottom">
                <div class="s-product">
                    <img src="images/22.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
            <li class="l-bottom">
                <div class="s-product">
                    <img src="images/23.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
            <li class="l-bottom">
                <div class="s-product">
                    <img src="images/24.jpg">
                    <p>优粮我卖网自营大棚香菇500g/份</p>
                    <span><b>￥16.80</b>&nbsp;/份</span>
                </div>
            </li>
        </ul>
    </div>
</div>
<div class="bottom">
    <ul>
        <li>
            <div class="b-inn">
                <div class="pho">
                    <img src="images/39.png">
                </div>
                <p>食品安全有保障</p>
            </div>
        </li>
        <li>
            <div class="b-inn">
                <div class="pho">
                    <img src="images/40.png">
                </div>
                <p>有机农场鲜蔬直供</p>
            </div>
        </li>
        <li>
            <div class="b-inn">
                <div class="pho">
                    <img src="images/41.png">
                </div>
                <p>先验货后付款</p>
            </div>
        </li>
        <li>
            <div class="b-inn">
                <div class="pho">
                    <img src="images/42.png">
                </div>
                <p>支持多种购物卡</p>
            </div>
        </li>
        <li class="b-li">
            <div class="b-inn">
                <div class="pho">
                    <img src="images/43.png">
                </div>
                <p class="b-bottom">400-898-9797</p>
                <p class="b-time">周一至周五：08:00-20:00</p>
                <p class="b-time">双休及节日：09:00-19:00</p>
            </div>
        </li>
    </ul>
</div>
<div class="foot">
    <ul class="u-father">
        <li class="l-father">
            <ul class="u-son">
                <li class="l-bigson">食品安全</li>
                <li class="l-son">食品安全</li>
                <li class="l-son">食品安全</li>
                <li class="l-son">食品安全</li>
            </ul>
        </li>
        <li class="l-father">
            <ul class="u-son">
                <li class="l-bigson">食品安全</li>
                <li class="l-son">食品安全</li>
                <li class="l-son">食品安全</li>
                <li class="l-son">食品安全</li>
            </ul>
        </li>
        <li class="l-father">
            <ul class="u-son">
                <li class="l-bigson">食品安全</li>
                <li class="l-son">食品安全</li>
                <li class="l-son">食品安全</li>
                <li class="l-son">食品安全</li>
            </ul>
        </li>
        <li class="l-father">
            <ul class="u-son">
                <li class="l-bigson">食品安全</li>
                <li class="l-son">食品安全</li>
                <li class="l-son">食品安全</li>
                <li class="l-son">食品安全</li>
            </ul>
        </li>
        <li class="l-father">
            <ul class="u-son">
                <li class="l-bigson">食品安全</li>
                <li class="l-son">食品安全</li>
                <li class="l-son">食品安全</li>
                <li class="l-son">食品安全</li>
            </ul>
        </li>
        <li class="l-father">
            <ul class="u-son">
                <li class="l-bigson">食品安全</li>
                <li class="l-son">食品安全</li>
                <li class="l-son">食品安全</li>
                <li class="l-son">食品安全</li>
            </ul>
        </li>
        <li class="l-final">
            <p class="l-top">关注优粮我卖网</p>
            <img src="images/code.jpg">
            <p class="l-btm">快速了解活动</p>
        </li>
    </ul>
</div>
<div class="footbar">
    <div class="f-cen">
        <ul>
            <li>关于我们</li>
            <li>联系我们</li>
            <li>服务条款</li>
            <li>商家入驻</li>
            <li>友情链接</li>
            <li>帮助中心</li>
            <li>优粮城</li>
            <li class="f-l">企业员工内购</li>
        </ul>
        <p>日照优粮城电子商务有限公司</p>
    </div>
</div>
<div class="blank"></div>
</body>
</html>
