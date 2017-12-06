<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style>
body {
    width: 100%;
}
fieldset {
position: block ;
  height: 50%;
  width: 50%;
  background: #ffffff;
  margin-top: 100px;
  margin-right: 100px;
  margin-bottom: 100px;
  margin-left: 300px;
  text-align: center;
}
fieldset input {
  text-align: center;
  margin: 10px 10px 10px 10px;
  }
   #content
  {
  position: block ;
  text-align: center;
  margin-top: 75px;
  } 
  #btn-grp
  {
  text-align: center;
  margin: 10px 10px 10px 50px;
  }
</style>
</head>
<body>
<form>
 <fieldset>
  <legend>Login:</legend>
  <div id="content">
  Username: <input type="text" name="username" id="username" /><br>
  Password: <input type="password" name="password" id="password" /><br>
  <div id="btn-grp">
  <input type="submit" />
   <input type="button" name="Sign Up" value="Sign up" />
   </div>
</div>
 </fieldset>
</form>
</body>
</html>