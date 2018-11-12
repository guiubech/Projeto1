<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Biblioteca</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>Isbn</td>
			<td>Título</td>
			<td>Idioma</td>
		</tr>
		<c:forEach var="l" items="${livros}" varStatus="i">
			<tr>
				<td><c:out value="${l.isbn}"/></td>
				<td><c:out value="${l.titulo}"/></td>
				<td><c:out value="${l.idioma}"/></td>
			</tr>	
		</c:forEach>
	</table>
	<form action="/aula1/biblioteca" method="post">
		<p>Consulte um livro pelo isbn:</p>
		<input type="text" id="isbn" name="isbn"/>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>