package br.com.step.rest.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import br.com.step.rest.dao.ProdutoDAO;
import br.com.step.rest.model.Produto;


public class ProdutoDaoImpl implements ProdutoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
    @Override
    public void persist(Produto produto) {
        em.persist(produto);

    }

    @Transactional
    @Override
    public List<Produto> findAll() {
        TypedQuery<Produto> query = em.createQuery("from Produto", Produto.class);
        return query.getResultList();

    }

    @Transactional
    @Override
    public Produto findById(Long id) {
        return em.find(Produto.class, id);

    }

    @Transactional
    @Override
    public void merge(Produto produto) {
        em.merge(produto);
    }

    @Transactional
    @Override
    public void remove(Long id) {
        em.remove(em.getReference(Produto.class, id));
    }


}
