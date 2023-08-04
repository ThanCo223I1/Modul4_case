<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08/07/2023
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Customer</title>
</head>
<body>
<form method="post" >
    <h1>Customer Edit</h1>
    <input type="hidden" value="${customer.id}" name="id"><br>
    <input type="text" value="${customer.name}" name="name"><br>
    <input type="text" value="${customer.email}" name="email"><br>
    <input type="text" value="${customer.address}" name="address"><br>
    <button type="submit">Enter</button>
</form>
</body>
</html>
