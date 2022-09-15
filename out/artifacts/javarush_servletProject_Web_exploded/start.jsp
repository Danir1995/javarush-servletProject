<%--
  Created by IntelliJ IDEA.
  User: danir
  Date: 13.09.2022
  Time: 1:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Start of adventure</title>
    <link href="style.css" rel="stylesheet">
</head>
<body>
<p> The sky is beautiful but disturbing...</p>
<p> No one around you.</p>
<p> All cars are empty and destroyed...</p>
<p> What will you do?</p>
<IMG class="displayed" src = "https://kartinkin.net/uploads/posts/2021-04/1617703247_12-p-razrushennii-gorod-art-art-kartinki-13.jpg" width = "400" height = "256">
<button class="btn" onclick="window.location='${pageContext.request.contextPath}/loser'">SCREAM AND CRY</button>
<button class="btnBack" onclick="window.location='${pageContext.request.contextPath}/searchHelp'">GO TO SEARCH SOMEBODY ALIVE</button>

</body>
</html>
