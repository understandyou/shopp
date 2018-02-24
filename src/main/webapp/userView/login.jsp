<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/24
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <div>
        <form action="/component/login.action?redirect=${pageContext.request.getParameter('redirect')}" method="post">
            <div class="form-group">
                <label for="exampleInputEmail1">用户名：</label>
                <input type="text" name="userName" class="form-control" id="exampleInputEmail1" placeholder="用户名">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">密&nbsp;&nbsp;码：</label>
                <input type="password" name="passWord" class="form-control" id="exampleInputPassword1" placeholder="密码">
            </div>
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Check me out
                </label>
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>
</body>
</html>
