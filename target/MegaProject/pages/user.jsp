<%@ page import="java.text.DecimalFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <style>
        <%@ include file="css/admin.css"%>
    </style>

    <style>
        <%@ include file="css/user.css"%>
    </style>
</head>

<body>

<nav class="main-menu">
    <ul>
        <c:if test="${role.roleName eq 'ROLE_ADMIN'}">
            <li>
                <a href="${pageContext.servletContext.contextPath}/admin">
                    <i class="fa fa-home fa-2x"></i>
                    <span class="nav-text">
                            Admin page
                        </span>
                </a>

            </li>
        </c:if>
        <li class="has-subnav">
            <a href="#">
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


<div class="link-box"></div>
<div class="container">
    <div class="top">
        <div class="hamburger">
            <span></span>
            <span></span>
            <span></span>
        </div>
        <div class="wrap">
            <a href="${pageContext.servletContext.contextPath}/pay" class="button" >Pay any purchase</a>
        </div>
        <div class="card">
            <div class="card-front">
                <div class="number">
                    <code>0000 000${bankAccount.accountNumber}</code>
                </div>
                <div class="due-date">
                    Due 01/30
                </div>
                <svg class="card-back"  width="101.25" height="35">
                    <g transform="matrix(1.25,0,0,-1.25,0,35)">
                        <g transform="scale(0.1,0.1)">
                            <path d="m 401.02,266.949 -54.11,-252.9685 -65.43,0 54.11,252.9685 65.43,0 z m 275.308,-163.359 34.492,95 19.801,-95 -54.293,0 z m 73.051,-89.6095 60.543,0 -52.852,252.9685 -55.898,0 c -12.5,0 -23.121,-7.34 -27.813,-18.59 L 575.16,13.9805 l 68.711,0 13.668,37.7695 83.941,0 7.899,-37.7695 z M 578.551,96.5586 c 0.277,66.7614 -92.34,70.4294 -91.672,100.2694 0.191,9.07 8.82,18.711 27.73,21.211 9.411,1.211 35.231,2.152 64.532,-11.32 l 11.519,53.633 c -15.738,5.699 -36.051,11.207 -61.211,11.207 -64.679,0 -110.23,-34.411 -110.621,-83.629 -0.387,-36.45 32.5,-56.719 57.301,-68.828 C 501.641,106.68 510.199,98.75 510.078,87.6484 509.922,70.6992 489.77,63.1992 470.941,62.8906 438.051,62.3789 418.91,71.7891 403.672,78.8594 L 391.84,23.4297 C 407.109,16.3984 435.352,10.3086 464.609,10 c 68.75,0 113.75,33.9805 113.942,86.5586 M 307.5,266.949 201.48,13.9805 l -69.21,0 -52.1489,201.8785 c -3.1719,12.422 -5.9414,16.993 -15.5508,22.18 C 48.8281,246.602 22.8906,254.609 0,259.609 l 1.55859,7.34 111.33241,0 c 14.218,0 26.988,-9.449 30.199,-25.777 l 27.57,-146.4103 68.09,172.1873 68.75,0 z" style="fill:#fff;"/>
                        </g>
                    </g>
                </svg>
            </div>

            <div class="card-back">
                <div class="bal">Balance</div>
                <div class="bal-value">
                    <span>$</span>${bankAccount.accountValue}
                </div>
            </div>
        </div>
        <div class="wrap2">
            <a href="${pageContext.servletContext.contextPath}/pay?increase=true" class="button">Increase the balance</a>
        </div>
    </div>
    <div class="bottom">
        <ul class="legend">
        <li class="income">Welcome to personal account, ${login} </li>
            <p><li class="expend">${name} ${surname}</li></p>
        </ul>
        <div class="drawer">
                <ul>
                    <c:forEach items="${historyList}" var="historyList" varStatus="status">


                        <c:if test="${historyList.operation eq 'income'}">
                     <li>
                         <span>${historyList.date} </span>
                         <span class="income">
            <svg class="icon" viewBox="0 0 22 22">
      <path fill="#148AFF" d="M3,6H21V18H3V6M12,9A3,3 0 0,1 15,12A3,3 0 0,1 12,15A3,3 0 0,1 9,12A3,3 0 0,1 12,9M7,8A2,2 0 0,1 5,10V14A2,2 0 0,1 7,16H17A2,2 0 0,1 19,14V10A2,2 0 0,1 17,8H7Z" />
  </svg>Income
          </span>
                         <span>Received $${historyList.money}in deposits</span>
                     </li>
                 </c:if>



                <c:if test="${historyList.operation eq 'food'}">
                <li>
                    <span>${historyList.date} </span>
                    <span class="expend">
              <svg class="icon" viewBox="0 0 22 22">
      <path fill="#f44" d="M4,2H19L17,22H6L4,2M6.2,4L7.8,20H8.8L7.43,6.34C8.5,6 9.89,5.89 11,7C12.56,8.56 15.33,7.69 16.5,7.23L16.8,4H6.2Z" />
  </svg>Expend
          </span>
                    <span>Spending $${historyList.money} on ${historyList.reason} </span>
                </li>
                </c:if>


                        <c:if test="${historyList.operation eq 'dinner'}">
                <li>
                    <span>${historyList.date} </span>
                    <span class="expend">
            <svg class="icon" viewBox="0 0 22 22">
              <path fill="#FFA831" d="M15.5,21L14,8H16.23L15.1,3.46L16.84,3L18.09,8H22L20.5,21H15.5M5,11H10A3,3 0 0,1 13,14H2A3,3 0 0,1 5,11M13,18A3,3 0 0,1 10,21H5A3,3 0 0,1 2,18H13M3,15H8L9.5,16.5L11,15H12A1,1 0 0,1 13,16A1,1 0 0,1 12,17H3A1,1 0 0,1 2,16A1,1 0 0,1 3,15Z" />
            </svg>Expend
          </span>
                    <span>Spending $${historyList.money} on ${historyList.reason}</span>
                </li>
                        </c:if>


                        <c:if test="${historyList.operation eq 'cloth'}">
                        <li>
                    <span>${historyList.date} </span>
                    <span class="expend">
            <svg class="icon" viewBox="0 0 22 22">
              <path fill="#CA9DF8" d="M16,21H8A1,1 0 0,1 7,20V12.07L5.7,13.12C5.31,13.5 4.68,13.5 4.29,13.12L1.46,10.29C1.07,9.9 1.07,9.27 1.46,8.88L7.34,3H9C9,4.1 10.34,5 12,5C13.66,5 15,4.1 15,3H16.66L22.54,8.88C22.93,9.27 22.93,9.9 22.54,10.29L19.71,13.12C19.32,13.5 18.69,13.5 18.3,13.12L17,12.07V20A1,1 0 0,1 16,21M20.42,9.58L16.11,5.28C15.8,5.63 15.43,5.94 15,6.2C14.16,6.7 13.13,7 12,7C10.3,7 8.79,6.32 7.89,5.28L3.58,9.58L5,11L8,9H9V19H15V9H16L19,11L20.42,9.58Z" />
            </svg>Expend
          </span>
                    <span>Spending $${historyList.money} on ${historyList.reason}</span>
                </li>
                        </c:if>

                    </c:forEach>
          </ul>

        </div>
    </div>
</div>

</body>
</html>
