package br.com.spring.service;

import java.util.List;

import br.com.spring.model.Usuario;

public interface UsuarioService {

	Usuario findUserByEmail(String userName);
	void registrarUltimoLogin(Usuario user);
	void salvarUsuario(Usuario usuario);
	List<Usuario> retornaUsuariosAtivos();
	List<Usuario> retornaUsuariosInativos();
	Usuario consultarId (Long id);
	void editar(Usuario usuario);
	//void excluir(Long id);
	void desativar(Usuario usuario);
	
}
