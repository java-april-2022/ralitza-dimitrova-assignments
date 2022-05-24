<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dojo Location Info</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   <h1><c:out value="${dojo.name}"/> Location Details</h1>
   		<table class="table table-dark">
   			<tr>
   				<th>First Name</th>
   				<th>Last Name</th>
   				<th>Age</th>
				
				<tr>
					<c:forEach items="${dojo.students}" var="ninja">
					<td>
						<c:out value="${ninja.firstName}"/>
					</td>
					<td>
						<c:out value="${ninja.lastName}"/>
					</td>
					<td>
						<c:out value="${ninja.age}"/>
					</td>
					</c:forEach>
								
   			</tr>
   		</table>
</body>
</html>