package org.com.explosaula.bo.impl;


import javax.inject.Inject;

import org.com.explosaula.bo.LivroBO;
import org.com.explosaula.dao.LivroDAO;
import org.com.explosaula.model.Livro;

public class LivroBOImpl implements LivroBO {

	//private LivroDAO livroDAO = new LivroDAOImpl();
	
	@Inject
	private LivroDAO livroDAO;
	
	@Override
	public Livro consultaLivro(String isbn) {
		return livroDAO.consultaLivro(isbn);
	}

}
