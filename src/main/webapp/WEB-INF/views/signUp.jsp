<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
        <script src="/resources/js/jquery.min.js"></script>
        <script src="/resources/js/bootstrap.min.js"></script>
    </head>
    <body>

        <div class="container">
            <h2>SignUp Page</h2>
            <form class="form-horizontal" action="/view" method="post" >
                <div class="form-group">
                    <label class="control-label col-sm-2" for="name">Name:</label>
                    <div class="col-sm-5">
                        <input type="name" class="form-control" id="name" placeholder="Enter name" name="name">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">Email:</label>
                    <div class="col-sm-5">
                        <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
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
                        <button type="submit" class="btn btn-default" value="submit">Submit</button>
                    </div>
                </div>
            </form>
        </div>

    </body>
</html>
