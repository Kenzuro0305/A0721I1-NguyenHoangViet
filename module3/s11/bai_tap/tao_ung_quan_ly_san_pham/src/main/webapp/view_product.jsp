<%--
  Created by IntelliJ IDEA.
  User: vietp
  Date: 04/04/2022
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>View Product</h1>
<p>
    <a href="/products">Back Product List</a>
</p>
<table>
    <tr>
        <td>ID: </td>
        <td><c:out value="${product.getId()}"></c:out></td>
    </tr>
    <tr>
        <td>Name: </td>
        <td><c:out value="${product.name}"></c:out></td>
    </tr>
    <tr>
        <td>Brand: </td>
        <td><c:out value="${product.brand}"></c:out></td>
    </tr>
    <tr>
        <td>Quatity: </td>
        <td><c:out value="${product.quatity}"></c:out></td>
    </tr>
    <tr>
        <td>Status: </td>
        <td><c:out value="${product.status}"></c:out></td>
    </tr>
</table>
</body>
</html>
