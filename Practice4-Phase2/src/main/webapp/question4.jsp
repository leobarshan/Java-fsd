<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Action Tags Demo</title>
</head>
<body>
    <h1>JSP Action Tags Demo</h1>
    
    <jsp:include page="included1.jsp">
        <jsp:param name="username" value="JohnDoe" />
    </jsp:include>
    
    <jsp:forward page="forwarded.jsp">
        <jsp:param name="username" value="JohnDoe" />
    </jsp:forward>
    
</body>
</html>
