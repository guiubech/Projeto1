<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livro</title>
</head>
<body>
	<h1>Livro consultado:</h1>
	<table border="1">
		<tr>
			<td>Isbn</td>
			<td>Titulo</td>
			<td>Idioma</td>
		</tr>
		<tr>
			<td><c:out value="${livro.isbn}"/></td>
			<td><c:out value="${livro.titulo}"/></td>
			<td><c:out value="${livro.idioma}"/></td>
		</tr>
	</table>
	<a href="biblioteca">Voltar</a>
</body>
</html>