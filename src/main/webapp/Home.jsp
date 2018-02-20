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
    <%--<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">--%>
    <link rel="stylesheet" href="/bootstrap-3.3.7-dist/css/bootstrap.css">
</head>
<body>
   <%-- <c:forEach var="item" items="${requestScope.producets}">
        id：${item.prodId}
        现价${item.prodCurrent}
        定价：${item.prodPrice}
        商品描述：${item.prodDescribe}
        图片:${item.prodImg}
        生产厂：${item.vendors}
        分类：${item.prodClass}
        <hr />
    </c:forEach>--%>
    <div>
        <div id="middle">
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
                        测试session:${item.prodImg}
                    </div>
                </c:forEach>
            </div>
            <%-- row stop--%>
        </div>
    </div>
</body>
</html>
