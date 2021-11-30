<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="daw.pedroe.proyectoFinal.serviceImpl.PatientServiceImpl"%>
<%@ page import="daw.pedroe.proyectoFinal.model.Patient"%>

<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>
	<c:if test="${sessionScope['login'] != null}">
	
		<h1>Welcome to your profile!</h1>
		
		<c:if test="${sessionScope['login'].role == 'admin'}">
			User admin<br>
			<h3>Notificaciones sin asignar:</h3><br>
			<c:forEach var='parametro' items='${notificationAdmin}'>
				-> User: <c:out value="${parametro.notifier}"/> | <c:out value="${parametro.title}"/> | <c:out value="${parametro.body}"/><br>
			</c:forEach>
			<h3>Usuarios sin activar:</h3>	
			<c:forEach var='parametro' items='${userAdmin}'>
				-> User: <c:out value="${parametro.username}"/> | <c:out value="${parametro.fullName}"/><br>
			</c:forEach>
			<input type="button" id="boton" onclick="location.href='<%=request.getContextPath()+"/pdf"%>';" value="Download PDF" /><br>		
		</c:if>
		
		<c:if test="${sessionScope['login'].role =='notifier' }">
			User notifier<br>
			<c:forEach var='parametro' items='${notifications}'>
				-> <c:out value="${parametro.province}"/> | <c:out value="${parametro.municipality}"/> | <c:out value="${parametro.title}"/> | <c:out value="${parametro.body}"/> | <c:out value="${parametro.link}"/><br>
			</c:forEach>	
			<input type="button" id="boton" onclick="location.href='<%=request.getContextPath()+"/notification"%>';" value="Notify" /><br>		
		</c:if>
		
		<c:if test="${sessionScope['login'].role =='tracker' }">
			User tracker<br>
			<c:forEach var='parametro' items='${notificationTracker}'>
				-> <c:out value="${parametro.province}"/> | <c:out value="${parametro.municipality}"/> | <c:out value="${parametro.title}"/><br>
			</c:forEach>
			<form action="tracker" method="post">
				Notification ID:<input type="text" name="id" /><br> 
				<input type="submit" value="submit" />
			</form>
		</c:if>
		<input type="button" id="boton" onclick="location.href='<%=request.getContextPath()+"/logout"%>';" value="Logout" /><br>
	</c:if>
	<c:if test="${sessionScope['login'] == null }">
		Usuario incorrecto o inexistente<br>
	</c:if>
	<a href="<%=request.getContextPath()+"/"%>">Back to index</a>
	
</body>
</html>