package br.com.spring.service;

import java.util.List;

import br.com.spring.model.Produto;

public interface ProdutoService {
	public List<Produto> retornaProdutos();
	public Produto consultarProduto(Long id);
	public void editar(Produto produto);	
	public void salvar(Produto produto);
	public void excluir(Long id);

}
