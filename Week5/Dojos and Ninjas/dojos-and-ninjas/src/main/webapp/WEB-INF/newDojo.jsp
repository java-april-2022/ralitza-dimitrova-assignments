<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>New Dojo</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   
   <h1>Create New Dojo</h1>
  
   <form:form method="POST" action="/dojo/createDojo" modelAttribute="dojo">
   	<p>
   		<form:label path="name">Name</form:label>
   		<form:errors path="name"/>
   		<form:input path="name"/>
   	</p>
   	
   	<button class="button">Create New Dojo</button>
   	
   </form:form>
   
</body>
</html>