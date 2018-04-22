<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	<h1>Videos ${message }</h1>
	
	<a href="/admin/videos/new"><button>New Video</button></a>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Des</th>
			<th>Source</th>
			<th>Image</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${videos}" var="v">
			<tr>
				<td>${v.id}</td>
				<td>${v.name}</td>
				<td>${v.des}</td>
				<td>${v.source}</td>
				<td>${v.img}</td>
				<td><a href="/admin/videos/update/${v.id}">update</a></td>
				<td><a href="/admin/videos/del/${v.id}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
<a href="/admin/videos/save"><button>Save Video</button></a>
</body>
</html>