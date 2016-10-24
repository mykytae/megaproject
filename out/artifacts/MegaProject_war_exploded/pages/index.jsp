<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<html>

<head>

<title>MEGAPROJECT</title>

    <title>MEGAPROJECT</title>
    <style type="text/css">
        .block1 {
            width: 200px;
            background: #ccc;
            border: solid 1px black;
            top: 50%;
            left: 50%;
            position: absolute;
            margin-top: -100px;
            margin-left: -100px;}
    </style>
</head>

<body>

<style type="text/css">
    body {background: url(images/background.jpg);}
</style>

<p><img src="images\p2r.png" alt="title" width="100%" height=320px0px></p>

<div align = "center" class= "block1">
    <form>
        <p>
            <span>Login:</span>
            <input type="text" name="Login">
            <span>Password:</span>
            <input type="password" name="Password">
        </p>
    </form>

    <p>
    <form action="${pageContext.servletContext.contextPath}/admin" method="get">
        <input type ="submit" name="submit" value="Ok">
    </form>
    <input type ="reset" name="reset" value="Clean">
    </p>

    <form action="${pageContext.servletContext.contextPath}/signup">
        <p>
            <input type="submit" name="SignUp" value="Sign Up">
        </p>
    </form>
</div>


</body>

</html>