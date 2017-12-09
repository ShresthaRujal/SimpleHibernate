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
<h1></h1>
<p>This is the Update page!</p>
<div class="container">
<form action="/udpateById" method="post" class="form-horizontal">
    <h2>This is the Update page!</h2>
    <br/>
    <pre style="width:20%">You are updating id : ${id}</pre>

    <br/>

    <input type="hidden" value="${id}" name="id"/>
    <div class="form-group">
            <label class="control-label col-sm-2" for="name">Name :</label>
        <div class="col-sm-5">
            <input type="text" name="name" class="form-control" id="name" placeholder="Enter name"/><br/>
        </div>
    </div>

    <div class="form-group">
            <label class="control-label col-sm-2" for="name">Email :</label>
        <div class="col-sm-5">
            <input type="email" name="email" class="form-control" id="email" placeholder="Enter email"/><br/>
        </div>
    </div>

    <div class="form-group">
            <label class="control-label col-sm-2" for="name">Password :</label>
        <div class="col-sm-5">
            <input type="password" name="password" class="form-control" id="password" placeholder="Enter password"/><br/>
        </div>
    </div>

        <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <BUTTON type="submit" class="btn btn-default">Update</BUTTON>
        </div></div>
</form>

</body>
</html>
