<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login httpSession</title>
</head>
<body>

<h2>Using HttpSession</h2>

<form action="login" method="post">
<label>UserName : </label>
<input type="text" name="username"/><br><br>

<label>Password : </label>
<input type="password" name="password"/><br><br>

<input type="submit" value="Login"/>

</form>

</body>
</html>