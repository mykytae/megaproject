<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
    <title>Registration</title>

    <SCRIPT LANGUAGE="JavaScript">

        function srav() {
            var error = document.getElementById('error');
            submitButton = document.getElementById('okButton');
            var pass = document.getElementById('pass');
            var repeate = document.getElementById('repeatePass');
            if (pass.value != repeate.value) {
                submitButton.disabled = true;
                error.innerHTML = "Password mismatch!!!";
            }
            else {
                error.innerHTML = " ";
                registration();
            }
        }

        function registration() {
            var login = document.getElementById('login');
            var name = document.getElementById('name');
            var surname = document.getElementById('surname');
            var email = document.getElementById('email');
            var pass = document.getElementById('pass');
            var inputsSpan = document.getElementById('allInputs');
            submitButton = document.getElementById('okButton');

            if (login.value.length == 0 | name.value.length == 0 | surname.value.length == 0 | email.value.length == 0 | pass.value.length == 0) {
                submitButton.disabled = true;
                inputsSpan.innerHTML = "There are empty fields!";
            }
            else {
                inputsSpan.innerHTML = "";
                submitButton.disabled = false;
            }
        }

        function loginCheck() {
            var loginSpan = document.getElementById('loginSpan');
            var login = document.getElementById('login');
            submitButton = document.getElementById('okButton');

            if (login.value.length < 5 || login.value.length > 25) {
                submitButton.disabled = true;
                loginSpan.innerHTML = "Incorrect login length!";
            }
            else {
                loginSpan.innerHTML = "";
                registration();
            }
        }

        function nameCheck() {
            var name = document.getElementById('name');
            submitButton = document.getElementById('okButton');
            var nameSpan = document.getElementById('nameSpan');
            if (name.value.length < 2 || name.value.length > 28) {
                submitButton.disabled = true;
                nameSpan.innerHTML = "Incorrect name length!";
            }
            else {
                registration();
                nameSpan.innerHTML = "";
            }
        }

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
                       onchange="srav()">
            </div>
            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input type="password" class="form-control" placeholder="Repeate your password" id="repeatePass"
                       onchange="srav()">
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
