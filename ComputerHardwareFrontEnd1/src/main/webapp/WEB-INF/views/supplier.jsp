<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<fieldset>
<legend><B><h1> Supplier Form </h1></B></legend>
<c:url value="/addsupplier" var="sup"/>
<form:form action="${sup}" method="post" commandName="supplier">
  
   <label> Supplier ID:  </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" id="name" name="user_name" placeholder="enter the id" path="SupId"/>
<br>
<br>

   <label>Supplier Name: </label>
    &nbsp;<form:input type="TEXT" id="name" name="SUPPLIER NAME" placeholder="enter the name" path="SupName"/>
  
<br>
<br>  

    <label>Email-ID: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Email" id="mail" name="Email-ID" placeholder="enter the email id" path="SupEmailId"/>

<br>
<br>  

    <label>Phone No: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Number" id="number" name="Number"  placeholder="enter the phone numner" path="SupPhNo"/>

<br>
<br>  

    <label>Address: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea id="msg" name="user_message" placeholder="enter the address" path="SupAddress"></textarea>
  
<br>
<br>

 
 
 <input type="submit" value="Add Supplier">
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Cancel">
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


</html>
