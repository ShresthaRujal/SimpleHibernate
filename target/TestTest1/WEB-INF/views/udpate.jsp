<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>

<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
<script src="/resources/js/jquery.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>

<body>
<h1></h1>
<p>This is the Update page!</p>
<form action="/udpateById" method="post">
    <br/>
    You are updating id : ${id}

    <br/>
    <br/>
    <input type="hidden" value="${id}" name="id"/>
    Name : <input type="text" name="name"/><br/>
    Email : <input type="email" name="email"/><br/>
    Password : <input type="password" name="password"/><br/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
