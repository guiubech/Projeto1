package org.com.explosaula.dao.impl;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.com.explosaula.dao.LivroDAO;
import org.com.explosaula.model.Livro;

public class LivroDAOImpl implements LivroDAO {
	
	@Inject
    private EntityManager em;
	
	@Override
	public Livro consultaLivro(String isbn) {
		String sql = " SELECT * FROM livro where isbn = :isbn ";
		Query query = em.createNativeQuery(sql);
		query.setParameter("isbn", isbn);
		List<Object[]> resultado = query.getResultList();
		Iterator<Object[]> itr = resultado.iterator();
		Livro livro = new Livro();
		while (itr.hasNext()) {
			Object[] obj = (Object[]) itr.next();
			livro.setId((int) obj[0]);
			livro.setTitulo((String) obj[1]);
			livro.setIsbn((String) obj[2]);
			livro.setIdioma((String) obj[3]);
		}
		return livro;
	}

	@Override
	public void inserirLivro(Livro livro) {
		em.getTransaction().begin();
		
		String sql = " INSERT INTO livro (titulo, isbn, idioma) VALUES (:titulo, :isbn, :idioma) ";
		Query query = em.createNativeQuery(sql);
		query.setParameter("titulo", livro.getTitulo());
		query.setParameter("isbn", livro.getIsbn());
		query.setParameter("idioma", livro.getIdioma());
		query.executeUpdate();
		
		em.getTransaction().commit();
	}

	@Override
	public void removerLivro(Livro livro) {
		em.getTransaction().begin();
		
		String sql = " DELETE FROM livro WHERE isbn = :isbn ";
		Query query = em.createNativeQuery(sql);
		query.setParameter("isbn", livro.getIsbn());
		query.executeUpdate();
		
		em.getTransaction().commit();
	}

}
