<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div>
			<table>
				<thead>
					<tr>
						<th>Código</th>
						<th>Nome</th>
						<th>Descrição</th>
						<th>Quantidade</th>
						<th>Custo unitário</th>
						<th>Preço de venda</th>
						<th>Data de cadastro</th>
					</tr>
				</thead>
				<tfoot>
					<tr>
						<th>Código</th>
						<th>Nome</th>
						<th>Descrição</th>
						<th>Quantidade</th>
						<th>Custo unitário</th>
						<th>Preço de venda</th>
						<th>Data de cadastro</th>
					</tr>
				</tfoot>
				<tbody>
					<c:forEach items="${produtos }" var="produto">
						<tr>
							<td>${produto.id }</td>
							<td>${produto.nome }</td>
							<td>${produto.descricao }</td>
							<td>${produto.quantidade }</td>
							<td>R$ ${produto.custoUnitario }</td>
							<td>R$ ${produto.precoVenda }</td>
							<td><f:formatDate value="${produto.dataCadastro }" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>