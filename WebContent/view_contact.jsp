<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Contacts</title>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 50%;
	
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}

#contents {
    text-align:center; // needed if you expect IE 5
	
}

.centered {
    margin:100px auto; // this sets left/right margin to auto and
                     // centers the element
}
a:hover
{
 text-decoration: underline;
font-color: blue;
}
</style>
<script type="text/javascript">
function call_submit(con_anchor)
{
var form_obj=con_anchor.parentNode;
form_obj.submit();
}
</script>
</head>
<body>
<div id="contents">
<table class="centered">
<tr>
<th>contact name</th>
<th>Email Id</th>
<th>Phone Number</th>
</tr>
<tr>
<td><form>
<input type="hidden" name="contact_id" value="contact_id"/>
<a onclick="call_submit(this);return false;">Saravana</a>
</form>
</td>
<td>saravana@gmail.com</td>
<td>9442121212</td>
</tr>
</table>

<input type="button" value="Back" />
</div>
</body>
</html>