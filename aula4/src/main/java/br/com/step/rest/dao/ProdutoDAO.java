package br.com.step.rest.dao;

import java.util.List;

import br.com.step.rest.model.Produto;

public interface ProdutoDAO {
	
	Produto consultaProduto(Long id);
	
	public List<Produto> listaProduto(); 

}
