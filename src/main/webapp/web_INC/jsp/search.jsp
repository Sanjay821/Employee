<%@ include file="common/emplheader.jspf" %>
	<div
		style="text-align: center; width: 500px; margin: auto; border-style: solid;">
		<h1>Enter AccountNumber </h1>
		<form method="POST" action="searchcustomer">

			<br> <label for="fname">Enter Account Number :</label> <input
				type=text name="accnum" required="required"><br> <br>
			<span>${notfound}</span><br><br>
				<input type="submit" value="Submit">
		</form>
	</div>