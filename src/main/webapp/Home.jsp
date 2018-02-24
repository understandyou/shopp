<%--
  Created by IntelliJ IDEA.
  User: 植杨爽
  Date: 2017/12/22
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${requestScope.producets==null}">
    <c:redirect url="/HomeInit/init.action"></c:redirect>
</c:if>
<html>
<head>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1">--%>
    <title>Title</title>
    <%--<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>--%>
    <%--<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">--%>
    <link rel="stylesheet" href="/references/bootstrap-3.3.7-dist/css/bootstrap.css">
    <link rel="stylesheet" href="/references/bootstrap-3.3.7-dist/css/bootstrap-theme.css">
        <%--<link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" />--%>
        <%--<link href="http://cdn.bootcss.com/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />--%>

</head>
<body>
   <%-- <c:forEach var="item" items="${requestScope.producets}">
        id：${item.prodId}
        现价${item.prodCurrent}
        定价：${item.prod
        商品描述：${item.prodDescribe}
        图片:${item.prodImg}
        生产厂：${item.vendors}
        分类：${item.prodClass}
        <hr />
    </c:forEach>--%>
    <div>
        <div id="top">
            <%--<div class="container dropdown" style="margin-bottom: 50px">--%>
                <%--<h2 class="page-header">--%>
                    <%--下拉菜单</h2>--%>
                <%--<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">字体<span class="caret"></span></a>--%>
                <%--<ul class="dropdown-menu">--%>
                    <%--<li><a href="#">宋体</a></li>--%>
                    <%--<li><a href="#">黑体</a></li>--%>
                    <%--<li><a href="#">楷体</a></li>--%>
                <%--</ul>--%>
            <%--</div>--%>
            <nav class="navbar navbar-default navbar-fixed-top">
                <div class="container dropdown">
                    <ul class="nav nav-tabs">
                        <li>
                            <ul class="nav nav-tabs">
                                <li role="presentation" class="active"><a href="">首页</a></li>
                                <%--检查未登录则显示登录注册按钮--%>
                                <c:if test="${null==sessionScope.userData.userName}">
                                    <li role="presentation"><a href="/userView/login.jsp?redirect=${pageContext.request.requestURL}">登录</a></li>
                                    <li role="presentation"><a href="#">注册</a></li>
                                </c:if>
                            </ul>
                        </li>
                        <%-- 检查已经登录则显示用户操作按钮--%>
                        <c:if test="${null!=sessionScope.userData.userName}">
                        <li role="presentation" class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                                ${sessionScope.userName} <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>购物车</li>
                                <li>订单</li>
                                <li>退出登录</li>
                            </ul>
                        </li>
                        </c:if>
                    </ul>
                </div>
            </nav>
        </div>
        <div id="middle" style="margin-top:50px;">
            <%--row start--%>
            <div class="row">
                <c:forEach var="item" items="${requestScope.producets}">
                    <div class="col-sm-6 col-md-4">
                        <div class="thumbnail">
                            <a href="/component/xiangxi.action?prodId=${item.prodId}">
                                <img src="${item.prodImg}" alt="图片加载失败！" title="${item.prodName}">
                            </a>
                            <div class="caption">
                                <h3>价格：￥${item.prodCurrent}</h3>
                                <p>${item.prodName}</p>
                            </div>
                            <p>${item.vendors.vendName}</p>
                        </div>
                        测mm试session:${item.prodImg}
                    </div>
                </c:forEach>
            </div>
            <%-- row stop--%>
        </div>
        <div class="dropdown disabled">
            <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                Dropdown
                <span class="caret"></span>
            </button>
            <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                <li><a href="#">Action</a></li>
                <li><a href="#">Another action</a></li>
                <li><a href="#">Something else here</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="#">Separated link</a></li>
            </ul>
        </div>
    </div>
   <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
   <%--<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>--%>
   <script src="/references/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
</body>
</html>
