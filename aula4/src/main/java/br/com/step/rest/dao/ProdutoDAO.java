package br.com.step.rest.dao;

import java.util.List;

import br.com.step.rest.model.Produto;

public interface ProdutoDAO {
	
	
	
	Produto findById(Long id);
	
	void merge(Produto produto);
	
	void remove(Long id);
	
	void persist(Produto produto);
	
	public List<Produto> findAll(); 

}
