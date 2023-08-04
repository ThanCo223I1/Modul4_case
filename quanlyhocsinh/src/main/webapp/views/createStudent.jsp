<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/07/2023
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center">
    <h1>Create Student</h1>

    <form action="/createStudent" method="post">
    <p>id   : <input type="text" name="id"></p>
    <p>Name : <input type="text" name="name"></p>
    <p>Age  : <input type="text" name="age"></p>
    <p>Img  : <input type="text" name="img"></p>
    <button type="submit">Enter</button>
</form>
</div>
</body>
</html>
