
<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>



<html>
<fieldset>
<legend><B><h1> Login Form </h1></B></legend>

<c:url value="/j_spring_security_check" var="login"/>
    <form:form action="${login}" method="post">

  User Email:
  &nbsp;<input type="email" name="j_username" Placeholder=" enter email ">
  
  <br><br>
  
  Password :
  &nbsp;&nbsp;&nbsp;<input type="password" name="j_password" Placeholder="enter password">
  <br><br><br>
							<input type="submit" value="LOGIN">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="reset" value="CANCEL">
							
						</div>
</form:form> 

</fieldset>
<%@ include file="footer.jsp" %>
</html>
