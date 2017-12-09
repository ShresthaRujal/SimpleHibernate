<%--
  Created by IntelliJ IDEA.
  User: Ruzal
  Date: 4/22/2017
  Time: 6:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <script src="/resources/js/jquery.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Login</h2>
    <form class="form-horizontal" action="/login" method="post">
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Email:</label>
            <div class="col-sm-5">
                <input type="email" class="form-control" id="email" placeholder="Enter email" name="email"/>

            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Password:</label>
            <div class="col-sm-5">
                <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                    <label><input type="checkbox"> Remember me</label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Login</button>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                 <a href="/jspController?action=signup" class="btn btn-default" role="button">SignUp</a>
            </div>
        </div>

    </form>
</div>

</body>
</html>
