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
</head>
<body>

<div class="container">
    <h1>Edit Blog</h1>
    <form method="post">
        <div class="form-group">
            <input type="hidden" class="form-control" name="id_blog"  value="${blog.id_blog}">
        </div>
        <div class="form-group">
            Title Blog: <input type="text" class="form-control" name="title_blog"  value="${blog.title_blog}">
        </div>
        <div class="form-group">
            Content Blog: <input type="text" class="form-control" name="content_blog" value="${blog.content_blog}">
        </div>
        <div class="form-group">
            Creation Date: <input type="text" class="form-control" name="creation_date"  value="${blog.creation_date}">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

</body>
</html>
