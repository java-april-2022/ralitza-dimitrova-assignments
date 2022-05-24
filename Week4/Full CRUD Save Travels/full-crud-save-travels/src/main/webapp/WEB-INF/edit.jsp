<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Expense</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<body style="margin: 10vw;">
<h1>Edit Expense</h1>

<a href="/expenses/">Go back</a>

<h2>Expense</h2>
	<form:form action="/edit/${expense.id}" method="post" modelAttribute="expense">
		<input type="hidden" name="_method" value="put">
	
		<p>
			<form:label path="name">Expense Name: </form:label>
			<form:errors path="name" class="error"/>
			<form:input path="name"/>
		</p>
	
		<p>
			<form:label path="vendor">Vendor: </form:label>
			<form:errors path="vendor" class="error"/>
			<form:input path="vendor"/>
		</p>
		
		<p>
			<form:label path="amount">Amount: </form:label>
			<form:errors path="amount" class="error"/>
			<form:input type="double" path="amount"/>
		</p>
		
		<p>
			<form:label path="description">Description: </form:label>
			<form:errors path="description" class="error"/>
			<form:textarea rows="3" path="description"/>
		</p>
		
			<input type="submit" value="Submit" class="ebutton"/>

	
	</form:form>
</body>
</html>