<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Administration Page</title>

    <style>
        <%@ include file="css/admin.css"%>
        <%@ include file="css/table.css"%>
    </style>

</head>

<body>
<div class="login">
    <div class="heading">

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
                    <a href="${pageContext.servletContext.contextPath}/home">
                        <i class="fa fa-laptop fa-2x"></i>
                        <span class="nav-text">
                            Home
                        </span>
                    </a>
                </li>
            </ul>
            <ul class="logout">
                <li>
                    <c:url value="/logout" var="logoutUrl"/>
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
                <th>Login</th>
                <th>Name</th>
                <th>Surname</th>
                <th>Email</th>
                <th>Bank Account</th>
                <th>Role</th>
                <th></th>
            </tr>
            </thead>

            <tbody>
            <c:set var="List" value="${userList}"></c:set>
            <c:forEach items="${List}" var="u" varStatus="status">
                <form action="${pageContext.servletContext.contextPath}/admin/add">
                    <tr>
                        <td>
                            <input type="checkbox" value="${u.id}" name="admin">
                        </td>
                        <td>
                            <input type="input" class="control" value="${u.login}" readonly
                                   name="login" id="login">
                        </td>
                        <td>
                            <input type="input" class="control" value="${u.name}" placeholder="${'empty field!'}"
                                   name="name" id="name">
                        </td>
                        <td>
                            <input type="input" class="control" value="${u.surname}" placeholder="${'empty field!'}"
                                   name="surname" id="surname">
                        </td>
                        <td>
                            <input type="input" class="control" value="${u.email}" placeholder="${'empty field!'}"
                                   name="email" id="email">
                        </td>

                        <c:forEach items="${bankList}" var="b" varStatus="status">
                            <c:if test="${b.userId==u.id}">
                                <td>
                                    000${b.accountNumber}
                                </td>
                            </c:if>
                        </c:forEach>

                        <c:forEach items="${roleList}" var="r" varStatus="status">
                            <c:if test="${r.userId==u.id}">
                                <td>
                                    <c:if test="${r.roleName eq 'ROLE_USER'}">
                                        User
                                    </c:if>
                                    <c:if test="${r.roleName eq 'ROLE_ADMIN'}">
                                        Admin
                                    </c:if>
                                </td>
                            </c:if>
                        </c:forEach>

                        <td>
                            <button type="submit" class="button" type="input" value="${u.id}" name="id" id="submit">
                                Save
                            </button>
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
