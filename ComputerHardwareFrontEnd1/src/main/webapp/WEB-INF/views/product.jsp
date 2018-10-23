<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>




<html>
<fieldset>
<legend><I><h1> Product Form </h1></I></legend>
<c:url value="/addproduct" var="pro"/>

<form:form action="${pro}" method="post" commandName="product" enctype="multipart/form-data">
  Product ID :
  &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<form:input type="text" name="101" Placeholder=" enter the product id " path="prodId"/>
  
  <br><br>
  
  Product Name :
  &nbsp;&nbsp;&nbsp;<form:input type="text" name="username" Placeholder="enter the product name" path="prodName"/>

<br><br>
  
  Price :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <form:input type="number" name="number" Placeholder="enter the price" path="prodPrice"/>


<br><br>
  
  Quantity :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <form:input type="number" name="number" Placeholder="enter the quantity" path="prodQty"/>


<br><br>
  
  Description :
  &nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Text" name="Text" Placeholder="enter the product discription " path="ProdDiscription"/>

  <br><br><br>



<label>Categories </label>
<form:select path="category.categoryid">
<c1:forEach items="${categories}" var="cat">
<option value="${cat.getCategoryid()}">${cat.getCategoryname()}</option>
</c1:forEach>

</form:select>


     <br><br><br>
<label>Suppliers </label>
<form:select path="supplier.supId">
<c1:forEach items="${suppliers}" var="sup">
<option value="${sup.getSupId()}">${sup.getSupName()}</option>
</c1:forEach>
<form:input type="file" value="uploadfile" path="pimg"/>
</form:select>






  <input type="submit" value="ADD PRODUCT">
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="CANCEL">
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
</html>
