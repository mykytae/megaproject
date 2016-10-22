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
<h1>Administration Menu</h1>
<table border="2">
    <tr>
        <td>Add to Admin</td>
        <td>ID</td>
        <td>Name</td>
        <td>Bank Account</td>
    </tr>
    <c:set var="List" value="${userList}"></c:set>
    <c:forEach items="${List}" var="u" varStatus="status" >
        <tr>
            <td>
                <input type="checkbox">
            </td>
            <td>
                <c:out value="${u.id}"></c:out>
            </td>
            <td>
                <c:out value="${u.user}"></c:out>
            </td>
            <td>
                <c:out value="${u.bankAccount}"/>
            </td>
            <td>
                <form>
                    <input type="submit" value="Change">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
