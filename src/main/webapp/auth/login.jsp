<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<h1>Login</h1>
	<form method="post" action="login">
		<div>	
			<label for="username">Username:</label>
			<input id="username" type="text" name="username">
		</div>
		<div>	
			<label for="password">Password:</label>
			<input id="password" type="password" name="password">
		</div>
		<div>	
			<input type="submit" value="login">
		</div>
	</form>
</body>
</html>