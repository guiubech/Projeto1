package dao;

import java.util.ArrayList;
import java.util.List;

import model.Produto;


public class ProdutoDaoImpl implements ProdutoDao {
	
	//@PersistenceContext
	//private EntityManager em;
	
	public List<Produto> retornaProdutos() {
		//TypedQuery<Produto> query = em.createQuery("from Produto", Produto.class);
		//return query.getResultList();
		List<Produto> listaProduto = new ArrayList<>(); 
		Produto produto = new Produto();
		produto.setId(1L);
		produto.setNome("Guilherme");
		listaProduto.add(produto);
		return listaProduto;
	}

	@Override
	public Produto consultarProduto(Long id) {
		//return em.find(Produto.class, id);
		Produto produto = new Produto();
		produto.setId(1L);
		produto.setNome("Guilherme");
		return produto;
	}

	@Override
	public List<Produto> retornaProduto() {
		// TODO Auto-generated method stub
		return null;
	}

}
