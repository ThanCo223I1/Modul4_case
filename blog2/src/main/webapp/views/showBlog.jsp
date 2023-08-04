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
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<center>
<body>
<h1>List Blog</h1>
<a href="createBlog">Create Blog</a>
<div class="container">
  <table class="table table-striped">
    <thead>
    <tr>
      <th>ID_Blog</th>
      <th>Title_Blog</th>
      <th>Content_Blog</th>
      <th>Creation-Date</th>
      <th colspan="2" style="text-align: center">Action</th>
      <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="blog" items="${blogs}">
      <tr>
        <td>${blog.id_blog}</td>
        <td>${blog.title_blog}</td>
        <td>${blog.content_blog}</td>
        <td>${blog.creation_date}</td>
        <td><a href="/editBlog?id=${blog.id_blog}" type="button" class="btn btn-warning">Edit</a></td>
        <td><a href="/deleteBlog?id=${blog.id_blog}" type="button" class="btn btn-warning">Delete</a></td>
        </form>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>
</body>
</center>
</html>
