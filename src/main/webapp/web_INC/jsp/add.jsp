<%@ include file="common/emplheader.jspf" %>
	<div
		style="text-align: center; width: 500px; margin: auto; border-style: solid;">
		<h1>Enter the Deatil's Of New Customer</h1>
		<form method="POST" action="addcustomer">

			<br> <label for="fname">Enter New Account Number :</label> <input
				type=text name="accnum" required="required"><br> <br>
			<label for="femail">Enter Name :</label> <input type="text"
				name="name" required="required"> <br> <br> 
				<label for="femail">Enter password :</label> <input type="text"
				name="password" required="required"> <br> <br>
				<label for="femail">Enter New Balance :</label> <input type="text"
				name="balance" required="required"> <br> <br>
				<span>${sucessfull}</span><br><br>
				
				<input type="submit" value="Submit">
						</form>
	</div>