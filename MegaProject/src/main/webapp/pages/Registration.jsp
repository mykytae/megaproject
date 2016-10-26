<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
    <title>Registration</title>

    <SCRIPT LANGUAGE="JavaScript">

        function srav(){
            var pass = document.getElementById('pass');
            var repeate = document.getElementById('repeatePass');
            var span = document.getElementById('span');
            if (pass.value != repeate.value){
                span.innerHTML="Password mismatch!!!";
            }
            else {
                span.innerHTML=" ";
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

            <form action="#">

                <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" class="form-control" placeholder="Create your login">
            </div>
            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" class="form-control" placeholder="Your name">
            </div>
            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" class="form-control" placeholder="Your surname">
            </div>
            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" class="form-control" placeholder="Your email adress">
            </div>


            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input type="password" class="form-control" id="pass" placeholder="Create your password">
            </div>
            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input type="password" class="form-control" placeholder="Repeate your password" id="repeatePass" onchange="srav()">
            </div> <span id="span" class="error"></span>

            <form action="${pageContext.servletContext.contextPath}/register">
                <button type="submit" value="Ok" class="float">Ok</button>
            </form>


            <p>
                <form action="${pageContext.servletContext.contextPath}/">
                     <button type="submit" class="float">Cancle</button>
                 </form>
            </p>

            </form>
        </div>
     </div>
</body>
</html>
