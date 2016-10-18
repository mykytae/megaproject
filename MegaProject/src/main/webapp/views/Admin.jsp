<%--
  Created by IntelliJ IDEA.
  User: nik
  Date: 18.10.2016
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Administration Page</title>
</head>
<body>
<table border="2">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Bank Account</td>
    </tr>

    <c: forEach="${userList}" var="user" varStatus="status">
    <input type="checkbox">
    <tr>
        <td>${user.Id}</td>
        <td>${user.Name}</td>
        <td>${user.BankAccount}</td>
    </tr>
    <form>
        <input type="submit" value="Change">
    </form>
    </c:>
</table>

</body>
</html>
