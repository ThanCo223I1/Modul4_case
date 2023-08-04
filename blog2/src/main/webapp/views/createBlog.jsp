
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
  <h1>Create Blog</h1>
  <form method="post">
<%--    <div class="form-group">--%>
<%--      ID_Blog: <input type="text" class="form-control" name="id_blog"  placeholder="id blog">--%>
<%--    </div>--%>
    <div class="form-group">
      Title_Blog: <input type="text" class="form-control" name="title_blog"  placeholder="title blog">
    </div>
    <div class="form-group">
      Content_Blog: <input type="text" class="form-control" name="content_blog" placeholder="content blog">
    </div>
    <div class="form-group">
      Creation_Date: <input type="text" class="form-control" name="creation_date"  placeholder="creation date">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>
</html>
