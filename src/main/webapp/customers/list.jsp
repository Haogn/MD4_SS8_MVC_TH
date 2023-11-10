<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/9/2023
  Time: 9:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customers List</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/customerss?action=create">Create new customer</a>
</p>

<table border="1">
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["customerss"]}' var="customers" >
        <tr></tr>

    </c:forEach>
</table>
</body>
</html>
