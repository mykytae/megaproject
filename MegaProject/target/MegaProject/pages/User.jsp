<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personal page</title>
</head>
<body>

<h1>Welcome to your account ${name} ${surname} !!</h1>

<p>
    <c:url value="/logout" var="loginUrl" />
<form action="${loginUrl}">
    <button type="submit">Logout</button>
</form>
</p>

</body>
</html>
