<html>
<head>
    <meta charset="utf-8" />
</head>
<body>
<h2>Hello World!</h2>

login
<form action="/user/login.do" method="post">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="submit" value="login"/>
</form>

springmvc上传文件
<form action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file">
    <input type="submit" value="up"/>
</form>

富文本文件上传
<form action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file">
    <input type="submit" value="up"/>
</form>
</body>
</html>
