<%@ include file="common/custheader.jspf" %>
	<div
		style="text-align: center; width: 500px; margin: auto; border-style: solid;">
		<h1>Transfer</h1>
		<form method="POST" action="aftertransfer">
 <label for="fname"> Account number :</label> <input
				type=text name="accnum" required="required"><br> <br>
			<br> <label for="fname"> Amount :</label> <input
				type=text name="amt" required="required"><br> <br>
			<span>${successfull}</span><br><br>
			<input type="submit" value="Submit">
		</form>
	</div>