package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

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

}
