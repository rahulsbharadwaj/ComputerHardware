<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<fieldset>
<legend><I><h1> SIGN UP FORM </h1></I></legend>
<c:url value="/adduser" var="cat"/>
<form:form action="${cat}" method="post" commandName="user">   
    USER ID :  </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" id="name" name="user_name" placeholder="enter the user id" path="userId"/>
<br>
<br>

    Name : </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="TEXT" id="name" name="SUPPLIER NAME" placeholder="enter the name" path="userName"/>
  
<br>
<br>  

    Email-ID: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Email" id="mail" name="Email-ID" placeholder="enter the email id" path="userEmailId"/>

<br>
<br>  

    Phone No: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Number" id="number" name="Number"  placeholder="enter the phone number" path="userPhNo"/>

<br>
<br>  

    Address: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:textarea id="msg" name="user_message" placeholder="enter the address" path="userAddress"></form:textarea>
  
<br>
<br>

    Password : </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="TEXT" id="name" name="Password" placeholder="enter the password" path="userPwd"/>

<br>
<br>
<br>

 <input type="submit" value="REGISTER">
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="CANCEL">


</form:form>
</fieldset>
</html>
