<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Create Product</h2>
	<form action="CreateProductServlet" method="post"> 
	<p>
		<label for="txtIdProduct">ID Product: </label>
		<input type="text" id="txtIdProduct" name="txtIdProduct" disabled>
	</p>
	<p>
		<label for="txtNameProduct">Name Product: </label>
		<input type="text" id="txtNameProduct" name="txtNameProduct">
	</p>
	<p>
		<label for="txtPriceProduct">Price Product: </label>
		<input type="text" id="txtPriceProduct" name="txtPriceProduct">
	</p>
	<p>
		<label for="txtJson">Json Text: </label>
		<input type="text" id="txtJson" name="txtJson">
	</p>
	<input type="submit" value="Create Product">
	
	</form>
</body>
</html>