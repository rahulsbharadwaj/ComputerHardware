<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>


<html>
<head>

<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>


</head>
<fieldset>
<legend><B><h1> Supplier Form </h1></B></legend>
<c:url value="/addsupplier" var="sup"/>
<form:form action="${sup}" method="post" commandName="supplier">
Supplier ID:  
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" id="name" name="user_name" placeholder="enter the id" path="supId"/>
<br>
<br>

   Supplier Name: 
    &nbsp;<form:input type="text"  name="SUPPLIER NAME" placeholder="enter the name" path="supName"/>
  
<br>
<br>  

    Email-ID: 
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Email" id="mail" name="Email-ID" placeholder="enter the email id" path="supEmailId"/>

<br>
<br>  

    Phone No: 
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Number" id="number" name="Number"  placeholder="enter the phone numner" path="supPhNo"/>

<br>
<br>  

    Address: 
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" name="user_message" placeholder="enter the address" path="supAddress"/>
  
<br>
<br>
   Password:
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="password" name="user_message" placeholder="enter the password" path="supPwd"/>
   <br>
<br>
							<input type="submit" value="ADD Supplier">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="reset" value="CANCEL">
							
						
</form:form> 
   
   
   
   

</fieldset>

<table>
<tr>
<th>Supplier id  &nbsp;&nbsp;</th>
<th>supplier address &nbsp;&nbsp;</th>
<th>supplier email &nbsp;&nbsp;</th>
<th>supplier name &nbsp;&nbsp;</th>
<th>supplier phone no &nbsp;&nbsp;</th>
<th>supplier Pass word &nbsp;&nbsp;</th>
<th>Actions</th>
</tr>
<c1:forEach items="${suppliers}" var="sup">
<tr>
<td>${sup.getSupId()}</td>
<td>${sup.getSupAddress()}</td>
<td>${sup.getSupEmailId()}</td>
<td>${sup.getSupName()}</td>
<td>${sup.getSupPhNo()}</td>
<td>${sup.getSupPwd()}</td>

<td><a href="<c:url value="/editsupplier/${sup.getSupId()}"/>">Edit</a>/
<a href="<c:url value="/deletesupplier/${sup.getSupId()}"/>">Delete</a></td>
</tr>
</c1:forEach>
</table>

<%@ include file="footer.jsp" %>
</html>
