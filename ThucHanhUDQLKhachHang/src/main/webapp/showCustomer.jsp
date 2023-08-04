<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/07/2023
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        th{
            width: auto;
        }
    </style>
</head>
<center>
    <body>
    <div>
        <h1>Customer List</h1>
        <a href="/createCustomer.jsp">Add Customer</a>
        <table border="1px">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Address</th>
                <th colspan="2" style="text-align: center">Action</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach var="customer" items="${customer}">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.name}</td>
                    <td>${customer.email}</td>
                    <td>${customer.address}</td>
                    <td><a href="/editCustomer?id=${customer.id}" type="button" class="btn btn-warning">Edit</a></td>
                    <form action="/deleteCustomer" method="get">
                        <td>
                            <input type="hidden" value="${customer.id}" name="id">
                            <button type="submit" class="btn btn-danger">Delete</button>
                        </td>
                    </form>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    </body>
</center>
</html>
