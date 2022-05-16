<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="${encoding}">
<title>Fruit Store!</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<h1>Fruit Store</h1>
	
	<div class="container">
		<table class="table">
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
			<c:forEach var="fruits" items="${fruits}">
				<tr>
					<td>${fruits.name}</td>
					<td>${fruits.price}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>