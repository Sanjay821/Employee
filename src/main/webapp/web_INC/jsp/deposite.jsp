<%@ include file="common/emplheader.jspf"%>
<div
	style="text-align: center; width: 500px; margin: auto; border-style: solid;">
	<h1>Enter Amount to be Deposited</h1>
	<form method="POST" action="afterdeposite">

		 <label > Amount Number:</label> <input type=text
			name="accno" required="required"><br> <br> 
		<label > Amount :</label> <input type=text name="amt"
			required="required"><br> <span>${balance}</span><br>
		<br> <input type="submit" value="Submit">
	</form>
</div>