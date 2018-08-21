<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${message}
<table>
	<tr>
	<!-- <th> Book ID</th> <th> ISBN </th> -->
	<th> id </th>
	<th> brandName </th>
	<th> category </th>
	<th> description </th>
	<th> prive </th>
	<!-- <th> Publication </th> <th> Category </th> 
	<th> Price </th> <th> Stock Count </th> <th> authorId </th>  -->
	</tr>
	<c:forEach var="products" items="${allProducts}">
	<tr>
		<td>${products.id}</td>
		<td>${products.brandName}</td>
		<td>${products.category}</td>
		<td>${products.description}</td>
		<td>${products.prive}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>