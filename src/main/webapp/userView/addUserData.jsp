<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/4
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
    <form action="/userAction/addUser.action" method="post">
        用 户 名：<input type="text" name="userName" /><br/>
        用户密码：<input type="password" name="passWord" /><br/>
        地址：<input type="text" name="address" /><br/>
        电话：<input type="text" name="phone" /><br/>
        <input type="submit" value="注册" />
    </form>
<a href="/HomeInit/init.action">测试</a>
</body>
</html>
