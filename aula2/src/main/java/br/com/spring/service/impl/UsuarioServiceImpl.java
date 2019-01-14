package br.com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.spring.dao.UsuarioDao;
import br.com.spring.model.Usuario;
import br.com.spring.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
    public Usuario findUserByEmail(String email) {
		return usuarioDao.findByEmail(email);
	}
	
	@Override
	public void salvarUsuario(Usuario usuario) {
		String passwordHash = new BCryptPasswordEncoder().encode(usuario.getPassword());
		usuario.setPassword(passwordHash);
		usuarioDao.salvarUsuario(usuario);
	}

	@Override
	public void registrarUltimoLogin(Usuario user) {
		usuarioDao.atualizarUsuario(user);
	}

	@Override
	public List<Usuario> retornaUsuariosAtivos() {
		return usuarioDao.retornaUsuariosAtivos();
	}
	
	@Override
	public List<Usuario> retornaUsuariosInativos() {
		return usuarioDao.retornaUsuariosInativos();
	}
	
	@Override
	public Usuario consultarId(Long id) {
		return usuarioDao.consultarId(id);
	}
	
	@Override
	public void editar(Usuario usuario) {
		usuarioDao.atualizarUsuario(usuario);
	}
	
//	@Override
//	public void excluir(Long id) {
//		Usuario usuario = usuarioDao.consultarId(id);
//		usuarioDao.excluir(usuario);
//	}
	
	@Override
	public void desativar(Usuario usuario) {
		usuario.setIsAtivo(false);
		usuarioDao.desativar(usuario);
	}
	
}
