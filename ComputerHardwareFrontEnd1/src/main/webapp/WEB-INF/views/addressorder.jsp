 
<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>




<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
    font-family: Arial;
    color: black;
}

.split {
    height: 100%;
    width: 50%;
    position: fixed;
    z-index: 1;
    top: 0;
    overflow-x: hidden;
    padding-top: 20px;
}

.left {
    left: 0;
    background-color: white;
}

.right {
    right: 0;
    background-color: white;
}

.centered {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    text-align: center;
}

.centered img {
    width: 150px;
    border-radius: 50%;
}
</style>
</head>
<body>

<div class="split left">
  <div class="centered">
    <fieldset>
<legend><I><h1> Billing  </h1></I></legend>

<form method="post" >
  Billing ID :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" name="101" Placeholder=" Enter Id " path="billing.BillingId"/>
  
  <br><br>
  
  Billing Name :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" name="username" Placeholder="Billing Name" path="billing.BillingName"/>

<br><br>
  
  Billing Address :
 &nbsp;<form:input type="text" name="address" Placeholder="Address" path="billing.BillingAddress"/>


<br><br>
  
  Billing Phno :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="number" name="number" Placeholder="Phno" path="billing.BillingPhno"/>


<br><br>
  
 

  
</form> 

</fieldset>

  </div>
</div>

<div class="split right">
  <div class="centered">
<fieldset>
<legend><I><h1> Shipping Form </h1></I></legend>
<c:url value="/orderConfirm" var="order"/>
<form:form action="${order}" method="post" commandName="shippingAddress">
  Shipping ID :
  &nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" name="101" Placeholder=" enter id" path="shipId"/>
  
  <br><br>
  
  Address :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" name="username" Placeholder="enter address" path="address"/>

<br><br>
  
  City :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" name="city" Placeholder="enter city" path="city"/>


<br><br>
  
 State :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" name="state" Placeholder="enter state" path="state"/>


<br><br>
  
  Country :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Text" name="Text" Placeholder="enter country " path="country"/>

  <br><br><br>

  Pin code :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="number" name="pin code" Placeholder="enter the pincode" path="pincode"/>

  <br><br><br>
  

	Phone no :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Tel" name="phone" Placeholder="enter the phno" path="phone"/>

  <br><br><br>



  <input type="submit" value="Submit">
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="CANCEL">
</form:form> 

</fieldset>
  </div>
</div>
     
</body>
<%@ include file="footer.jsp" %>
</html>