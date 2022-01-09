<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CUSTOMER</title>
</head>
<body>
<h1 > WELCOME TO CUSTOMER LOGIN PAGE</h1>

	<div
		style="text-align: center; width: 500px; margin: auto; border-style: solid;">
		<h1>Enter your user_name and password</h1>
		<form method="POST" action="validatecustomer">

			<br> <label for="fname">Enter UserNAme :</label> <input
				type=text name="username" required="required"><br> <br>
			<label for="femail">Enter Password :</label> <input type="password"
				name="password" required="required"> <br> <br> <input
				type="submit" value="Submit">
		</form>
	</div>
</body>
</html>