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
        <style>
            <%@ include file="css/admin.css"%>
        </style>

        <style>
            <%@ include file="css/pay.css"%>
        </style>

        <SCRIPT LANGUAGE="JavaScript">

            /*function pay()
            {
                $(".receipt").slideUp("slow");
                $(".paid").slideDown("slow");
            }*/
            function checkAll () {
                payButton = document.getElementById("pay");
                var comment = document.getElementById("comment");
                var money = document.getElementById("money");
                var sources = document.getElementById("sources");
                var spanCheck = document.getElementById("error");
                if(comment.value.length==0 | money.value.length==0 | sources.value=='dis' | comment.value.length < 5 | comment.value.length > 95 | (money.value).match(/^[-\+]?\d+/) === null | parseInt(money.value)<0 | sources.value=='dis'){
                    payButton.disabled = true;
                    spanCheck.innerHTML = "Input all fields correctly!";
                }
                else{
                    payButton.disabled = false;
                    spanCheck.innerHTML = "";
                }
            }

             function  checkComment() {
                var payButton = document.getElementById("pay");
                var comment = document.getElementById("comment");
                var spanCheck = document.getElementById("error");

                if (comment.value.length < 5 || comment.value.length > 95) {
                    payButton.disabled = true;
                    spanCheck.innerHTML = "Comment is too small or very large!";
                }
                else {
                    spanCheck.innerHTML = "";
                    checkAll ();

                }
            }

                function checkMoney(){
                    payButton = document.getElementById("pay");
                    var money = document.getElementById("money");
                    var moneyCheck = document.getElementById("moneyError");
                if( (money.value).match(/^[-\+]?\d+/) === null | parseInt(money.value)<0 ) {
                    payButton.disabled = true;
                    moneyCheck.innerHTML = "Input the the correct amount of money!";
                }
                else {
                    moneyCheck.innerHTML = "";
                    checkAll ();
                    }
            }

            function checkSources(){
                payButton = document.getElementById("pay");
                var sources = document.getElementById("sources");
                var Check = document.getElementById("error");
                if( sources.value=='dis' ) {
                    payButton.disabled = true;
                    Check.innerHTML = "Choose! 'What we pay for?'!";
                }
                else {
                    Check.innerHTML = "";
                    checkAll ();
                }
            }


        </script>


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
    <form action="${pageContext.servletContext.contextPath}/payment" method="post">
    <div class="paid">
        <p>Paid successfully</p>
        <input type="submit" value="Home page" />
    </div>
    <div class="receipt">
        <div class="paper">
            <div class="title">Receipt</div>
            <div class="date">Date time: 20/07/2013</div>
            <table>
                <tbody>
                <tr><td>

                    <c:if test="${not empty increase}">
                        <select name="sources"  id="sources" class="select-style" onchange="checkMoney(), checkComment(),checkSources()" value="income"><option value="dis"  disabled selected>Increase wallet</option>
                            <option value="income">Income</option>
                        </select>
                    </c:if>

                    <c:if test="${empty increase}">
                    <select name="sources" id="sources" class="select-style" onchange="checkMoney(), checkComment(),checkSources()"><option value="dis"  disabled selected>What we pay for ?</option>
                    <option value="cloth">Cloth</option>
                    <option value="dinner">Dinner</option>
                    <option value="food">Foodstuffs</option>
                    </select>
                    </c:if>

                </td>
                    <td class="right"><input type="input" placeholder="Comment..." size="12" class="inp" name="reason" id="comment" onchange="checkMoney(), checkSources(), checkComment()"> </td>
                    <td class="right"><input type="input" placeholder="$" size="3" class="inp" name="money" id="money" onchange="checkComment(),checkSources() ,checkMoney()"> </td>
                </tr>

                <tr>
                    <td colspan="2" class="center" >
                    <input type="submit" value="Pay Now" id="pay" onClick="pay()" onmousemove="checkAll()" onmousedown="checkAll()"/>
                        <p><span id="error" class="error"></span></p>
                        <span id="moneyError" class="error"></span>
                    </td>
                </tr>
                </tbody>
            </table>
            <div class="sign center">
                <div class="barcode"></div>
                bankAccount
            </div>
        </div>
    </div>
    </form>
    </div>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

</body>
</html>
