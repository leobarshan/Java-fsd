<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Custom Tag Demo</title>
</head>
<body>
    <h1>Custom Tag Demo</h1>
    
    <%-- Define a custom tag directly in the JSP --%>
    <%!
        public class CustomTag {
            public void printHello(javax.servlet.jsp.JspWriter out) throws java.io.IOException {
                out.println("<p>Hello from Custom Tag!</p>");
            }
        }
    %>
    
    <%-- Use the custom tag --%>
    <% CustomTag customTag = new CustomTag(); customTag.printHello(out); %>
</body>
</html>
