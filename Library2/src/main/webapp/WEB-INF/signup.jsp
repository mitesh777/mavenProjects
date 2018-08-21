<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up</title>
</head>
<body>
	${message}
	<form:form action="signup.html" method="post" modelAttribute="userObj">
		<form:label path="username"> user Name</form:label>
		<form:input path="username"/>
		<br>
		
		<form:label path="password"> password</form:label>
		<form:input type="password" path="password"/>
		<br>
		
		<form:button>Sign up</form:button>
	</form:form>
	<a href="login.html">Login</a>
</body>
</html>