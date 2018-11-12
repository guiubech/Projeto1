package org.com.explosaula.bo.impl;

import org.com.explosaula.bo.BibliotecaBO;
import org.com.explosaula.dao.BibliotecaDAO;
import org.com.explosaula.dao.impl.BibliotecaDAOImpl;
import org.com.explosaula.model.Biblioteca;

public class BibliotecaBOImpl implements BibliotecaBO {

	private BibliotecaDAO bibliotecaDAO = new BibliotecaDAOImpl();
	
	@Override
	public Biblioteca consultaBiblioteca() {
		return bibliotecaDAO.consultaBiblioteca();
	}
}
