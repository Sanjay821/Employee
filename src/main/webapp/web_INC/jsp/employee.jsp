<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}
.nav{
  overflow:hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
  width: 200px;
    height: 400px;
}
 a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

 a.logo {
  font-size: 25px;
  font-weight: bold;
}

a:hover {
  background-color: #ddd;
  color: black;
}


.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
 a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}
</style>
</head>
<body>

<div class="header">
  <a href="#default" class="logo">EMPLOYEE HOME </a>
  <div class="header-right">
  <a href="deposite">DEPOSITE</a>    
  <a  href="add">ADD CUSTOMER</a>
    <a href="delete">DELETE EMPLOYEE</a>
    <a href="search">SEARCH EMPLOYEE</a>
    <a  href="home">LOGOUT</a>

  </div>
</div>


</body>
</html>
