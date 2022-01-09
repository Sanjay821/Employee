<%@ include file="common/emplheader.jspf" %>

	<div
		style="text-align: center; width: 500px; margin: auto; border-style: solid;">
		<h1>Enter AccountNumber And Name To Be Deleted</h1>
		<form method="POST" action="deletecustomer">

			<br> <label for="fname">Enter Account Number :</label> <input
				type=text name="accnum" required="required"><br> <br>
			<label for="femail">Enter Name :</label> <input type="text"
				name="name" required="required"> <br> <br> 
				<span>${sucessfull}</span><br><br>
				<input type="submit" value="Submit">
		</form>
		
	</div>