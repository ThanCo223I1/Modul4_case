<%--
  Created by IntelliJ IDEA.
  User: johntoan98gmail.com
  Date: 07/07/2023
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            text-align: center;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Striped Rows</h2>
    <a href="/views/createStudent.jsp" type="button">Add Student</a>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>age</th>
            <th>img</th>
            <th colspan="2" style="text-align: center">Action</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="s" items="${students}">
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>${s.age}</td>
                <td><img src="${s.img}" width="300" height="350"></td>
                <td><a href="/editStudent?id=${s.id}" type="button" class="btn btn-warning">Edit</a></td>
                <form action="/deleteStudent" method="get">
                    <td>
                        <input type="hidden" value="${s.id}" name="id">
                        <button type="submit" class="btn btn-danger">Delete</button>
                    </td>
                </form>
            </tr>
        </c:forEach>


        </tbody>
    </table>
</div>

</body>
</html>
