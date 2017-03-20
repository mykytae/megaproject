<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
    <title>Registration</title>

    <SCRIPT LANGUAGE="JavaScript">
        <%@ include file="js/registration.js" %>
    </script>

    <style>
        <%@ include file="css/style.css" %>
    </style>

</head>

<body>
<div class="login">
    <div class="heading">
        <h2> Megaproject Sign Up</h2>
        <p>
            <span id="allInputs" class="error"></span>
        </p>

        <form action="${pageContext.servletContext.contextPath}/register" method="post">

            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" class="form-control" placeholder="Create login (5-25 chars) " name="login" id="login"
                       onchange="loginCheck()">
            </div>
            <span class="error" id="loginSpan">${errorLogin}</span>
            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" class="form-control" placeholder="Your name (2-28 chars)" name="name" id="name"
                       onchange="nameCheck()">
            </div>
            <span class="error" id="nameSpan"></span>
            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" class="form-control" placeholder="Your surname" name="surname" id="surname">
            </div>
            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" class="form-control" placeholder="Your email adress" name="email" id="email">
            </div>
            <span class="error">${errorEmail}</span>


            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input type="password" class="form-control" id="pass" placeholder="Create your password" name="password"
                       onchange="comparePasswords()">
            </div>
            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input type="password" class="form-control" placeholder="Repeate your password" id="repeatePass"
                       onchange="comparePasswords()">
            </div>
            <span id="error" class="error"></span>


            <button type="submit" value="Ok" class="float" id="okButton" onmousemove="registration()"
                    onmouseover="registration()">Ok
            </button>
        </form>

        <p>
        <form action="${pageContext.servletContext.contextPath}/">
            <button type="submit" class="float">Cancle</button>
        </form>
        </p>
    </div>
</div>
</body>
</html>
