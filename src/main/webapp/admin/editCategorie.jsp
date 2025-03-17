<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajouter categorie</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<%@include file="./shared/navbar.jsp" %>
<div class="container my-5">

	<div class="card">
	  <div class="card-header">
	    Edit Categorie
	  </div>
	  <div class="card-body">
	    <form action="/E-commerce/admin/categorie/${ categorie.id }/edit" method="post">
	      <div class="mb-3">
		    <label for="categrie_id" class="form-label">Categorie</label>
		    <input type="number" class="form-control" id="categrie_id" value="${ categorie.id }" disabled="disabled">
		  </div>
		  <div class="mb-3">
		    <label for="categorie" class="form-label">Categorie</label>
		    <input type="text" class="form-control" id="categorie" name="categorie" value="${ categorie.name }">
		  </div>
		  <button type="submit" class="btn btn-primary">Edit</button>
		</form>
	  </div>
	</div>
</div>
</body>
</html>