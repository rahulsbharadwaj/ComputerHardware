<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CART</title>
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    padding: 8px;
    text-align: left;
    border-bottom: 1px solid black;
}


.button {
    border: none;
    color: Black;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    margin: 4px 2px;
    cursor: pointer;
}
.button1 {font-size: 16px;
          padding: 12px 28px;}

.center {
    margin: auto;
    width: 50%;
    padding: 15px;
}

</style>
</head>
<body>
<h1>CART ITEMS</h1>

<table>

  <tr>
    <td><h2>Product Image</h2></td>
    <td><h2>Product ID</h2></td>
    <td><h2>Name</h2></td>
    <td><h2>Price</h2></td>
    <td><h2></h2></td>
    <td><h2></h2></td>       
  </tr>
 <c1:forEach items="${cartItem}" var="car">
  <tr>
    <td><img src="${img}/${car.getProduct().getProdId()}.jpg" width="100px" height="100px" alt=""></td>
    <td>${car.getProduct().getProdId()}</td>
    <td>${car.getProduct().getProdName()}</td>
    <td>${car.getProduct().getProdPrice()}</td>
    <td><button class="button button1"><a href="<c:url value="/Buy/${car.getProduct().getProdId()}/${car.getCartitem_Id()}"/>">Buy Now</a></button></td>  
    <td><button class="button button1"><a href="<c:url value="/Remove/${car.getCartitem_Id()}"/>">Remove</a></button></td>     
</tr>
</c1:forEach>


</table>
<div class="center">
<button class="button button1" ><a href="<c:url value="/Buyall"/>">Buy All</a></button>
 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
<button class="button button1"><a href="<c:url value="/RemoveAll"/>">Remove ALL</button>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>