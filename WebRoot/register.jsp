<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
   <!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">

    <title>注册</title>
    <meta charset="UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <meta name="viewport"
    content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" href="css/module/module.css">
    <link rel="stylesheet" href="css/reset/reset.css">
    <link rel="stylesheet" type="text/css" href="css/public-index/public-index-mini.css">
    <link rel="stylesheet" type="text/css" href="css/reg/reg.css">
    <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
            window.onload = function()
            {
                var $li = $('#tab li');
                var $tab = $('#r-body ');

                $li.click(function(){
                    var $this = $(this);
                    var $t = $this.index();
                    $li.removeClass();
                    $li.css('color',"#999");
                    $this.addClass('active');
                    $this.css('color', '#43af35');
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
                                <p class="para">最近浏览</p>

                                <p class="more">更多<i class="iconfont">&#xe601;</i></p>
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
    <div class="search">
        <div class="logo">
            <img src="images/logo.png">
        </div>
        <div class="reglogin">
            <span class="welcome">
                欢迎注册
            </span>
        </div>
    </div>
    <div class="middle">
        <div class="content">
            <div class="r-title">
                <ul class="tab" id="tab">
                    <li class="active">个人用户</li>
                    <li>企业用户</li>
                    <p>我已是会员&nbsp;现在<a href="">登录</a>
                    </p>
                </ul>
            </div>
            <div class="r-body" id="r-body" style="display:block">
                <div class="r-body-left">
                    <div class="r-body-left-center">
                        <form action="">
                            <div class="line">
                                <span class="label">
                                    <b class="star">
                                        *
                                    </b>
                                    手机号:
                                </span>
                                <input type="text" name="users.phone" class="username" placeholder="&nbsp;&nbsp;请输入常用手机号"/>
                            </div>
                            <div class="line">
                                <span class="label">
                                    <b class="star">
                                    *
                                    </b>
                                    E-mail:
                                </span>
                                <input type="text" name="users.email" class="nickname" placeholder="请输入电子邮箱"/>
                            </div>
                            <div class="line">
                                <span class="label">
                                    <b class="star">
                                    *
                                    </b>
                                    密码:
                                </span>
                                <input type="password" name="users.password" class="password" />
                            </div>
                            <div class="line">
                                <span class="label">
                                    <b class="star">
                                    *
                                    </b>
                                    确认密码:
                                </span>
                                <input type="password" class="confirm" />
                            </div>
                            <div class="line">
                                <span class="label">
                                    <b class="star">
                                    *
                                    </b>
                               所在地区:
                                </span>
                                省:<select name="users.province">
                                					<option value="陕西">陕西</option>
                                					</select>
                                	市:<select name="users.city">
                                					<option value="西安市">西安市</option>
                                					</select>
                                		
                                	区:<select name="users.area">
                                					<option value="雁塔区">雁塔区</option>
                                					</select>
                                	具体地址:<select name="users.local">
                                					<option value="西安电子科技大学老校区">西安电子科技大学老校区</option>
                                					</select>
                            </div>
                           
                            <div class="line-last">
                                <span class="label">
                                    <b class="star">
                                    *
                                    </b>
                                    验证码:
                                </span>
                                <input type="text" class="chkcode" />
                                <span class="getchk">
                                    获取验证码
                                </span>
                                <input class="checkbox" type="checkbox" />
                            </div>
                            <div class="line-small">
                                <span class="accept">
                                    &nbsp;我已阅读并同意
                                </span>
                                <span class="protocol">
                                    【优粮我卖网用户协议】
                                </span>
                            </div>
                            <div class="register">
                                注&nbsp;&nbsp;册
                            </div>
                        </form>
                    </div>
                </div>
                <span class="r-body-line">
                </span>
                <div class="r-body-right">
                    <div class="weixin">
                        <img src="images/weixin.png"/>
                    </div>
                    <div class="activity">
                        快速了解活动
                    </div>
                </div>
            </div>
            <div class="r-body" id="r-body" style="dispalay:none">
                <div class="r-body-left">
                    <div class="r-body-left-center">
                        <div class="enterprise-title">
                            企业用户注册
                        </div>
                        <div class="enterprise-body">
                            <div class="please">
                                企业用户请致电
                            </div>
                            <div class="freetel">
                                400-997-997
                            </div>
                            <div class="more">
                                更多精彩，敬请期待！
                            </div>
                        </div>
                    </div>
                </div>
                <span class="r-body-line">
                </span>
                <div class="r-body-right">
                    <div class="weixin">
                        <img src="images/weixin.png"/>
                    </div>
                    <div class="activity">
                        快速了解活动
                    </div>
                </div>
            </div>
        </div>
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

  