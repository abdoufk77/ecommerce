<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css" integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<title>categorie</title>
</head>
<body>
<%@include file="./shared/navbar.jsp" %>
<div class="container">
	<div class="my-5">
		<div class="d-flex justify-content-end"> 
			<a href="#" class="btn btn-primary h-25 mx-2" style="width: 15%">
				<span class="ml-2">Ajouter categorie</span>
				<i class="fa-solid fa-plus"></i>	
			</a>
			<div class="input-group mb-3 h-25" style="width: 30%">
			  <input type="text" class="form-control" placeholder="Chercher categorie" aria-label="Recipient's username" aria-describedby="basic-addon2">
			  <span class="input-group-text" id="basic-addon2">
			  	<i class="fa-solid fa-magnifying-glass"></i>
			  </span>
			</div>
		</div>
	
		<table class="table table-striped table-bordered ">
		  <thead>
		    <tr class="table-dark">
		      <th scope="col">#</th>
		      <th scope="col">Categorie</th>
		      <th scope="col">Action</th>    
		    </tr>
		  </thead>
		  <tbody>
		  <c:forEach var="categorie" items="${ categories }">
		  	<tr>
		      <th scope="row">${ categorie.id }</th>
		      <td>${ categorie.name }</td>
		      <td>
		      	<a href="#" class="link-primary link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">Edit</a>
		      	<span> | </span>
		      	<a href="#" class="link-danger link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">Delete</a>
		      </td>
		   </tr>
		  </c:forEach>   
		  </tbody>
		</table>
	</div>
</div>
</body>
</html>