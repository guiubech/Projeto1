<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form action="/aula2/login" method="post">
	<div>
		<label for="usuario">Email:</label>
		<input type="text" id="usuario" name="usuario"/>
	</div>
	<div>
		<label for="senha">Senha:</label>
		<input type="password" id="senha" name="senha"/>
	</div>
	<div class="button">
		<button type="submit">Submit</button>
	</div>
</form>
</body>
</html>