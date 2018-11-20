<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livro</title>
</head>
<body>
	<form action="/aula1/inserirLivro" method="post">
		<p><c:out value="${msgErro}"/></p>
		<p><c:out value="${msgSucesso}"/></p>
		<p>Insira livro:</p>
		
		<div>
	        <label for="titulo">Título:</label>
	        <input type="text" id="titulo" name="titulo"/>
	    </div>
	    <div>
	        <label for="isbn">Isbn:</label>
	        <input type="text" id="isbn" name="isbn"/>
	    </div>
		<div>
	        <label for="idioma">Idioma:</label>
	        <input type="text" id="idioma" name="idioma"/>
	    </div>
		<input type="submit" value="Enviar">
		
		<div>
			<a href="biblioteca">Voltar</a>
		</div>
	</form>
</body>
</html>