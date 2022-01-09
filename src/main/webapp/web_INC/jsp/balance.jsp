<%@ include file="common/custheader.jspf" %>
	<div
		style="text-align: center; width: 500px; margin: auto; border-style: solid;">
		<h1>ACCOUNT BALANCE</h1>
		<form method="POST" action="withdrawamount">

			<br> <label for="fname"> BALANCE :</label> <input
				type=text name="accnum"  value="${amount}"><br> <br>
			<span></span>
		</form>
	</div>