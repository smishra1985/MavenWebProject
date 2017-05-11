<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>

<body>
<form action="/WebProject_1/LoginController" method="get">
<label style="float: left;">User Name : </label><input type="text" name="userName"></br>
<label style="float: left;">Password : </label><input type="password" name="password"></br>
<input type="submit" value="Login">
</form>

</body>
</html>