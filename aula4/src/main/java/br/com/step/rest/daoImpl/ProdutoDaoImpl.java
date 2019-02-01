package br.com.step.rest.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.step.rest.dao.ProdutoDAO;
import br.com.step.rest.model.Produto;


public class ProdutoDaoImpl implements ProdutoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Produto consultaProduto(Long id) {
		return em.find(Produto.class, id);
	}
	
	public List<Produto> listaProduto() {
		TypedQuery<Produto> query = em.createQuery("SELECT p FROM Produto p",Produto.class);
		return query.getResultList();
	}

}
