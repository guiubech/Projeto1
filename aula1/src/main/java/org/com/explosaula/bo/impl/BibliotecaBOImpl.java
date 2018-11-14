package org.com.explosaula.bo.impl;

import javax.inject.Inject;

import org.com.explosaula.bo.BibliotecaBO;
import org.com.explosaula.dao.BibliotecaDAO;
import org.com.explosaula.model.Biblioteca;

public class BibliotecaBOImpl implements BibliotecaBO {

	//private BibliotecaDAO bibliotecaDAO = new BibliotecaDAOImpl();
	
	@Inject
	private BibliotecaDAO bibliotecaDAO;
	
	@Override
	public Biblioteca consultaBiblioteca() {
		return bibliotecaDAO.consultaBiblioteca();
	}
}
