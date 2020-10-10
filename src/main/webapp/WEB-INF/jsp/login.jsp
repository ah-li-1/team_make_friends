<%--
  Created by IntelliJ IDEA.
  User: AH
  Date: 2020/10/10
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link href="/static/css/bootstrap.min.css"  rel="stylesheet">
    <script src="/static/js/jQuery_v3.4.1.js"></script>
    <script src="/static/js/bootstrap.js"></script>
</head>
<body>
<h2 class="text-center">请登录</h2>
<div class="row">
    <form action="/user/login" class="form-horizontal col-md-offset-4 col-md-4">
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">账号</label>
            <div class="col-sm-10">
                <input type="name" class="form-control" id="inputEmail3" placeholder="请输入账号">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="inputPassword3" placeholder="请输入密码">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                    <label>
                        <input type="checkbox">记住密码
                    </label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default login ">登录</button>
            </div>
        </div>
    </form>
</div>
</div>
</body>
</html>
