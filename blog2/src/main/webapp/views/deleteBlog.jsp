<!DOCTYPE html>
<html lang="en">
<head>
    <title>Delete Blog</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<center>
    <body>
    <h1>Delete Blog</h1>
    <a href="showBlog.jsp">Back To List Blog</a>
    <div class="container">
        <form method="post">
            <table class="table table-striped">
                <tr>
                    <th>ID_Blog</th>
                    <th>Title_Blog</th>
                    <th>Content_Blog</th>
                    <th>Creation-Date</th>
                </tr>
                <tbody>
                <tr>
                    <td>${blog.id_blog}</td>
                    <td>${blog.title_blog}</td>
                    <td>${blog.content_blog}</td>
                    <td>${blog.creation_date}</td>
                </tr>
                </tbody>
            </table>
            <button type="submit">Delete Blog</button>
        </form>
    </div>
    </body>
</center>
</html>
