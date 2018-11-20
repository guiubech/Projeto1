package org.com.explosaula.bo;

import org.com.explosaula.model.Livro;

public interface LivroBO {
	Livro consultaLivro(String isbn);
	void inserirLivro(Livro livro);
	void removerLivro(Livro livro);

}
