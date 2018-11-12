<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<!-- BREADCRUMB -->
		<div id="breadcrumb" class="section">
			<!-- container -->
			<div class="container">
				<!-- row -->
				<div class="row">
					<div class="col-md-12">
						<ul class="breadcrumb-tree">
							<li><a href="#">Home</a></li>
							<li><a href="#">Categories</a></li>
							<li><a href="#">${pro.getCategory().getCategoryname() }</a></li>
							<li class="active">${pro.getProdName()} </li>
						</ul>
					</div>
				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /BREADCRUMB -->

		<!-- SECTION -->
		<div class="section">
			<!-- container -->
			<div class="container">
				<!-- row -->
				<div class="row">
					Product main img
					<div class="col-md-5 col-md-push-2">
						<div id="product-main-img">
						<div class="product-preview">
								<img src="${img}/${pro.getProdId()}.jpg" alt="">
							</div>

<!-- 							<div class="product-preview"> -->
<%-- 								<img src="${img1}/cabin/cooler h500m/2.jpg" alt=""> --%>
<!-- 							</div> -->

<!-- 							<div class="product-preview"> -->
<%-- 								<img src="${img1}/cabin/cooler h500m/3.png" alt=""> --%>
<!-- 							</div> -->

							
							
						</div>
					</div>
					/Product main img

					<!-- Product thumb imgs -->
					<div class="col-md-2  col-md-pull-5">
						<div id="product-imgs">
							<div class="product-preview">
								<img src="${img}/${pro.getProdId()}.jpg" alt="">
							</div>

<!-- 							<div class="product-preview"> -->
<%-- 								<img src="${img1}/cabin/cooler h500m/2.jpg" alt=""> --%>
<!-- 							</div> -->

<!-- 							<div class="product-preview"> -->
<%-- 								<img src="${img1}/cabin/cooler h500m/3.png" alt=""> --%>
<!-- 							</div> -->

							
						</div>
					</div>
					<!-- /Product thumb imgs -->

					<!-- Product details -->
					<div class="col-md-5">
						<div class="product-details">
							<h2 class="product-name">${pro.getProdName()}</h2>
							
							<div>
								<h3 class="product-price">RS.${pro.getProdPrice()}<del class="product-old-price">RS.${pro.getProdPrice()}</del></h3>
								<span class="product-available">In Stock</span>
							</div>
							<p><li>${pro.getProdDiscription()}</li>
                                   
                                                         </p>

							

							<div class="add-to-cart">
								<div class="qty-label">
									Qty
									<div class="input-number">
										<input type="number">
										<span class="qty-up">+</span>
										<span class="qty-down">-</span>
									</div>
								</div>
<%-- 								<a href="<c:url value="/addtocart/${pro.getprodId()}"/>"><button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button></a> --%>
							</div>

							<ul class="product-btns">
								<li><a href="<c:url value="/addtocart/${pro.getProdId()}"/>"><i class="fa fa-shopping-cart"></i> add to Cart</a></li>
								
							</ul>

							</div></div></div>
						

							<ul class="product-links">
								<li>Share:</li>
								<li><a href="#"><i class="fa fa-facebook"></i></a></li>
								<li><a href="#"><i class="fa fa-twitter"></i></a></li>
								<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
								<li><a href="#"><i class="fa fa-envelope"></i></a></li>
							</ul>

						</div>
					</div>
					<!-- /Product details -->

					<!-- Product tab -->
					<div class="col-md-12">
						<div id="product-tab">
							<!-- product tab nav -->
							<ul class="tab-nav">
								<li class="active"><a data-toggle="tab" href="#tab1">Description</a></li>
<!-- 								<li><a data-toggle="tab" href="#tab2">Details</a></li> -->
							</ul>
							<!-- /product tab nav -->

							<!-- product tab content -->
							<div class="tab-content">
								<!-- tab1  -->
								<div id="tab1" class="tab-pane fade in active">
									<div class="row">
										<div class="col-md-12">
											<p><li>${pro.getProdDiscription()}</li>
                                                         
                                                                                       </p>
										</div>
									</div>
								</div>
								<!-- /tab1  -->

<!-- 								tab2  -->
<!-- 								<div id="tab2" class="tab-pane fade in"> -->
<!-- 									<div class="row"> -->
<!-- 										<div class="col-md-12"> -->
<!-- 											<p> -->
<!-- <li>Brand				Cooler Master</li> -->
<!-- <li>Colour				H500P</li> -->
<!-- <li>Form Factor			Extended ATX</li> -->
<!-- <li>Item Height			54.1 Centimeters</li> -->
<!-- <li>Item Width			24.1 Centimeters</li> -->
<!-- <li>Item Weight	        11.3 Kg</li> -->
<!-- <li>Product Dimensions	54.4 x 24.1 x 54.1 cm</li> -->
<!-- <li>Item model number	MCM-H500P-MGNN-S00</li> -->
<!-- <li>Included            Components	Case and manual</li> -->
 	 
<!-- </p> -->
<!-- 										</div> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								/tab2  -->

								<!-- tab3  -->

		<!-- Section -->
		<div class="section">
			<!-- container -->
			<div class="container">
				<!-- row -->
				<div class="row">

					<div class="col-md-12">
						<div class="section-title text-center">
							<h3 class="title">Related Products</h3>
						</div>
					</div>

					<!-- product -->
					<div class="col-md-3 col-xs-6">
						<div class="product">
							<div class="product-img">
								<img src="${img1}/hard disk/seagate/22-178-993-18.jpg" alt="">
								<div class="product-label">
									<span class="new">NEW</span>
								</div>
							</div>
							<div class="product-body">
								<p class="product-category">Hard Disk</p>
								<h3 class="product-name"><a href="#">Seagate New BarraCuda</a></h3>
								<h4 class="product-price">RS.3600.00 <del class="product-old-price">RS.5600.00</del></h4>
								
								<div class="product-btns">
									<button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button>
									
									<button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button>
								</div>
							</div>
							<div class="add-to-cart">
								<button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
							</div>
						</div>
					</div>
					<!-- /product -->

					<!-- product -->
					<div class="col-md-3 col-xs-6">
						<div class="product">
							<div class="product-img">
								<img src="${img1}\graphic card\MSI GeForce GTX 1080 Ti\14-137-114-V01.jpg" alt="">
                                                                        <div class="product-label">
									<span class="new">NEW</span>
								</div>
							</div>
							<div class="product-body">
								<p class="product-category">Graphic Card</p>
								<h3 class="product-name"><a href="#">MSI GTX 1080 TI Gaming X Video Graphic Cards</a></h3>
								<h4 class="product-price">RS.73300.00<del class="product-old-price">RS.90000.00</del></h4>
								
								<div class="product-btns">
									<button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button>
									
									<button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button>
								</div>
							</div>
							<div class="add-to-cart">
								<button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
							</div>
						</div>
					</div>
					<!-- /product -->

					<div class="clearfix visible-sm visible-xs"></div>

					<!-- product -->
					<div class="col-md-3 col-xs-6">
						<div class="product">
							<div class="product-img">
								<img src="${img1}/cpu/intel/i5/1.jpg" alt="">
                                                                        <div class="product-label">
									<span class="new">NEW</span>
								</div>
							</div>
							<div class="product-body">
								<p class="product-category">CPU</p>
								<h3 class="product-name"><a href="#">INTEL CORE I5-8400 BX80684I58400 PROCESSOR</a></h3>
								<h4 class="product-price">RS.24500.00<del class="product-old-price">RS.30000.00</del></h4>
								
								<div class="product-btns">
									<button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button>
									
									<button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button>
								</div>
							</div>
							<div class="add-to-cart">
								<button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
							</div>
						</div>
					</div>
					<!-- /product -->
                   <!-- product -->
					<div class="col-md-3 col-xs-6">
						<div class="product">
							<div class="product-img">
								<img src="${img1}/mother board/intel/msi/product_1_20180402144725_5ac1d1fd13807.png" alt="">
								<div class="product-label">
									<span class="new">NEW</span>
								</div>
							</div>
							<div class="product-body">
								<p class="product-category">Moter Board</p>
								<h3 class="product-name"><a href="#">MSI Pro Series Intel Coffee Lake LGA 1151</a></h3>
								<h4 class="product-price">RS.12800.00 <del class="product-old-price">RS.18200.00</del></h4>
								<div class="product-rating">
								</div>
								<div class="product-btns">
									<button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button>
									
									<button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button>
								</div>
							</div>
							<div class="add-to-cart">
								<button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
							</div>
						</div>
					</div>
					<!-- /product -->
					
					
				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /Section -->

<!-- 		<!-- NEWSLETTER --> -->
<!-- 		<div id="newsletter" class="section"> -->
<!-- 			<!-- container --> -->
<!-- 			<div class="container"> -->
<!-- 				row -->
<!-- 				<div class="row"> -->
<!-- 					<div class="col-md-12"> -->
<!-- 						<div class="newsletter"> -->
<!-- 							<p>Sign Up for the <strong>NEWSLETTER</strong></p> -->
<%-- 							<form> --%>
<!-- 								<input class="input" type="email" placeholder="Enter Your Email"> -->
<!-- 								<button class="newsletter-btn"><i class="fa fa-envelope"></i> Subscribe</button> -->
<%-- 							</form> --%>
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
								
<!-- 							</ul> -->
<!-- 						</div> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 				/row -->
<!-- 			</div> -->
<!-- 			<!-- /container --> -->
<!-- 		</div> -->
<!-- 		<!-- /NEWSLETTER --> -->
		
		
		</body>
		<%@ include file="footer.jsp" %>
		
		
</html>