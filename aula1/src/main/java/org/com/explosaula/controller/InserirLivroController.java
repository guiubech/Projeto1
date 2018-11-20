package org.com.explosaula.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.com.explosaula.bo.LivroBO;
import org.com.explosaula.model.Livro;



@WebServlet(name = "inserirLivro",urlPatterns = { "/inserirLivro" })
public class InserirLivroController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private LivroBO livroBO;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/inserirLivro.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Livro livro = new Livro();
		livro.setIdioma(req.getParameter("idioma"));
		livro.setIsbn(req.getParameter("isbn"));
		livro.setTitulo(req.getParameter("titulo"));
		if(validarLivro(livro)) {
			livroBO.inserirLivro(livro);
			req.setAttribute("msgSucesso", "Livro inserido com sucesso.");
		} else {
			req.setAttribute("msgErro", "Favor, informe todos os campos.");
		}
		req.getRequestDispatcher("/inserirLivro.jsp").forward(req, resp);
	}

	private boolean validarLivro(Livro livro) {
		boolean retorno = false;
		if (StringUtils.isNotBlank(livro.getIdioma()) 
				&& StringUtils.isNotBlank(livro.getIsbn()) 
				&& StringUtils.isNotBlank(livro.getTitulo())) {
			retorno = true;
		}
		return retorno;
	}

}
