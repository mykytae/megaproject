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

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
    <link rel="stylesheet" href="css/admin.css">

</head>

<body>


<h1>Administration Menu</h1>

<p>
    <c:url value="/logout" var="loginUrl" />
    <form action="${loginUrl}">
    <button type="submit">Logout</button>
    </form>
</p>

<table>
    <thead>
    <tr>
        <td>Add to Admin</td>
        <td>ID</td>
        <td>Name</td>
        <td>Surname</td>
        <td>Role</td>
    </tr>
    </thead>
    <tbody>
    <c:set var="List" value="${userList}"></c:set>
    <c:forEach items="${List}" var="u" varStatus="status" >
        <tr>
            <td>
                <input type="checkbox">
            </td>
            <td>
                <c:out value="${u.login}"></c:out>
            </td>
            <td>
                <c:out value="${u.name}"></c:out>
            </td>
            <td>
                <c:out value="${u.surname}"/>
            </td>
            <td>
                <i class="material-icons button edit">edit</i>
                <i class="material-icons button delete">delete</i>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
