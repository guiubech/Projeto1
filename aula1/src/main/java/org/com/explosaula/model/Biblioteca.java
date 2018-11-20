package org.com.explosaula.model;

import java.util.ArrayList;
import java.util.List;



/**
 * Não havendo um arquivo beans.xml para explicitamente ligar o suporte a CDI,
 * para que uma classe possa ser injetada usando @Inject, ela deve declarar
 * algum escopo CDI (ex: @RequestScoped). @Named registra um nome necessário
 * caso a classe seja acessada via JSTL (ex: em arquivos XHTML). O nome
 * registrado por default é o nome da classe, com a primeira letra minúscula (ou
 * sem alterações, se começar com duas letras maiúsculas).
 */
public class Biblioteca {

    List<Livro> livros = new ArrayList<>();

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
    
    
}

