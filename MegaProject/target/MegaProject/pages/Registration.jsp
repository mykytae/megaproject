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

                <form action="${pageContext.servletContext.contextPath}/register" method="post">

                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="fa fa-user"></i></span>
                        <input type="text" class="form-control" placeholder="Create your login" name="login">
                    </div>
                    <span class="error">${errorLogin}</span>
                    <div class="input-group input-group-lg">
                         <span class="input-group-addon"><i class="fa fa-user"></i></span>
                         <input type="text" class="form-control" placeholder="Your name" name="name">
                    </div>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="fa fa-user"></i></span>
                        <input type="text" class="form-control" placeholder="Your surname" name="surname">
                    </div>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="fa fa-user"></i></span>
                        <input type="text" class="form-control" placeholder="Your email adress" name="email">
                    </div>
                    <span class="error">${errorEmail}</span>


                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                        <input type="password" class="form-control" id="pass" placeholder="Create your password" name="password">
                    </div>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                         <input type="password" class="form-control" placeholder="Repeate your password" id="repeatePass" onchange="srav()">
                    </div> <span id="span" class="error"></span>


                    <button type="submit" value="Ok" class="float">Ok</button>
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
