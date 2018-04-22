<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/admin/videos/update" method="POST">
		<input type="text" name="id" value="${video.id}" hidden /><br /> Name:
		<input type="text" name="name" value="${video.name }" /><br /> Source:
		<input type="text" name="source" value="${video.source }" /><br />
		Description: <input type="text" name="des" value="${video.des }" /><br />
		Image: <input type="text" name="img" value="${video.img }" /><br /> <input
			type="submit" value="Update Video" />
	</form>
</body>
</html>