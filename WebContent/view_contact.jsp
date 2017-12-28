<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.List" %>
     <%@ page import="java.util.HashMap" %>
    <%@ page import="com.contacts.beans.ContactPhone" %>
    <%@ page import="com.contacts.beans.Contact" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
   
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
</head>
<body>
<div id="contents">
<table class="centered">
<tr>
<th>contact name</th>
<th>Email Id</th>
<th>Phone Number</th>
</tr>
  <s:set var="conservice" value="conservice" />
  <jsp:useBean id="conservice" type="com.contacts.services.ContactService" />
   <s:set var="phones" value="phones" />
  <%
List<Contact> contacts=conservice.getAllContacts(Long.parseLong((String)session.getAttribute("userid")));
  HashMap<Long,ContactPhone> phones=conservice.getAllPhones(Long.parseLong((String)session.getAttribute("userid")));
for(Contact contact : contacts)
{
	String msg="";
	ContactPhone phone=phones.get(contact.getContactid());
%>
<tr>
<td rowspan=<%= phone.getPhoneid().size() %>><input type="hidden" name="contact_id" value=<%= contact.getContactid() %>/>  <%=contact.getName() %></td>
<td rowspan=<%= phone.getPhoneid().size() %>><%= contact.getEmailid() %></td>
<%

if(phone.getPhoneid().size()>0)
{
	List<Long> phid=phone.getPhoneid();
	List<String> ph=phone.getPhonenumber();
	
	for(int count=0;count<phone.getPhoneid().size();count++){
		if(count==0)
		{
		%>
		<td><%= ph.get(count)%></td>
		</tr>
		<%
		}
		else
		{
		%>
		<tr>
		<td><%= ph.get(count) %>
		</td>
		</tr>
		<%
		}
	}
}
%>

<%} %>

</table>

<input type="button" value="Back" />
</div>
</body>
</html>