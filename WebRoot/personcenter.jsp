<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
<head>
<title>设置(个人信息)</title>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link rel="stylesheet" href="css/module/module.css">
<link rel="stylesheet" href="css/reset/reset.css">
<link rel="stylesheet" type="text/css" href="css/public-index/public-index.css">
<link rel="stylesheet" type="text/css" href="css/me-center/me-center.css">
<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript">
    function getacctk(){
        $("#acctk").toggle();
    }
    function getorder(){
        $("#order").toggle();
    }
    function getintegral(){
        $("#integral").toggle();
    }
    function getcustome(){
        $("#custome").toggle();
    }
    function getset(){
        $("#set").toggle();
    }

    function swapmy(){
        var my=document.getElementById("my");
        var re=document.getElementById("recent");
        var mytab=document.getElementById("mygoods");
        var retab=document.getElementById("recentgoods");
        my.className="selected";
        re.className="nonee";
        mytab.style.display="block";
        retab.style.display="none";
    }

    function swaprecent(){
        var my=document.getElementById("my");
        var re=document.getElementById("recent");
        var mytab=document.getElementById("mygoods");
        var retab=document.getElementById("recentgoods");
        my.className="nonee";
        re.className="selected";
        mytab.style.display="none";
        retab.style.display="block";
    }
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
</script>
</head>
<body>
<div class="head">
    <div class="cont">
        <div class="fl">
            <span class="head_tit">
                欢迎光临优粮我卖网！
            </span>
            <a>登录</a>
            <a>免费注册</a>
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
<!--导航条-->
<div class="banar">
    <span class="banar-content">首页<i class="iconfont">&#xe601;</i>我的优粮</span>
</div>
<!--body-center-->
<div class="me-center">
    <div class="left-me-center">
        <div class="my-yl">我的优粮</div>
        <!--我的订单-->
        <div class="my-order" onclick="getorder()">我的订单
            <span class="downarrow">
                <i class="iconfont">&#xe607;</i>
            </span>
        </div>
        <div class="all-order" id="order">
            <div class="all-order-info">我的全部订单</div>
            <div class="all-order-info">我的评论</div>
            <div class="all-order-info">我的关注</div>
            <div class="all-order-info last">我的定制商城</div>
        </div>
        <!--我的账户-->
        <div class="my-order" onclick="getacctk()">我的账户
            <span class="downarrow">
                <i class="iconfont">&#xe607;</i>
            </span>
        </div>
        <div class="all-order" id="acctk">
            <div class="all-order-info">账户充值</div>
            <div class="all-order-info last">账户流水查询</div>
        </div>
        <!--我的积分-->
        <div class="my-order" onclick="getintegral()">我的积分
            <span class="downarrow">
                <i class="iconfont">&#xe607;</i>
            </span>
        </div>
        <div class="all-order" id="integral">
            <div class="all-order-info">账户充值</div>
            <div class="all-order-info last">账户流水查询</div>
        </div>
        <!--客户服务-->
        <div class="my-order" onclick="getcustome()">客户服务
            <span class="downarrow">
                <i class="iconfont">&#xe607;</i>
            </span>
        </div>
        <div class="all-order" id="custome">
            <div class="all-order-info">退换货</div>
            <div class="all-order-info">积分明细</div>
            <div class="all-order-info last">咨询回复</div>
        </div>
        <!--设置-->
        <div class="my-order" onclick="getset()">设置
            <span class="downarrow">
                <i class="iconfont">&#xe607;</i>
            </span>
        </div>
        <div class="all-order" id="set">
            <div class="all-order-info"><a href="getinfo?users.phone=${sessionScope.phone }" >个人信息</a></div>
            <div class="all-order-info"><a href="getcginfobyuserid"  >收货地址</a></div>
            <div class="all-order-info last">账户安全</div>
        </div>
    </div>
    <div   class="account-right" >
        <div class="address-top">
                个人信息
            </div>
            <div class="perinfo">
                <div class="nickname">
                    <div class="nickname-left">
                        手机号：
                    </div>
                    <div class="nickname-right">
                        <input>
                    </div>
                </div>
                <div class="nickname">
                    <div class="nickname-left">
                        我的积分：
                    </div>
                    <div class="sex-right">
                        1024
                     
                    </div>
                </div>
                <div class="nickname">
                    <div class="nickname-left">
                        生日：
                    </div>
                    <div class="birthday-right">
                        <select>
                            <option>请选择</option>
                        </select>年
                        <select>
                            <option>请选择</option>
                        </select>月
                        <select>
                            <option>请选择</option>
                        </select>日
                    </div>
                </div>
                <div class="hobby">
                    <div class="hobby-left">
                        兴趣爱好：
                    </div>
                    <div class="hobby-right">
                        <div class="hobby-top">
                            请选择您感兴趣的分类，给您最精确的推荐。
                        </div>
                        <div class="hobby-bott">
                            <ul>
                                <li>
                                    <input type="checkbox">绿色食品
                                </li>
                                <li>
                                    <input type="checkbox">家用电器
                                </li>
                                <li>
                                    <input type="checkbox">特色手工艺
                                </li>
                                <li>
                                    <input type="checkbox">农家乐
                                </li>
                                <li>
                                    <input type="checkbox">汽车用品
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="nickname">
                    <div class="nickname-left">
                        邮箱：
                    </div>
                    <div class="nickname-right">
                        <input >
                    </div>
                </div>
                <div class="nickname">
                    <div class="nickname-left">
                        真实姓名：
                    </div>
                    <div class="nickname-right">
                        <input> <b>真实姓名不能为空</b>
                    </div>
                </div>
                <div class="location">
                    <div class="location-left">
                        所在地：
                    </div>
                    <div class="location-right">
                        <select>
                            <option>山东省</option>
                        </select>
                        <select>
                            <option>日照市</option>
                        </select>
                        <select>
                            <option>东港区</option>
                        </select>
                    </div>
                    <div class="location-final">
                        详细地址：<input>
                    </div>
                </div>
                <div class="nickname">
                    <div class="nickname-left">
                        &nbsp;
                    </div>
                    <div class="nickname-right">
                        <span>提交</span>
                    </div>
                </div>
            </div> 
    </div>
</div>


<!--底部-->
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
                <div class="pho"> <img src="images/43.png">
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

