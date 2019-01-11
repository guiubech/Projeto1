package br.com.spring.dao;

import java.util.List;

import br.com.spring.model.Usuario;

public interface UsuarioDao {

	Usuario findByEmail(String email);
	void atualizarUsuario(Usuario usuario);
	void salvarUsuario(Usuario usuario);
	List<Usuario> retornaUsuarios();
	Usuario consultarId(Long id);
	//void excluir(Usuario usuario);
	void desativar(Usuario usuario);
	
}