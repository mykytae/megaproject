
<%--
  Created by IntelliJ IDEA.
  User: nik
  Date: 22.10.2016
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

</head>
<body>
    <h1>Sign Up on MEGAPROJECT Payments</h1>
    <p>
        <h2>Name</h2>
        <input type="input" name="name">
    </p>
    <p>
        <h2>Surname</h2>
        <input type="input" name="surname">
    </p>
    <p>
        <h2>Email</h2>
        <input type="input" name="email">
    </p>

    <p>
        <h2>Create your password</h2>
        <input type="password" id="pass">
    </p>
    <p>
        <h2>Repeate password</h2>
        <input type="password" id="repeatePass" onchange="srav()">
        <span id="span"></span>
    </p>

    <p>
        <form action="${pageContext.servletContext.contextPath}/">
            <input type="submit" value="Cancle">
        </form>
        <form action="${pageContext.servletContext.contextPath}/megaproject/home">
            <input type="submit" value="Ok">
        </form>
    </p>

</body>
</html>
