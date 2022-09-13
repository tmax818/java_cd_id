<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.Date"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Demo JSP</title>
</head>
<body>
<h1>Hello World</h1>

<!-- Inserting a for loop into your jsp -->
<% for(int i = 0; i < 5; i++) { %>
<h1><%= i %></h1>
<% } %>
<p>The time is: <%= new Date() %></p>

<h1>Two plus two is: </h1>
    <h2><c:out value="${2+2}"/></h2>
</body>
</html>
