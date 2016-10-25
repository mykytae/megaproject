<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<html>

<head>

<title>MEGAPROJECT</title>
    <style>
    <%@ include file="css/style.css" %>
    </style>
</head>

<body>

<div class="login" >
    <h1>Megaproject Payments</h1>
    <div class="heading">
        <h2>Sign in</h2>
    <form action="#">
        <div class="input-group input-group-lg">
            <span class="input-group-addon"><i class="fa fa-user"></i></span>
            <input type="text" class="form-control" placeholder="Username" name="Login">
        </div>

        <div class="input-group input-group-lg">
            <span class="input-group-addon"><i class="fa fa-lock"></i></span>
            <input type="password" class="form-control" placeholder="Password" name="Password">
        </div>

        <form action="${pageContext.servletContext.contextPath}/admin" method="get">
            <button type="submit" class="float">Ok</button>
        </form>
        <form>
            <button type="submit" class="float">Clean</button>
        </form>

        <form action="${pageContext.servletContext.contextPath}/signup">
            <button type="submit" class="float">Sign Up</button>
        </form>
    </form>
    </div>
</div>


</body>

</html>