<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/02/16
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--商品详情页--%>
    <title>${requestScope.producet.prodName}</title>
        <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
        <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="/reference/angularJS/angular.js"></script>
        <script src="/reference/jsDir/detailJS.js"></script>
</head>
<body>
    <div id="detail-panel" ng-app="myApp">
        <div class="jumbotron" ng-controller="detail">
            <div>
                <img src="${requestScope.producet.prodImg}" alt="加载失败！" class="img-rounded">
                <img src="/reference/imgs/timg.jpg" alt="加载失败！" class="img-rounded">
            </div>
            <h3 class="label label-default">${requestScope.producet.prodName}</h3>
            <p>${requestScope.producet.prodDescribe}</p>
            <button type="button" class="btn btn-primary" ng-click="add()">+</button>
            <input type="text" ng-model="shoopNumber" />
            <button type="button" class="btn btn-primary" ng-click="sub">-</button>
            <p><a class="btn btn-primary btn-lg" href="#" role="button">加入购物车</a></p>
            <p><a class="btn btn-primary btn-lg" href="#" role="button">购买</a></p>
        </div>

    </div>

</body>
</html>
