<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Page Directive Demo</title>
</head>
<body>
    <h1>Page Directive Demo</h1>
    <% 
        Date currentDate = new Date();
    %>
    <p>Current Date and Time: <%= currentDate %></p>
</body>
</html>
