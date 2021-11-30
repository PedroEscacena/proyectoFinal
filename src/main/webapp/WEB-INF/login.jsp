<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Proyecto Final</title>
<meta name="description" content="Core HTML Project">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- External CSS -->
<link rel="stylesheet" href="vendor/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="vendor/select2/select2.min.css">
<link rel="stylesheet" href="vendor/owlcarousel/owl.carousel.min.css">
<link rel="stylesheet" href="vendor/lightcase/lightcase.css">

<!-- Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400|Work+Sans:300,400,700"
	rel="stylesheet">

<!-- CSS -->
<link rel="stylesheet" href="css/style.min.css">
<link rel="stylesheet"
	href="https://cdn.linearicons.com/free/1.0.0/icon-font.min.css">
<link
	href="https://file.myfontastic.com/7vRKgqrN3iFEnLHuqYhYuL/icons.css"
	rel="stylesheet">

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.js"></script>

</head>
<body data-spy="scroll" data-target="#navbar-nav-header"
	class="static-layout">
	<div class="boxed-page">
		<div class="jumbotron d-flex align-items-center"
			style="background-image: url(img/hero-2.jpg)">
			<div class="container text-center">
				<h1 class="display-2 mb-4">Proyecto Final</h1>

				<c:if test="${sessionScope['register'] != null}">
				Usuario registrado correctamente! Inicie sesion.<br>
				</c:if>
				<c:if test="${sessionScope['error'] != null}">
				El usuario no esta activado o error al iniciar sesión. Un administrador tendra que activar su cuenta.<br>
				</c:if>
				<form action="login" method="post">
					Enter your username: <input type="text" name="username" value="" /><br>
					Enter your password: <input type="password" name="password"
						value="" /><br>
					<!--  <input type="submit" value="submit" />-->
					<button onclick="location.href='index.jsp'" type="button">Submit</button>


				</form>
			</div>
		</div>

	</div>
	<!-- /.row -->


	<!-- End of Client Section -->
	<footer class="mastfoot mb-3 bg-white py-4 border-top">
		<div class="inner container">
			<div class="row">
				<div
					class="col-md-6 d-flex align-items-center justify-content-md-start justify-content-center">
					<p class="mb-0">
						&copy; 2021 Proyecto final realizado por <a
							href="hhttps://es.linkedin.com/in/pedro-escacena-mac%C3%ADas-55b4661a0"
							target="_blank">Pedro Escacena</a>.
					</p>
				</div>

				<div class="col-md-6">
					<nav
						class="nav nav-mastfoot justify-content-md-end justify-content-center">
						<a class="nav-link" href="#"> <i class="icon-facebook"></i>
						</a> <a class="nav-link" href="#"> <i class="icon-twitter"></i>
						</a> <a class="nav-link" href="#"> <i class="icon-instagram"></i>
						</a> <a class="nav-link" href="#"> <i class="icon-linkedin"></i>
						</a> <a class="nav-link" href="#"> <i class="icon-youtube"></i>
						</a> <a class="nav-link" href="#"> <i class="icon-pinterest"></i>
						</a>
					</nav>
				</div>

			</div>
		</div>
	</footer>
	<!-- External JS -->
	<script type="text/javascript"
		src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.js"></script>
	<script src="vendor/bootstrap/popper.min.js"></script>
	<script src="vendor/bootstrap/bootstrap.min.js"></script>
	<script src="vendor/select2/select2.min.js "></script>
	<script src="vendor/owlcarousel/owl.carousel.min.js"></script>
	<script src="vendor/isotope/isotope.min.js"></script>
	<script src="vendor/lightcase/lightcase.js"></script>
	<script src="vendor/waypoints/waypoint.min.js"></script>
	<script src="vendor/countTo/jquery.countTo.js"></script>

	<!-- Main JS -->
	<script src="js/app.min.js "></script>
	<script src="//localhost:35729/livereload.js"></script>
</body>
</html>
