package br.com.spring.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.spring.dao.UsuarioDao;
import br.com.spring.model.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Usuario> retornaUsuariosAtivos() {
		TypedQuery<Usuario> query = em.createQuery("FROM Usuario u WHERE u.isAtivo = true", Usuario.class);
		return query.getResultList();
	}
	
	@Override
	public List<Usuario> retornaUsuariosInativos() {
		TypedQuery<Usuario> query = em.createQuery("FROM Usuario u WHERE u.isAtivo = false", Usuario.class);
		return query.getResultList();
	}
	
	@Override
	public Usuario findByEmail(String email) {
		TypedQuery<Usuario> query = em.createQuery("FROM Usuario u WHERE u.email = :email", Usuario.class);
		query.setParameter("email", email);
		return query.getSingleResult();
	}

	@Override
	@Transactional
	public void atualizarUsuario(Usuario usuario) {
		em.merge(usuario);
	}

	@Override
	@Transactional
	public void salvarUsuario(Usuario usuario) {
		em.persist(usuario);
	}
	
	@Override
	public Usuario consultarId(Long id) {
		return em.find(Usuario.class, id);
	}

//	@Override
//	@Transactional
//	public void excluir(Usuario usuario) {
//		usuario = em.find(Usuario.class, usuario.getId());
//		em.remove(usuario);
//		
//	}
	@Override
	@Transactional
	public void desativar(Usuario usuario) {
		em.merge(usuario);
	}
	
	
}
