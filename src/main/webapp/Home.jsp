<%-- 
    Document   : Home
    Created on : Feb 5, 2018, 11:20:10 PM
    Author     : STAMPSTOOD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@page import="com.project.model.HelloClass"%>--%>
<!--<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="CSS/Style.css">
        <title></title>
    </head>
    <body>
        <h1>INT206 SOFTWARE PROJECT MANAGEMENT</h1>

        <p>" Hello World "</p><br><br><br>
        <p>Test : </p>
        <img src="Image/world.gif">
    </body>
</html>-->

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="CSS/Style.css">
	<link href="https://fonts.googleapis.com/css?family=Amatic+SC" rel="stylesheet">
	<title>Homepage | Hello Wolrd</title>
</head>
<body>
	<br><br>
	<h1>INT206 SOFTWARE PROJECT MANAGEMENT</h1>
	<div class="sq">
		<br>
		
<div class="sq1">
	<br>
	
	<div class="sq2">
	<br>
	
	<p>
	<marquee behavior="alternate" width="10%">🌟</marquee>
        <%=request.getAttribute("message")%>
	<marquee behavior="alternate" width="10%">
		 🌟</marquee></p><br><br>
	<img src="Image/world.gif">
	<br><br><br><br><br>
	</div>
	<br>
</div>
<br>
</div>

</body>
</html>