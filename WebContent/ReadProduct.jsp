<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Read Product</h2>
	<form action="ReadProductServlet" method="post">
	<p>
		<label for="txtIdProduct"></label>
		<input type="text" id="txtIdProduct" name="txtIdProduct">
	</p>
		<input type="submit" value="Read Product">
	</form>
</body>
</html>