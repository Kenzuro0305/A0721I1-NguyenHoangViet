<%--
  Created by IntelliJ IDEA.
  User: vietp
  Date: 18/04/2022
  Time: 09:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Bạn có chắc chắn muốn xóa mặt bằng với</h3>
<form method="post">
    <p style="color: red">${msgDelete}</p>
    <p>Mã MB: ${tComplex.ma_mb}</p>
    <button type="submit">Yes</button>
    <button type="button"><a href="/complex">No</a></button>
</form>
</body>
</html>
