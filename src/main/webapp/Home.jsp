<%-- 
    Document   : Home
    Created on : Feb 5, 2018, 11:20:10 PM
    Author     : STAMPSTOOD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@page import="com.project.model.HelloClass"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="CSS/Style.css">
        <title></title>
    </head>
    <body>
        <h1>INT206 SOFTWARE PROJECT MANAGEMENT</h1>

        <p>" Hello World "</p><br><br><br>
        <p>Test : <%=request.getAttribute("message")%> </p>
        <img src="Image/world.gif">
    </body>
</html>
