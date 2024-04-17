<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Forwarded JSP File</title>
</head>
<body>
    <h2>Forwarded JSP File</h2>
    
    <p>This is the forwarded JSP file.</p>
    
    <%
        // Retrieve the message attribute set in the main JSP file
        String message = (String)request.getAttribute("message");
        out.println("<p>Message from main JSP file: \n\tHello World!This is Barshan</p>");
    %>
</body>
</html>
