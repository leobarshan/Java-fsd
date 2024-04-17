<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Implicit Objects</title>
</head>
<body>
    <h1>JSP Implicit Objects Demo</h1>
    
    <%-- Implicit Object: request --%>
    <p>Request URL: <%= request.getRequestURL() %></p>
    <p>Client IP Address: <%= request.getRemoteAddr() %></p>
    
    <%-- Implicit Object: response --%>
    <%
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
    %>
    
    <%-- Implicit Object: out --%>
    <%
        out.println("<p>This is printed using the out implicit object.</p>");
    %>
    
    <%-- Implicit Object: session --%>
    <% 
        session.setAttribute("username", "JohnDoe");
    %>
    <p>Session Attribute (username): <%= session.getAttribute("username") %></p>
    
    <%-- Implicit Object: application --%>
    <% 
        application.setAttribute("appVar", "SampleValue");
    %>
    <p>Application Attribute (appVar): <%= application.getAttribute("appVar") %></p>
    
    <%-- Implicit Object: pageContext --%>
    <%
        pageContext.setAttribute("pageVar", "PageContextValue");
    %>
    <p>Page Context Attribute (pageVar): <%= pageContext.getAttribute("pageVar") %></p>
</body>
</html>
