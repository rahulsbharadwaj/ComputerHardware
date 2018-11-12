
<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>



<html>
<head>
<title>Order Confirmation</title>
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

/* .center { */
/*     margin: auto; */
/*     width: 50%; */
/*     padding: 15px; */
/* } */

</style>



<body>
<!-- <div class="center"> -->
<h1>Order Confirmation</h1>
</div>
<!-- <div class="center"> -->
<table>
  <tr>
  <td><h2>Product ID</h2></td>
    <td><h2>Product Name</h2></td>
    <td><h2>Price</h2></td>
    <td><h2>Product Description</h2></td>       
  </tr>
  <c1:if test="${prot!=null}">
  <tr>
    <td>${prot.getProdId()}</td>
    <td>${prot.getProdName()}</td>
    <td>${prot.getProdPrice()}</td>
    <td>${prot.getProdDiscription()}</td>
	</tr>
  </c1:if>
  
  <c1:if test="${prot==null}">
     <c1:forEach items="${cartItems}" var="c1">
      <tr>
        <td><img src=""></td>
        <td>${c1.getProduct().getProdName()}</td>
<%--         <td>${c1.getproduct.getDes()}</td> --%>
        <td>${c1.getProduct().getCategory().getCategoryname()}</td>
        <td>${c1.getProduct().getSeller().getName()}</td>
        <td>${c1.getProduct().getPrice()}</td>
      </tr>
      </c1:forEach>
      </c1:if>
   
  
</table>
<br><br>
</div>
<br><br>
<!-- <div class="center"> -->
<table>
 <tr>
  <td><h2>Billing ID</h2></td>
    <td><h2>Billing Name</h2></td>
    <td><h2>Billing Address</h2></td>
    <td><h2>Phone no</h2></td>       
  </tr>
	<tr>
    <td>${billing.getBillingId()}</td>
    <td>${billing.getBillingName()}</td>
    <td>${billing.getBillingAddress()}</td>
    <td>${billing.getBillingPhno()}</td>        
</tr>
	</table>
	<br><br>
	</div>
	<br><br>
<!-- 	<div class="center"> -->
	<table>
  <tr>
  <td><h2>Shipping ID</h2></td>
    <td><h2> Address</h2></td>
     <td><h2>City</h2></td>
      <td><h2>State</h2></td>
    </tr>
	<tr>
	<td>${shippingAddress.getShipId()}</td>
	<td>${shippingAddress.getAddress()}</td>
	<td>${shippingAddress.getCity()}</td>
	<td>${shippingAddress.getState()}</td>
	</tr>
	</table>
	 <br><br>
</div>
<br><br><br><br>
<!-- <div class="center"> -->
<button class="button button1"><a href="<c:url value="/pay"/>">Pay</a></button>
 
</div>


</body>
<%@ include file="footer.jsp" %>
</html>