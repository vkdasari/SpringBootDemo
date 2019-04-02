<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome ..  ${name}</h1>
	<br>
	<h2> Enter Student Details to ADD</h2>
	<br>
	<form action="studentAdition">
		Roll: <input type = "text" name = "roll">
		Name: <input type = "text" name = "name">
		Age:  <input type = "text" name = "age">
		<input type = "submit">
	</form>
	
	
</body>
</html>