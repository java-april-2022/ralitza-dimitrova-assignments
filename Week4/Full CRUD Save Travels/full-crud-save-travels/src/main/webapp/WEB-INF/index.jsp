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
    <title>Save Travel</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Save Travels</h1>
	<table class="table table-striped table-dark">
	    <thead>
	        <tr>
	            <th scope="col">Expense</th>
	            <th scope="col">Vendor</th>
	            <th scope="col">Amount</th>
	            <th scope="col">Actions</th>
	            <th></th>
	        </tr>
	    </thead>
	    <tbody>
			<c:forEach var="expense" items="${expenses}">
				<tr>
					<td><a href="/expenses/${expense.id}">${expense.name}</a></td>
					<td><c:out value="${expense.vendor}"/></td>
					<td>$<c:out value="${expense.amount}"/></td>
					<td><a href="/edit/${expense.id}">edit</a></td>
					<td>
						<form action="/expenses/${expense.id}" method="post">
    					<input type="hidden" name="_method" value="delete">
    					<input type="submit" value="delete" class="dbutton">
						</form>
					</td>
				</tr>	
			</c:forEach>
	    </tbody>
	</table>
	

	<h2>Add an expense:</h2>
	<form:form action="/expenses" method="post" modelAttribute="expense">
	
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
		
		<p>
			<input type="submit" value="Submit" class="button"/>
		</p>
		
	</form:form>

	</body>
</html>