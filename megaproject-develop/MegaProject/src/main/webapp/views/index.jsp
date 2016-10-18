<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<html>

<head>
<title>MEGAPROJECT</title>
   
  <style type="text/css">
   .block1 { 
    width: 200px; 
    background: #ccc;
    border: solid 1px black; 
    top: 50%; 
	left: 50%; 
	position: absolute; 
	margin-top: -100px; 
	margin-left: -100px;>
	
  </style>

</head>

<body>
	<style> 
body {background: url(images/background.jpg);}
	</style>
   <p><img src="images\p2r.png" alt="title" width="100%" height=320px0px></p>
   
   <div align = "center" class= "block1"> 
   	<form>
		<p>
			<strong>Login:</strong> 
			<input type="text" name="Login">
			<strong>Password:</strong> 
			<input type="password" name="Password">
		</p>
	</form>
	
	<form>
		<p>
            <input type ="submit" name="submit" value="Ok">
            <input type ="reset" name="reset" value="Clean">
        </p>
    </form>

    <form>
        <p>
            <input type="submit" name="SignUp" value="Sign Up">
        </p>
    </form>
	</div>
</body>

</html>
