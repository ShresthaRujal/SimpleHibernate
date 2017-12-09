<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
</head><h1>Hello World!</h1>

<div class="container">
    <h2>All Details</h2>
    <table class="table table-responsive table-hover">
        <thead>
        <tr>
            <th>id</th>
            <th>UserName</th>
            <th>Email</th>
            <th>Password</th>
        </tr>
        </thead>
        <tbody>

            <tr class="danger">
                <td>${users.id}</td>
                <td>${users.name}</td>
                <td>${users.email}</td>
                <td>${users.password}</td>
                <td> <a href="/getId?editid=${users.id}&action=update" class="btn btn-default" role="button">Update</a></td>
                <td> <a href="/deleteById?editid=${users.id}&action=delete" class="btn btn-default" role="button">Delete</a>
            </tr>

        </tbody>
    </table>
</div>
</body>
</html>
