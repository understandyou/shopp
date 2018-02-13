<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/22
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="item" items="${requestScope.producets}">
        id：${item.prodId}
        现价${item.prodCurrent}
        定价：${item.prodPrice}
        商品描述：${item.prodDescribe}
        图片:${item.prodImg}
        生产厂：${item.vendors}
        分类：${item.prodClass}
        <hr />
    </c:forEach>
</body>
</html>
