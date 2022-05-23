<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji Results</title>
<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
	<h1>Here's Your Omikuji!</h1>
	
	<h4>
		<c:out value = "${showStory}" />
	</h4>
	
	<a href="/omikuji">Go back</a>
</body>
</html>