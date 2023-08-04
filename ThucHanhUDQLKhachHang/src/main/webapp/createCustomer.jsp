<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08/07/2023
  Time: 09:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Customer</title>
</head>
<body>
<h1>Create Customer</h1>
<form action="createCustomer" method="post">
    <p>Name: <input type="text" name="name"></p>
    <p>Email: <input type="text" name="email"></p>
    <p>Address: <input type="text" name="address"></p>
    <button type="submit">Enter</button>
</form>
</body>
</html>
