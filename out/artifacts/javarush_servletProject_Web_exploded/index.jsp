<%--
  Created by IntelliJ IDEA.
  User: danir
  Date: 09.09.2022
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$JavaRush - quest$</title>
    <link href="style.css" rel="stylesheet">
</head>
<body>
<h1 class="text-center"> POST-APOCALYPTIC WORLD</h1>

<p>YEAR 2053.</p>
<IMG class="displayed" src = "https://images.stopgame.ru/uploads/images/263287/form/normal_1365437041.jpg" width = "400" height = "256">
<p>Something bad happened... You woke up in the centre of unknown town.</p>
<p>Do you remember your name?</p>
<form action="${pageContext.request.contextPath}/start" method="post">
    <div class="container">
        <input type="text" id="name" name="username">
    </div>
    <div class="container">
        <button type="submit" class="btnBack">YES</button>
    </div>
</form>
</body>
</html>

