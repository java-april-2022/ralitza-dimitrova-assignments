<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
	<h1>Send an Omikuji!</h1>
	
	<form action="/submitForm" method="post">
		
		<div>
			<label>Pick a number from 5 to 25:</label>
			<input type = "number" name="number"/>
		</div>
		<div>
			<label>Enter the name of any city:</label>
			<input type = "text" name="city"/>
		</div>
		<div>
			<label>Enter the name of any person:</label>
			<input type = "text" name="person"/>
		</div>
		<div>
			<label>Enter professional endeavor or hobby:</label>
			<input type = "text" name="job"/>
		</div>
		<div>
			<label>Enter any type of living thing:</label>
			<input type = "text" name="animal"/>
		</div>
		<div>
			<label>Say something nice to someone:</label>
			<textarea name="compliment" cols="30" rows="10">Make someone's day!</textarea>
		</div>
		
		<p>Send and show a friend!</p>
		
		<input id="send" type="submit" value="Send" />

	</form>
</body>
</html>