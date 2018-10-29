<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>

<html>
<head>
<title>GamersRig-Sign UP
</title>
</head>
<fieldset>
<legend><h2> SIGN UP FORM </h2></legend>
<c:url value="/adduser" var="cat"/>
<form:form action="${cat}" method="post" commandName="user">   


  
    USER ID :  
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" id="name" name="user_name" placeholder="Enter the user id" path="userId"/>
<br>
<br>

    Name : </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="TEXT" id="name" name="SUPPLIER NAME" placeholder="Enter the name" path="userName"/>
  
<br>
<br>  

    Email-ID: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Email" id="mail" name="Email-ID" placeholder="Enter the email id" path="userEmailId"/>

<br>
<br>  

    Phone No: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Number" id="number" name="Number"  placeholder="Enter the phone number" path="userPhNo"/>

<br>
<br>  

    Address: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text"  name="user_message" placeholder="Enter the address" path="userAddress"/>
  
<br>
<br>

    Password : </label>
    &nbsp;&nbsp;&nbsp;&nbsp;<form:input type="password" id="name" name="SUPPLIER NAME" placeholder="Enter the password" path="userPwd"/>

<br>
<br>
<br>

 <input type="submit" value="REGISTER">
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="CANCEL">
</form:form>
</fieldset>
<%@ include file="footer.jsp" %>
</html>
