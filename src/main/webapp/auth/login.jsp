<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>login</title>
</head>
<body>
<header>
	<nav class="navbar bg-body-tertiary">
	  <div class="container-fluid">
	    <span class="navbar-brand mb-0 h1">Ecom</span>
	  </div>
	</nav>
</header>
<div class="container">

	<div class="card my-5" >
	  <div class="card-body">
	    <h2 class="card-title">Login</h2>
	    <form method="post" action="login">
		  <div class="mb-3">
		    <label for="email" class="form-label">Username</label>
		    <input type="email" class="form-control" id="email" name="email">
		  </div>
		  <div class="mb-3">
		    <label for="password" class="form-label">Password</label>
		    <input type="password" class="form-control" id="password" name="password">
		  </div>
  		  <button type="submit" class="btn btn-primary">Login</button>
		</form>
	  </div>
	</div>
</div>
	
</body>
</html>