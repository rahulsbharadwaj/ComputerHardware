<%@taglib prefix="c" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home Page</title>
  <meta charset="utf-8">
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
   <c:url value="images" var="img"/>
   <c:url value="css" var="css"/>
    <c:url value="js" var="js"/> 
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="#"><h4>GAMERS RIG</h4></a>

  <!-- Links -->
  <ul class="navbar-nav">
  <c1:if test="${pageContext.request.userPrincipal.name==null }">
    <li class="nav-item-right">
      
        <a class="nav-link" style="color:white" href='<c:url value="/log-in"/>'>Log-IN</a>
           
       
    </li>
    <li class="nav-item-right">
       <a class="nav-link" style="color:white" href='<c:url value="/user"/>'>SignUp</a>
    </li>
     </c1:if>
    
    <c1:if test="${pageContext.request.userPrincipal.name!=null}">
    <li><a href="<c:url value="/logout"/>"></a></li>
    </c1:if>
    
    <c1:if test="${pageContext.request.userPrincipal.name!=null}">
    Welcome!!!${pageContext.request.userPrincipal.name}
    </c1:if>
    <!-- Dropdown -->
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown"style="color:white">
        Admin
      </a>
      <div class="dropdown-menu">
      <c1:if test="${pageContext.request.userPrincipal.name!=null }">
      <security:authorize access="$hasRole('ROLE_ADMIN')">
        <a class="dropdown-item" href='<c:url value="/category"/>'>Category</a>
         <a class="dropdown-item" href='<c:url value="/product"/>'>Product</a>
        <a class="dropdown-item" href='<c:url value="/supplier"/>'>Supplier</a>
        </security:authorize>
     </c1:if>
        
       
      
             
     
      </div>
    </li>
  </ul>
</nav>
<br>
  
<div class="container">
  <h3>Home Page</h3>
  <p>Home Page </p>
</div>

</body>
</html>
