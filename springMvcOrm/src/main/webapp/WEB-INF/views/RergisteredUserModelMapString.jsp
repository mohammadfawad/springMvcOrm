<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.springframework.springMvcOrm.Entities.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RergisteredUser</title>
</head>
<body>
	<form action="registeredUserModelMapString" method="post">
		<pre> <h2>User Registration Form</h2>
		<table border="0" style="with: 25%">
			<tr>
				<td><b>UserID</b></td>
				<td><input type="text" name="userId"></td>
			</tr>
			<tr>
				<td><b>UserName</b></td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td><b>UserEmail</b></td>
				<td><input type="text" name="userEmail"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="register"></td>
			</tr>
		</table>		 
		</pre>
	</form>
<%-- 	<%= request.getAttribute("user") %><%= request.getAttribute("userCreated") %>		 --%>
</body>
</html>