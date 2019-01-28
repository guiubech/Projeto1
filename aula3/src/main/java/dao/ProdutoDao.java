package dao;

import java.util.List;

import model.Produto;



public interface ProdutoDao {
	
	public List<Produto> retornaProdutos() ;
	public Produto consultarProduto(Long id);

}
