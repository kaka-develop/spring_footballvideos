<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="/admin/videos/new" method="POST">
		ID: <input type="text" name="id"/><br/>
		Name: <input type="text" name="name"/><br/>
		Source: <input type="text" name="source"/><br/>
		Description: <input type="text" name="des"/><br/>
		Image: <input type="text" name="img"/><br/>
		<input type="submit" value="New Video"/>
	</form>
</body>
</html>