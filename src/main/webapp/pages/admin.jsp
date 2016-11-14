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
    
    <style>
    <%@ include file="css/admin.css"%>
    </style>

    <style>
        <%@ include file="css/table.css"%>
    </style>


</head>

<body>
<div class="login" >
    <div class="heading" >
        <h1>Administration<span class="yellow"> Page</span></h1>
        <nav class="main-menu">
    <ul>
        <li>
            <a href="${pageContext.servletContext.contextPath}/admin">
                <i class="fa fa-home fa-2x"></i>
                <span class="nav-text">
                            Admin page
                        </span>
            </a>

        </li>
        <li class="has-subnav">
            <a href="${pageContext.servletContext.contextPath}/home?admin=true">
                <i class="fa fa-laptop fa-2x"></i>
                <span class="nav-text">
                            Home
                        </span>
            </a>
        </li>
    </ul>
    <ul class="logout">
        <li>
            <c:url value="/logout" var="logoutUrl" />
            <a href="${logoutUrl}">
                <i class="fa fa-power-off fa-2x"></i>
                <span class="nav-text">
                            Logout
                        </span>
            </a>
        </li>
    </ul>
</nav>



<table class="container">
    <thead>
    <tr>
        <th>Admin</th>
        <th >Login</th>
        <th >Name</th>
        <th >Surname</th>
        <th >Email</th>
        <th >Bank Account</th>
        <th >Role</th>
        <th ></th>
    </tr>
    </thead>

    <tbody>
    <c:set var="List" value="${userList}"></c:set>
    <c:forEach items="${List}" var="u" varStatus="status" >
        <form action="${pageContext.servletContext.contextPath}/admin/add">
        <tr>
            <td >

                <input type="checkbox" value="${u.id}" name="admin">

            </td>
            <td >
                <input type="input" class="control" value="${u.login}" placeholder="${u.login}" name="login">
            </td >
            <td >
                <input type="input" class="control" value="${u.name}" placeholder="${u.name}" name="name">
            </td>
            <td >
                <input type="input" class="control" value="${u.surname}" placeholder="${u.surname}" name="surname">
            </td>
            <td >
                <input type="input" class="control" value="${u.email}" placeholder="${u.email}" name="email">
            </td>
            <td >

            </td>
            <td >

            </td>
            <td >
                <button type="input" value="${u.id}" name="id">Save</button>
            </td>
        </tr>
        </form>
    </c:forEach>
    </tbody>
</table>

</div>
</div>
</body>
</html>
