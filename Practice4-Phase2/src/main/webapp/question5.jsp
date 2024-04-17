<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
    <title>Session Handling in JSP</title>
</head>
<body>
    <h1>Session Handling in JSP</h1>
    
    <% 
        // Retrieve existing session or create a new one if it doesn't exist
        HttpSession s = request.getSession();
        
        // Check if the session is new
        boolean isNewSession = s.isNew();
        
        if(isNewSession) {
            s.setAttribute("username", "Guest");
    %>
            <p>Welcome! This is a new session.</p>
    <%
        } else {
    %>
            <p>Welcome back, <%= session.getAttribute("username") %>!</p>
    <%
        }
    %>
    
    <% 
        // Set session attributes
        s.setAttribute("loggedIn", true);
        s.setAttribute("lastAccessTime", new java.util.Date());
    %>
    
    <p>Session ID: <%= s.getId() %></p>
    <p>Username: <%= s.getAttribute("username") %></p>
    <p>Logged In: <%= s.getAttribute("loggedIn") %></p>
    <p>Last Access Time: <%= session.getAttribute("lastAccessTime") %></p>
    
    <% s.invalidate(); %>
    
</body>
</html>
