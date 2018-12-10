package br.com.spring.service;

import java.util.List;

import br.com.spring.model.Usuario;

public interface UsuarioService {

	Usuario findUserByEmail(String userName);
	void registrarUltimoLogin(Usuario user);
	void salvarUsuario(Usuario usuario);
	List<Usuario> retornaUsuarios();
}
