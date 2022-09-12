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
<p>Something bad happened... You woke up in the centre of desconhecido town.</p>
<p>Do you remember your name?</p>
<form>
    <p><input name="name"></p>
    <p><input type="submit" value="YES"></p>
</form>
<p> The sky is red and disturbing.</p>
<p> No one around you.</p>
<p> All cars are empty and destroyed...</p>
<p> What will you do?</p>
<button class="btn" onclick="window.location='/loser'">SCREAM AND CRY</button>
<button class="btnBack" onclick="window.location='/searchHelp'">GO TO SEARCH SOMEBODY ALIVE</button>

</body>
</html>

