<%@taglib prefix="c" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
	<head>
		<c:url value="/resources/images" var="img"/>
		<c:url value="/resources/images/img/project images" var="img1"/>
        
        <c:url value="/resources/css" var="css"/>
        <c:url value="/resources/js" var="js"/>

		<title>GamersRig-Home</title>

		<!-- Google font -->
		<link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">

		<!-- Bootstrap -->
		<link type="text/css" rel="stylesheet" href="${css}/bootstrap.min.css"/>

		<!-- Slick -->
		<link type="text/css" rel="stylesheet" href="${css}/slick.css"/>
		<link type="text/css" rel="stylesheet" href="${css}/slick-theme.css"/>

		<!-- nouislider -->
		<link type="text/css" rel="stylesheet" href="${css}/nouislider.min.css"/>

		<!-- Font Awesome Icon -->
		<link rel="stylesheet" href="${css}/font-awesome.min.css">

		<!-- Custom stlylesheet -->
		<link type="text/css" rel="stylesheet" href="${css}/style.css"/>

		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

    </head>
	<body>
		<!-- HEADER -->
		<header>
			<!-- TOP HEADER -->
			<div id="top-header">
				<div class="container">
					<ul class="header-links pull-left">
						<li><a href="#"><i class="fa fa-phone"></i> +91-9686060076</a></li>
						<li><a href="#"><i class="fa fa-envelope-o"></i> gamersrig@google.com</a></li>
						<li><a href="#"><i class="fa fa-map-marker"></i> #544,26th cross,Rajaji Nagar</a></li>
					</ul>
					<ul class="header-links pull-right">
						<c1:if test="${pageContext.request.userPrincipal.name==null }">
						<li><a href='<c:url value="/log-in"/>'><i class="fa fa-user-o"></i> LOG-IN</a></li>
						</c1:if>
						<c1:if test="${pageContext.request.userPrincipal.name!=null}">
						<li><a href="<c:url value="/j_spring_security_logout"/>"><i class="fa fa-user-o"></i> LOG-OUT</a></li>
						</c1:if>
						<c1:if test="${pageContext.request.userPrincipal.name==null }">
						<li><a href='<c:url value="/user"/>'><i class="fa fa-user-o"></i> SIGN-UP</a></li>
						</c1:if>
						
					</ul>
				</div>
			</div>
			<!-- /TOP HEADER -->

			<!-- MAIN HEADER -->
			<div id="header">
				<!-- container -->
				<div class="container">
					<!-- row -->
					<div class="row">
						<!-- LOGO -->
						<div class="col-md-3">
							<div class="header-logo">
								<a href="#" class="logo">
									<img src="${img1}/1.png" width="50" height="50"alt="LOGO">
								</a>
							</div>
						</div>
						<!-- /LOGO -->

						<!-- SEARCH BAR -->
						<div class="col-md-6">
							<div class="header-search">
								<form>
									
									<input class="input" placeholder="Search here">
									<button class="search-btn">Search</button>
								</form>
							</div>
						</div>
						<!-- /SEARCH BAR -->

						<!-- ACCOUNT -->
						<div class="col-md-3 clearfix">
							<div class="header-ctn">
<!-- 								Wishlist -->
<!-- 								<div> -->
<!-- 									<a href="#"> -->
<!-- 										<i class="fa fa-heart-o"></i> -->
<!-- 										<span>Your Wishlist</span> -->
<!-- 										<div class="qty">2</div> -->
<!-- 									</a> -->
<!-- 								</div> -->
<!-- 								/Wishlist -->

								<!-- Cart -->
								<div class="dropdown">
									<a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
										<i class="fa fa-shopping-cart"></i>
										<span>Your Cart</span>
										<div class="qty">${items}</div>
									</a>
									<div class="cart-dropdown">
									<c1:forEach items="${cartItem}" var="cart">
										<div class="cart-list">
											<div class="product-widget">
												<div class="product-img">
													<img src="./img/product01.png" alt="">
												</div>
												<div class="product-body">
													<h3 class="product-name"><a href="#">${cart.getProduct().getProdId()}</a></h3>
													<h4 class="product-price"><span class="qty">1x</span>RS${cart.getProdPrice()}</h4>
												</div>
												<button class="delete"><i class="fa fa-close"></i></button>
											</div>

<!-- 											<div class="product-widget"> -->
<!-- 												<div class="product-img"> -->
<!-- 													<img src="./img/product02.png" alt=""> -->
<!-- 												</div> -->
<!-- 												<div class="product-body"> -->
<!-- 													<h3 class="product-name"><a href="#">product name goes here</a></h3> -->
<!-- 													<h4 class="product-price"><span class="qty">3x</span>$980.00</h4> -->
<!-- 												</div> -->
<!-- 												<button class="delete"><i class="fa fa-close"></i></button> -->
<!-- 											</div> -->
										</div>
										</c1:forEach>
										<div class="cart-summary">
											<small>${items} Item(s) selected</small>
<!-- 											<h5>SUBTOTAL: $2940.00</h5> -->
										</div>
										<div class="cart-btns">
											<a href="<c:url value="/checkout"/>">View Cart</a>
											<a href="<c:url value="/checkout"/>">Checkout  <i class="fa fa-arrow-circle-right"></i></a>
										</div>
									</div>
								</div>
								<!-- /Cart -->

								<!-- Menu Toogle -->
								<div class="menu-toggle">
									<a href="#">
										<i class="fa fa-bars"></i>
										<span>Menu</span>
									</a>
								</div>
								<!-- /Menu Toogle -->
							</div>
						</div>
						<!-- /ACCOUNT -->
					</div>
					<!-- row -->
				</div>
				<!-- container -->
			</div>
			<!-- /MAIN HEADER -->
		</header>
		<!-- /HEADER -->

		<!-- NAVIGATION -->
		<nav id="navigation">
			<!-- container -->
			<div class="container">
				<!-- responsive-nav -->
				<div id="responsive-nav">
					<!-- NAV -->
					<ul class="main-nav nav navbar-nav">
						<li class="active"><a href="<c:url value="/"/>">Home</a></li>
					
						<c1:if test="${pageContext.request.userPrincipal.name!=null }">
     						 <security:authorize access="hasRole('ROLE_ADMIN')">
       
						<li><a href='<c:url value="/category"/>'>Categories</a></li>
						<li><a href='<c:url value="/supplier"/>'>Supplier</a></li>
						<li><a href='<c:url value="/product"/>'>Product</a></li>
						</security:authorize>
						</c1:if>
						
					</ul>
					<!-- /NAV -->
				</div>
				<!-- /responsive-nav -->
			</div>
			<!-- /container -->
		</nav>
		<!-- /NAVIGATION -->

		<!-- SECTION -->
		<div class="section">
			<!-- container -->
			<div class="container">
				                          <!-- row -->
				                          <div class="row">
					                      <!-- shop -->
					                      <div class="col-md-4 col-xs-6">
						                  <div class="shop">
							               <div class="shop-img">
								          <img src="${img1}/cpu/intel/i5/1.jpg" width="300px" height="300px" alt="">
							              </div>
							              <div class="shop-body">
							              	   <h3>CPU</h3>
								                <a href='<c:url value="/product2"/>' class="cta-btn" >Shop now <i class="fa fa-arrow-circle-right"></i></a>
							</div>
						</div>
					</div>
					<!-- /shop -->

					<!-- shop -->
					<div class="col-md-4 col-xs-6">
						<div class="shop">
							<div class="shop-img">
								<img src="${img1}/cabin/cooler h500m/1.jpg" alt="">
							</div>
							<div class="shop-body">
								<h3>PC-CABIN</h3>
								<a href='<c:url value="/product3"/>' class="cta-btn">Shop now <i class="fa fa-arrow-circle-right"></i></a>
							</div>
						</div>
					</div>
					<!-- /shop -->

					<!-- shop -->
					<div class="col-md-4 col-xs-6">
						<div class="shop">
							<div class="shop-img">
								<img src="${img1}\graphic card\MSI GeForce GTX 1080 Ti\14-137-114-V01.jpg" alt="">
							</div>
							<div class="shop-body">
								<h3>GRAPHIC-CARD</h3>
								<a href='<c:url value="/product5"/>' class="cta-btn">Shop now <i class="fa fa-arrow-circle-right"></i></a>
							</div>
						</div>
					</div>
					<!-- /shop -->
				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /SECTION -->

		<!-- SECTION -->
		<div class="section">
			<!-- container -->
			<div class="container">
				<!-- row -->
				<div class="row">

					<!-- section title -->
					<div class="col-md-12">
						<div class="section-title">
							<h3 class="title">New Products</h3>
							<div class="section-nav">
								<ul class="section-tab-nav tab-nav">
								<c1:forEach items="${categories}" var="cat">
									<li class="active"><a data-toggle="tab" href="#tab1">${cat.getCategoryname()}</a></li>
<!-- 									<li><a data-toggle="tab" href="#tab1">PC-CABIN</a></li> -->
<!-- 									<li><a data-toggle="tab" href="#tab1">Hard-Disk</a></li> -->
<!-- 									<li><a data-toggle="tab" href="#tab1">GRAPHIC-CARD</a></li> -->
<!-- 									<li><a data-toggle="tab" href="#tab1">Mother-Board</a></li> -->
</c1:forEach>
								</ul>
							</div>
						</div>
					</div>
					<!-- /section title -->

					<!-- Products tab & slick -->
					<div class="col-md-12">
						<div class="row">
							<div class="products-tabs">
								<!-- tab -->
								<div id="tab1" class="tab-pane active">
									<div class="products-slick" data-nav="#slick-nav-1">
<!-- 										product -->
<!-- 										<div class="product"> -->
<!-- 											<div class="product-img"> -->
<%-- 												<img src="${img1}/cpu/intel/i5/1.jpg" alt=""> --%>
<!-- 												<div class="product-label"> -->
													
<!-- 													<span class="new">NEW</span> -->
<!-- 												</div> -->
<!-- 											</div> -->
<!-- 											<div class="product-body"> -->
<!-- 												<p class="product-category">CPU</p> -->
<%-- 												<h3 class="product-name"><a href='<c:url value="/product2"/>'>INTEL CORE I5-8400 BX80684I58400 PROCESSOR</a></h3> --%>
<!-- 												<h4 class="product-price">Rs.24500 <del class="product-old-price">Rs.30000</del></h4> -->
												
<!-- 												<div class="product-btns"> -->
<!-- 													<button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button> -->
													
<!-- 													<button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button> -->
<!-- 												</div> -->
<!-- 											</div> -->
<!-- 											<div class="add-to-cart"> -->
<!-- 												<button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button> -->
<!-- 											</div> -->
<!-- 										</div> -->
<!-- 										/product -->

<!-- 										product -->
<!-- 										<div class="product"> -->
<!-- 											<div class="product-img"> -->
<%-- 												<img src="${img1}/cabin/cooler h500m/1.jpg" alt=""> --%>
<!-- 												<div class="product-label"> -->
<!-- 													<span class="new">NEW</span> -->
<!-- 												</div> -->
<!-- 											</div> -->
<!-- 											<div class="product-body"> -->
<!-- 												<p class="product-category">PC-CABIN</p> -->
<%-- 												<h3 class="product-name"><a href='<c:url value="/product3"/>'>COOLER MASTER MASTERCASE H500P ATX MID-TOWER</a></h3> --%>
<!-- 												<h4 class="product-price">Rs.12800<del class="product-old-price">Rs.18200</del></h4> -->
												
<!-- 												<div class="product-btns"> -->
<!-- 													<button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button> -->
													
<!-- 													<button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button> -->
<!-- 												</div> -->
<!-- 											</div> -->
<!-- 											<div class="add-to-cart"> -->
<!-- 												<button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button> -->
<!-- 											</div> -->
<!-- 										</div> -->
<!-- 										/product -->

<!-- 										product -->
<!-- 										<div class="product"> -->
<!-- 											<div class="product-img"> -->
<%-- 												<img src="${img1}/hard disk/seagate/22-178-993-18.jpg" alt=""> --%>
<!-- 												<div class="product-label"> -->
<!-- 													<span class="sale">-30%</span> -->
<!-- 												</div> -->
<!-- 											</div> -->
<!-- 											<div class="product-body"> -->
<!-- 												<p class="product-category">Hard-Disk</p> -->
<%-- 												<h3 class="product-name"><a href='<c:url value="/product4"/>'>SEAGATE NEW BARRACUDA</a></h3> --%>
<!-- 												<h4 class="product-price">RS.3600.00 <del class="product-old-price">Rs.5600</del></h4> -->
												
<!-- 												<div class="product-btns"> -->
<!-- 													<button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button> -->
													
<!-- 													<button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button> -->
<!-- 												</div> -->
<!-- 											</div> -->
<!-- 											<div class="add-to-cart"> -->
<!-- 												<button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button> -->
<!-- 											</div> -->
<!-- 										</div> -->
<!-- 										/product -->

<!-- 										product -->
<!-- 										<div class="product"> -->
<!-- 											<div class="product-img"> -->
<%-- 												<img src="${img1}\graphic card\MSI GeForce GTX 1080 Ti\14-137-114-V01.jpg" alt=""> --%>
<!-- 											</div> -->
<!-- 											<div class="product-body"> -->
<!-- 												<p class="product-category">GRAPHIC-CARD</p> -->
<%-- 												<h3 class="product-name"><a href='<c:url value="/product5"/>'>MSI GTX 1080 TI GAMING X VIDEO GRAPHIC CARDS</a></h3> --%>
<!-- 												<h4 class="product-price">RS.73300.00<del class="product-old-price">Rs.90000</del></h4> -->
												
<!-- 												<div class="product-btns"> -->
<!-- 													<button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button> -->
													
<!-- 													<button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button> -->
<!-- 												</div> -->
<!-- 											</div> -->
<!-- 											<div class="add-to-cart"> -->
<!-- 												<button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button> -->
<!-- 											</div> -->
<!-- 										</div> -->
<!-- 										/product -->

<!-- 										product -->
<!-- 										<div class="product"> -->
<!-- 											<div class="product-img"> -->
<%-- 												<img src="${img1}/mother board/intel/msi/13-144-155-V07.jpg" alt=""> --%>
<!-- 											</div> -->
<!-- 											<div class="product-body"> -->
<!-- 												<p class="product-category">Mother Board</p> -->
<%-- 												<h3 class="product-name"><a href='<c:url value="/product6"/>'>MSI Pro Series Intel Coffee Lake LGA 1151</a></h3> --%>
<!-- 												<h4 class="product-price">RS.12800.00<del class="product-old-price">RS.18200.00</del></h4> -->
												
<!-- 												<div class="product-btns"> -->
<!-- 													<button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button> -->
													
<!-- 													<button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button> -->
<!-- 												</div> -->
<!-- 											</div> -->
<!-- 											<div class="add-to-cart"> -->
<!-- 												<button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button> -->
<!-- 											</div> -->
<!-- 										</div> -->
<!-- 										/product -->



<!-- product1 -->
<c1:forEach items="${products}" var="pro">
										<div class="product">
											<div class="product-img">
												<a href="<c:url value="/product1/${pro.getProdId()}"/>"><img src="${img}/${pro.getProdId()}.jpg" wodth="200px" height="200px" alt=""></a>
												<div class="product-label">
													<span class="new">NEW</span>
												</div>
											</div>
											<div class="product-body">
												<p class="product-category">${pro.getCategory().getCategoryname() }</p>
												<h3 class="product-name"><a href="#">${pro.getProdName()}</a></h3>
												<h4 class="product-price">RS.${pro.getProdPrice()}<del class="product-old-price">RS.${pro.getProdPrice()}</del></h4>
												
												<div class="product-btns">
													<button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button>
													
													<button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button>
												</div>
											</div>
											<div class="add-to-cart">
												<button class="add-to-cart-btn"><a href="<c:url value="/product1/${pro.getProdId()}"/>"><i class="fa fa-shopping-cart"></i> add to cart</button></a>
											</div>
										</div>
				</c1:forEach>
										<!-- /product1 -->









									</div>
									<div id="slick-nav-1" class="products-slick-nav"></div>
								</div>
								<!-- /tab -->
							</div>
						</div>
					</div>
					<!-- Products tab & slick -->
				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /SECTION -->





		<!-- SECTION -->
		<div class="section">
			<!-- container -->
			<div class="container">
				<!-- row -->
				<div class="row">
					<div class="col-md-4 col-xs-6">
						<div class="section-title">
							<h4 class="title">Top selling</h4>
							<div class="section-nav">
								<div id="slick-nav-3" class="products-slick-nav"></div>
							</div>
						</div>

						<div class="products-widget-slick" data-nav="#slick-nav-3">
							<div>
<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}/cpu/intel/i5/1.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">CPU</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product2"/>'>INTEL CORE I5-8400 BX80684I58400 PROCESSOR</a></h3> --%>
<!-- 										<h4 class="product-price">Rs.24500<del class="product-old-price">Rs.30000</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								/product widget -->

<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}/cabin/cooler h500m/1.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">PC-CABIN</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product3"/>'>COOLER MASTER MASTERCASE H500P ATX MID-TOWER</a></h3> --%>
<!-- 										<h4 class="product-price">Rs.12800 <del class="product-old-price">Rs.18200</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								/product widget -->

<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}/hard disk/seagate/22-178-993-18.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">Hard-Disk</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product4"/>'>SEAGATE NEW BARRACUDA</a></h3> --%>
<!-- 										<h4 class="product-price">RS.3600.00  <del class="product-old-price">Rs.5600</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								product widget -->
<!-- 							</div> -->

<!-- 							<div> -->
<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}\graphic card\MSI GeForce GTX 1080 Ti\14-137-114-V01.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">GRAPHIC-CARD</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product5"/>'>MSI GTX 1080 TI GAMING X VIDEO GRAPHIC CARDS</a></h3> --%>
<!-- 										<h4 class="product-price">RS.73300.00 <del class="product-old-price">RS.90000.00</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								/product widget -->

<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}/mother board/intel/msi/13-144-155-V07.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">Moter Board</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product6"/>'>MSI Pro Series Intel Coffee Lake LGA 1151</a></h3> --%>
<!-- 										<h4 class="product-price">Rs.12800 <del class="product-old-price">Rs.18200</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								/product widget -->



<!-- product widget -->
<c1:forEach items="${products}" var="pro">

								<div class="product-widget">
									<div class="product-img">
										<img src="${img}/${pro.getProdId()}.jpg" alt="">
									</div>
									<div class="product-body">
										<p class="product-category">${pro.getCategory().getCategoryname() }</p>
										<h3 class="product-name"><a href="#">${pro.getProdName()}</a></h3>
										<h4 class="product-price">RS.${pro.getProdPrice()} <del class="product-old-price">RS.${pro.getProdPrice()}</del></h4>
									</div>
								</div>
								</c1:forEach>
								<!-- /product widget -->











								
							</div>
						</div>
					</div>

					<div class="col-md-4 col-xs-6">
						<div class="section-title">
							<h4 class="title">Top selling</h4>
							<div class="section-nav">
								<div id="slick-nav-4" class="products-slick-nav"></div>
							</div>
						</div>

						<div class="products-widget-slick" data-nav="#slick-nav-4">
							<div>
<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}/mother board/intel/msi/13-144-155-V07.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">Moter Board</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product6"/>'>MSI Pro Series Intel Coffee Lake LGA 1151</a></h3> --%>
<!-- 										<h4 class="product-price">Rs.12800 <del class="product-old-price">Rs.18200</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								/product widget -->

<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}\graphic card\MSI GeForce GTX 1080 Ti\14-137-114-V01.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">GRAPHIC-CARD</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product5"/>'>MSI GTX 1080 TI GAMING X VIDEO GRAPHIC CARDS</a></h3> --%>
<!-- 										<h4 class="product-price">RS.73300.00<del class="product-old-price">RS.90000.00</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								/product widget -->

<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}/hard disk/seagate/22-178-993-18.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">Hard-Disk</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product4"/>'>SEAGATE NEW BARRACUDA</a></h3> --%>
<!-- 										<h4 class="product-price">RS.3600.00 <del class="product-old-price">Rs.5600</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								product widget -->
<!-- 							</div> -->

<!-- 							<div> -->
<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}/cabin/cooler h500m/1.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">PC-CABIN</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product3"/>'>COOLER MASTER MASTERCASE H500P ATX MID-TOWER</a></h3> --%>
<!-- 										<h4 class="product-price">Rs.12800<del class="product-old-price">Rs.18200</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								/product widget -->

<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}/cpu/intel/i5/1.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">CPU</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product2"/>'>INTEL CORE I5-8400 BX80684I58400 PROCESSOR</a></h3> --%>
<!-- 										<h4 class="product-price">Rs.24500 <del class="product-old-price">Rs.30000</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								/product widget -->

								
								<!-- product widget -->
                              <c1:forEach items="${products}" var="pro">

								<div class="product-widget">
									<div class="product-img">
										<img src="${img}/${pro.getProdId()}.jpg" alt="">
									</div>
									<div class="product-body">
										<p class="product-category">${pro.getCategory().getCategoryname() }</p>
										<h3 class="product-name"><a href="#">${pro.getProdName()}</a></h3>
										<h4 class="product-price">RS.${pro.getProdPrice()} <del class="product-old-price">RS.${pro.getProdPrice()}</del></h4>
									</div>
								</div>
								</c1:forEach>
								<!-- /product widget -->
								
								
								
								
								
								
								
								
								
							</div>
						</div>
					</div>

					<div class="clearfix visible-sm visible-xs"></div>

					<div class="col-md-4 col-xs-4">
						<div class="section-title">
							<h4 class="title">Top selling</h4>
							<div class="section-nav">
								<div id="slick-nav-5" class="products-slick-nav"></div>
							</div>
						</div>

						<div class="products-widget-slick" data-nav="#slick-nav-5">
							<div>
<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}/cpu/intel/i5/1.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">CPU</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product2"/>'>INTEL CORE I5-8400 BX80684I58400 PROCESSOR</a></h3> --%>
<!-- 										<h4 class="product-price">Rs.24500<del class="product-old-price">Rs.30000</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								/product widget -->

<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}/cabin/cooler h500m/1.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">PC-CABIN</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product3"/>'>COOLER MASTER MASTERCASE H500P ATX MID-TOWER</a></h3> --%>
<!-- 										<h4 class="product-price">Rs.12800 <del class="product-old-price">Rs.18200</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								/product widget -->

<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}/hard disk/seagate/22-178-993-18.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">Hard-Disk</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product4"/>'>SEAGATE NEW BARRACUDA</a></h3> --%>
<!-- 										<h4 class="product-price">RS.3600.00<del class="product-old-price">Rs.5600</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								product widget -->
<!-- 							</div> -->

<!-- 							<div> -->
<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}\graphic card\MSI GeForce GTX 1080 Ti\14-137-114-V01.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">GRAPHIC-CARD</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product5"/>'>MSI GTX 1080 TI GAMING X VIDEO GRAPHIC CARDS</a></h3> --%>
<!-- 										<h4 class="product-price">RS.73000 <del class="product-old-price">RS.90000</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								/product widget -->

<!-- 								product widget -->
<!-- 								<div class="product-widget"> -->
<!-- 									<div class="product-img"> -->
<%-- 										<img src="${img1}/mother board/intel/msi/13-144-155-V07.jpg" alt=""> --%>
<!-- 									</div> -->
<!-- 									<div class="product-body"> -->
<!-- 										<p class="product-category">Mother Board</p> -->
<%-- 										<h3 class="product-name"><a href='<c:url value="/product6"/>'>MSI Pro Series Intel Coffee Lake LGA 1151</a></h3> --%>
<!-- 										<h4 class="product-price">Rs.12800<del class="product-old-price">Rs.18200</del></h4> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								/product widget -->

								<!-- product widget -->
<c1:forEach items="${products}" var="pro">

								<div class="product-widget">
									<div class="product-img">
										<img src="${img}/${pro.getProdId()}.jpg" alt="">
									</div>
									<div class="product-body">
										<p class="product-category">${pro.getCategory().getCategoryname() }</p>
										<h3 class="product-name"><a href="#">${pro.getProdName()}</a></h3>
										<h4 class="product-price">RS.${pro.getProdPrice()} <del class="product-old-price">RS.${pro.getProdPrice()}</del></h4>
									</div>
								</div>
								</c1:forEach>
								<!-- /product widget -->
								
								
								
								
								
								
								
							</div>
						</div>
					</div>

				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /SECTION -->

<!-- 		<!-- NEWSLETTER --> -->
<!-- 		<div id="newsletter" class="section"> -->
<!-- 			<!-- container --> -->
<!-- 			<div class="container"> -->
<!-- 				row -->
<!-- 				<div class="row"> -->
<!-- 					<div class="col-md-12"> -->
<!-- 						<div class="newsletter"> -->
<!-- 							<p>Sign Up for the <strong>NEWSLETTER</strong></p> -->
<!-- 							<form> -->
<!-- 								<input class="input" type="email" placeholder="Enter Your Email"> -->
<!-- 								<button class="newsletter-btn"><i class="fa fa-envelope"></i> Subscribe</button> -->
<!-- 							</form> -->
<!-- 							<ul class="newsletter-follow"> -->
<!-- 								<li> -->
<!-- 									<a href="#"><i class="fa fa-facebook"></i></a> -->
<!-- 								</li> -->
<!-- 								<li> -->
<!-- 									<a href="#"><i class="fa fa-twitter"></i></a> -->
<!-- 								</li> -->
<!-- 								<li> -->
<!-- 									<a href="#"><i class="fa fa-instagram"></i></a> -->
<!-- 								</li> -->
<!-- 								<li> -->
<!-- 									<a href="#"><i class="fa fa-pinterest"></i></a> -->
<!-- 								</li> -->
<!-- 							</ul> -->
<!-- 						</div> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 				/row -->
<!-- 			</div> -->
<!-- 			<!-- /container --> -->
<!-- 		</div> -->
<!-- 		<!-- /NEWSLETTER --> -->

		<!-- FOOTER -->
		<footer id="footer">
			<!-- top footer -->
			<div class="section">
				<!-- container -->
				<div class="container">
					<!-- row -->
					<div class="row">
						<div class="col-md-3 col-xs-6">
							<div class="footer">
								<h3 class="footer-title">Contact Us</h3>
								
								<ul class="footer-links">
									<li><a href="#"><i class="fa fa-map-marker"></i>#544,26th cross,Rajaji Nagar</a></li>
									<li><a href="#"><i class="fa fa-phone"></i>+91-9686060076</a></li>
									<li><a href="#"><i class="fa fa-envelope-o"></i>gamersrig@google</a></li>
								</ul>
							</div>
						</div>

						<div class="col-md-3 col-xs-6">
							<div class="footer">
								<h3 class="footer-title">Categories</h3>
								<ul class="footer-links">
									
									<li><a href="#">CPU</a></li>
									<li><a href="#">PC-CABIN</a></li>
									<li><a href="#">Hard-Disk</a></li>
									<li><a href="#">GRAPHIC-CARD</a></li>
									<li><a href="#">Moter-Board</a></li>
								</ul>
							</div>
						</div>

						<div class="clearfix visible-xs"></div>

						<div class="col-md-3 col-xs-6">
							<div class="footer">
								<h3 class="footer-title">Information</h3>
								<ul class="footer-links">
									<li><a href="#">About Us</a></li>
									<li><a href="#">Contact Us</a></li>
									<li><a href="#">Privacy Policy</a></li>
									<li><a href="#">Orders and Returns</a></li>
									<li><a href="#">Terms & Conditions</a></li>
								</ul>
							</div>
						</div>

						<div class="col-md-3 col-xs-6">
							<div class="footer">
								<h3 class="footer-title">Service</h3>
								<ul class="footer-links">
									<li><a href="#">My Account</a></li>
									<li><a href="#">View Cart</a></li>
									<li><a href="#">Wishlist</a></li>
									<li><a href="#">Track My Order</a></li>
									<li><a href="#">Help</a></li>
								</ul>
							</div>
						</div>
					</div>
					<!-- /row -->
				</div>
				<!-- /container -->
			</div>
			<!-- /top footer -->

			<!-- bottom footer -->
			<div id="bottom-footer" class="section">
				<div class="container">
					<!-- row -->
					<div class="row">
						<div class="col-md-12 text-center">
							<ul class="footer-payments">
								<li><a href="#"><i class="fa fa-cc-visa"></i></a></li>
								<li><a href="#"><i class="fa fa-credit-card"></i></a></li>
								<li><a href="#"><i class="fa fa-cc-paypal"></i></a></li>
								<li><a href="#"><i class="fa fa-cc-mastercard"></i></a></li>
								<li><a href="#"><i class="fa fa-cc-discover"></i></a></li>
								<li><a href="#"><i class="fa fa-cc-amex"></i></a></li>
							</ul>
							<span class="copyright">
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
								Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
							<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							</span>
						</div>
					</div>
						<!-- /row -->
				</div>
				<!-- /container -->
			</div>
			<!-- /bottom footer -->
		</footer>
		<!-- /FOOTER -->

		<!-- jQuery Plugins -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/bootstrap.min.js"></script>
		<script src="${js}/slick.min.js"></script>
		<script src="${js}/nouislider.min.js"></script>
		<script src="${js}/jquery.zoom.min.js"></script>
		<script src="${js}/main.js"></script>

	</body>
</html>
