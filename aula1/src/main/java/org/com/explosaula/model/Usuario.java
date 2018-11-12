package org.com.explosaula.model;

import java.io.Serializable;

import javax.inject.Named;

@Named
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L; 
	
	private String nome;
	private String senha;
		
	public Usuario() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha () {
		return senha;
	}
	
	public void setSenha (String senha) {
		this.senha = senha;
	}

}
