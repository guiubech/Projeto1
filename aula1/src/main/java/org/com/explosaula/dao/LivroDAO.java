package org.com.explosaula.dao;

import org.com.explosaula.model.Livro;

public interface LivroDAO {

	Livro consultaLivro(String isbn);
}
