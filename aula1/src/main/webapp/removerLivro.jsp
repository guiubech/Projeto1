<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livro</title>
</head>
<body>
	<form action="/aula1/removerLivro" method="post">
		<p><c:out value="${msgErro}"/></p>
		<p><c:out value="${msgSucesso}"/></p>
		<p>Remover livro:</p>
		<p>Para remover um livro, informe seu isbn.</p>
		<div>
	        <label for="isbn">Isbn:</label>
	        <input type="text" id="isbn" name="isbn"/>
	    </div>
		<input type="submit" value="Enviar">
		
		<div>
			<a href="biblioteca">Voltar</a>
		</div>
	</form>
</body>
</html>