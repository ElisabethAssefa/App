<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Records in the database</title>
</head>
<body>
	<h1>Cars currently in the database</h1>
	<table>
	<c:forEach var="record" items="${records}">
	<tr>
		<td>${record.id}</td>
		<td>${record.value}</td>
		<td>${record.account}</td>
		<td>${record.memo}</td>
		<td><a href="cars/${car.id}">edit</a></td>
	</tr>
	</c:forEach>
	</table>
	
	
</body>
</html>