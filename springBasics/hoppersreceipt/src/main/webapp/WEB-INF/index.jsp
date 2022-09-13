<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8" />
    <title>Dojo Page</title>
</head>
<body>
test
<h1>
   Customer Name: <c:out value="${name}"></c:out>
</h1>
<h3>
    Item name: <c:out value="${itemName}"></c:out>
</h3>
</body>
