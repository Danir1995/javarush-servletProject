<%--
  Created by IntelliJ IDEA.
  User: danir
  Date: 13.09.2022
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hospital inside</title>
    <link href="style.css" rel="stylesheet">
</head>
<body>
<p>You entered in hospital... </p>
<p><IMG class="displayed" src = "https://static8.depositphotos.com/1027309/944/i/600/depositphotos_9449756-stock-photo-abandoned-surgery-room.jpg" width = "256" height = "400"></p>
<p>-Oh my God! It is so dirty inside! If I had a broom I would broom this entire floor!</p>
<p>-Ok. Let's find the administration office.</p>
<p>You found the administration office on the second floor.</p>
<p>Inside you met a dead body of a doctor. And near his leg you noticed a package of medicine.</p>
<p>Will you take it or do you feel disgusted to touch it?</p>
<button class="btnGreen" onclick="window.location='./takeItem?item=medicine'">TAKE IT</button>
<button class="btnRed" onclick="window.location='./shop.jsp'">REFUSE IT</button>

</body>
</html>
