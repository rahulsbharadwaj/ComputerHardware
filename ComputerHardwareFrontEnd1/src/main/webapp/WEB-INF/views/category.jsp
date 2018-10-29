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
<legend><B><h1> Category Form </h1></B></legend>

<c:url value="/addcategory" var="cat"/>
<form:form action="${cat}" method="post" commandName="category">

						Customer ID:
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <form:input type="text" name="firstname" Placeholder=" enter the id " path="categoryid"/>
                        <br><br> 
                         Customer Name :
                         <form:input type="text" name="username" Placeholder="enter the name" path="categoryname"/>
                          <br><br>
							
							<input type="submit" value="ADD CATEGORY">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="reset" value="CANCEL">
							
						
						<!-- /Billing Details -->
</form:form> 
</fieldset>

<table>
<tr>
<th>category id</th>
<th>category name</th>
<th>Actions</th>
</tr>
<c1:forEach items="${categories}" var="cat">
<tr>
<td>${cat.getCategoryid()}</td>
<td>${cat.getCategoryname()}</td>
<td><a href="<c:url value="/editcategory/${cat.getCategoryid()}"/>">Edit</a>/
<a href="<c:url value="/deletecategory/${cat.getCategoryid()}"/>">Delete</a></td>
</tr>
</c1:forEach>
</table>
<%@ include file="footer.jsp" %>
</html>
