package org.com.explosaula.dao.impl;

import org.com.explosaula.dao.LivroDAO;
import org.com.explosaula.model.Biblioteca;
import org.com.explosaula.model.Livro;

public class LivroDAOImpl implements LivroDAO {

	@Override
	public Livro consultaLivro(String isbn) {
		Biblioteca biblioteca = new Biblioteca();
		return biblioteca.getLivro(isbn);
	}

}
