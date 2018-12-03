package br.com.spring.model;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1l;
	
	@NotBlank
	@Size(min = 3, max = 50)
	private String login;
	@NotBlank
	private String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	

}
