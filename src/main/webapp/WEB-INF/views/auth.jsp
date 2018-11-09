<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/my-login" method="post">
		<table>
			<tr>
				<td><label for="username"> Username: </label></td>
				<td><input type='text' id='my-username' name='my-username' /></td>
			</tr>
			<tr>
				<td><label for="password"> Password: </label></td>
				<td><input type='password' id='my-password' name='my-password' /></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit">Submit</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>