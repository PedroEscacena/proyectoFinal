<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<c:if test="${sessionScope['register'] != null}">
		Usuario registrado correctamente! Inicie sesion.<br>
	</c:if>
	<c:if test="${sessionScope['error'] != null}">
		El usuario no esta activado. Un administrador tendra que activar su cuenta.<br>
	</c:if>
	<form action="login" method="post">
		Enter your username: <input type="text" name="username" value=""/><br>
		Enter your password: <input type="text" name="password" value=""/><br>
		<input type="submit" value="submit"/>
	</form>
	<a href="<%=request.getContextPath()+"/"%>">Back to index</a>
</body>
</html>