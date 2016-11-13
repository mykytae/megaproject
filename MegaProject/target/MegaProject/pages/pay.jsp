<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nik
  Date: 11.11.2016
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Payment page</title>
    <head>
        <title>Home</title>
        <style>
            <%@ include file="css/admin.css"%>
        </style>

        <style>
            <%@ include file="css/pay.css"%>
        </style>

        <SCRIPT LANGUAGE="JavaScript">

            function pay()
            {
                $(".receipt").slideUp("slow");
                $(".paid").slideDown("slow");
            }

        </script>

    </head>
</head>
<body>

<nav class="main-menu">
    <ul>
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


<div class="container">
    <div class="tab"></div>
    <div class="paid"><p>Receipt Paid successfully</p></div>
    <div class="receipt">
        <div class="paper">
            <div class="title">Receipt</div>
            <div class="date">Date time: 20/07/2013</div>
            <table>
                <tbody>
                <tr><td>

                    <c:if test="${not empty increase}">
                        <select name="sources" id="sources" class="select-style"><option value="dis" disabled selected>Increase wallet</option>
                            <option value="income">Income</option>
                        </select>
                    </c:if>

                    <c:if test="${empty increase}">
                    <select name="sources" id="sources" class="select-style"><option value="dis" disabled selected>What we pay for ?</option>
                    <option value="cloth">Cloth</option>
                    <option value="dinner">Dinner</option>
                    <option value="food">Foodstuffs</option>
                    </select>
                    </c:if>

                </td>
                    <td class="right"><input type="input" placeholder="Comment..." size="10" class="inp"> </td>
                    <td class="right"><input type="input" placeholder="$" size="3" class="inp"> </td>
                </tr>
                <tr>
                    <td colspan="2" class="center">
                        <form action="${pageContext.servletContext.contextPath}/payments" method="post">
                    <input type="button" value="Pay Now" onClick="pay()"/>
                        </form>
                    </td>
                </tr>
                </tbody>
            </table>
            <div class="sign center">
                <div class="barcode"></div>
                <br/>
                bankAccount
                <br/>
                <div class="thankyou">
                    Thank you for your business
                </div>
            </div>
        </div>

    </div>
    </div>
</body>
</html>
