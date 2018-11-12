package org.com.explosaula.dao.impl;

import org.com.explosaula.dao.BibliotecaDAO;
import org.com.explosaula.model.Biblioteca;

public class BibliotecaDAOImpl implements BibliotecaDAO {

	@Override
	public Biblioteca consultaBiblioteca() {
		return new Biblioteca();
	}

}
