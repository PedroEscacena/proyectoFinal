<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Index</title>
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

<!-- Modernizr JS for IE8 support of HTML5 elements and media queries -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.js"></script>

</head>
<body data-spy="scroll" data-target="#navbar-nav-header"
	class="single-layout">
	<div class="boxed-page">
		<nav id="gtco-header-navbar" class="navbar navbar-expand-lg py-4">
			<div class="container">
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbar-nav-header" aria-controls="navbar-nav-header"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="lnr lnr-menu"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbar-nav-header">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item"><a class="nav-link"
							href="patient/patient.jsp">Patient</a></li>
						<li class="nav-item"><a class="nav-link"
							href="doctor/doctor.jsp">Doctor</a></li>
					</ul>
				</div>
			</div>

		</nav>
		<div class="jumbotron d-flex align-items-center"
			style="background-image: url(img/blog-1.jpg)">
			<div class="container text-center">
				<h1 class="display-2 mb-4 single-blog-title">Página de inicio</h1>
			</div>
		</div>
		<!-- Contact Form Section -->
		<section id="gtco-single-content" class="bg-white">
			<div class="container">
				<div class="section-content blog-content">
					<div class="row">
						<!--<div class="col-md-12 form-btn text-center">
							<c:if test="${sessionScope['login'] != null}">

								<h1>Welcome to your profile!</h1>

								<c:if test="${sessionScope['login'].role == 'doctor'}">
							User doctor<br>
									<h3>Notificaciones sin asignar:</h3>
									<br>
									<c:forEach var='parametro' items='${notificationAdmin}'>
							-> User: <c:out value="${parametro.notifier}" /> | <c:out
											value="${parametro.title}" /> | <c:out
											value="${parametro.body}" />
										<br>
									</c:forEach>
									<h3>Usuarios sin activar:</h3>
									<c:forEach var='parametro' items='${userAdmin}'>
							-> User: <c:out value="${parametro.username}" /> | <c:out
											value="${parametro.fullName}" />
										<br>
									</c:forEach>
								</c:if>

								<c:if test="${sessionScope['login'].role =='patient' }">
							User Patient<br>
									<c:forEach var='parametro' items='${notifications}'>
							-> <c:out value="${parametro.province}" /> | <c:out
											value="${parametro.municipality}" /> | <c:out
											value="${parametro.title}" /> | <c:out
											value="${parametro.body}" /> | <c:out
											value="${parametro.link}" />
										<br>
									</c:forEach>
								</c:if>
						</div>  -->
						<!-- Single Content Holder -->
						<div class="col-md-8 offset-md-2 mt-4">
							<div class="col-md-12 form-btn text-center">
								<h4>En esta página mostramos la página de inicio y decidir
									qué hacer</h4>
								<h2>
									<a class="nav-item nav-link" href="patient/patient.jsp">Ver
										datos de paciente</a>
								</h2>
								<br>
								<p>Mostrar los datos de los pacientes y las citas que tiene</p>
								<br>
								<h2>
									<a class="nav-item nav-link" href="doctor/doctor.jsp">Ver
										datos doctor</a>
								</h2>
								<br>
								<p>Mostrar los datos del doctor, las citas que tiene y los
									pacientes que tiene vinculados y sus respectivos datos.</p>

								<br>
							</div>
						</div>
						<!-- End of Contact Form Holder -->
					</div>
				</div>
			</div>
		</section>
		<!-- End of Contact Form Section -->
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
	</div>

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
