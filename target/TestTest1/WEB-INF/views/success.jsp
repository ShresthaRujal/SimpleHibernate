<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Ruzal
  Date: 4/12/2017
  Time: 9:27 PM
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
<div align="center">
    <pre>
        Name : ${display.name}<br/>
        Email : ${display.email}<br/>
        Password : ${display.password}<br/>
    </pre>
<br/><p>View All Data</p>
<a href="/viewAll"class="btn btn-default" role="button">viewAll</a>
</div>
</body>
</html>
