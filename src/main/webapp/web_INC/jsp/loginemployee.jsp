<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMPLOYEE</title>
</head>
<body>

<h1 > WELCOME TO EMPLOYEE LOGIN PAGE</h1>
	<div
		style="text-align: center; width: 500px; margin: auto; border-style: solid;">
		<h3>Enter your user_name and password</h3>
		<form method="POST" action="validateemployee">

			<br> <label for="fname">Enter UserNAme :</label> <input
				type=text name="username" required="required"><br> <br>
			<label for="femail">Enter Password :</label> <input type="password"
				name="password" required="required"> <br> <br> <input
				type="submit" value="Submit">
		</form>
	</div>
</body>
</html>