<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>





<html>
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
<input type="submit" value="Add Category">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" value="Cancel">
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

</html>
