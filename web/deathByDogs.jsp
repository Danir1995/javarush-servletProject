<%--
  Created by IntelliJ IDEA.
  User: danir
  Date: 13.09.2022
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Death by dogs</title>
    <link href="style.css" rel="stylesheet">
</head>
<body>
<p><IMG class="displayed" src = "https://st3.depositphotos.com/1695244/32109/i/600/depositphotos_321091354-stock-photo-trio-black-anubis-hounds-hellhound.jpg" width = "400" height = "256"></p>
<p>Your scream has been heard, three hellhounds came to eat you.<p>
<p>YOU LOSE<p>
<p>START AGAIN?</p>
<p>User name is <%=session.getAttribute("user")%>. Number of attempts: <%=session.getAttribute("count")%>.</p>
<button class="btn" onclick="window.location='./index.jsp'">YES</button>
</body>
</html>
