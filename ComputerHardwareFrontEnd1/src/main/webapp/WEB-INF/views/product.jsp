<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>



<html>
<head>
<style>
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

</style>
</head>
<fieldset>
<legend><h1> Product Form </h1></legend>
<c:url value="/addproduct" var="pro"/>

<form:form action="${pro}" method="post" commandName="product" enctype="multipart/form-data">
  Product ID:
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" name="101" Placeholder=" Enter the product id " path="prodId"/>
  
  <br><br>
  
  Product Name :
  &nbsp;&nbsp;&nbsp;<form:input type="text" name="username" Placeholder="Enter the product name" path="prodName"/>

<br><br>
  
  Price :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="number" name="number" Placeholder="Enter the price" path="prodPrice"/>


<br><br>
  
  Quantity :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <form:input type="number" name="number" Placeholder="Enter the quantity" path="prodQty"/>


<br><br>
  
  Description :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Text" name="Text" Placeholder="Enter the product discription " path="ProdDiscription"/>

  <br><br><br>

&nbsp;&nbsp;&nbsp;&nbsp;
<label>Categories </label> &nbsp;&nbsp;&nbsp;
<form:select path="category.categoryid">
<c1:forEach items="${categories}" var="cat">
<option value="${cat.getCategoryid()}">${cat.getCategoryname()}</option>
</c1:forEach>
</form:select>
     <br><br><br>
      &nbsp;&nbsp;&nbsp;&nbsp;
<label>Suppliers </label> &nbsp;&nbsp;&nbsp;
<form:select path="supplier.supId">
<c1:forEach items="${suppliers}" var="sup">
<option value="${sup.getSupId()}">${sup.getSupName()}</option>
</c1:forEach>
<br><br><br>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <br><br><br>
&nbsp;&nbsp;&nbsp;<form:input type="file" value="uploadfile" path="pimg"/>
</form:select>
<br><br><br>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="submit" value="ADD PRODUCT">
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="reset" value="CANCEL">
</form:form> 

</fieldset>

<table>
<tr>
<th>Product Id</th>
<th>Product Description</th>
<th>Product Name</th>
<th>Product Price</th>
<th>Product Qty </th>
<th>Actions</th>
</tr>
<c1:forEach items="${productes}" var="pro">
<tr>
<td>${pro.getProdId()}</td>
<td>${pro.getProdDiscription()}</td>
<td>${pro.getProdName()}</td>
<td>${pro.getProdPrice()}</td>
<td>${pro.getProdPrice()}</td>

<td><a href="<c:url value="/editproduct/${pro.getProdId()}"/>">Edit</a>/
<a href="<c:url value="/deleteproduct/${pro.getProdId()}"/>">Delete</a></td>
</tr>
</c1:forEach>
</table>
<%@ include file="footer.jsp" %>
</html>
