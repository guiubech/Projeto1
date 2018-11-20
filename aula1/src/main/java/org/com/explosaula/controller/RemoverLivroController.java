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



@WebServlet(name = "removerLivro",urlPatterns = { "/removerLivro" })
public class RemoverLivroController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private LivroBO livroBO;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/removerLivro.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Livro livro = livroBO.consultaLivro(req.getParameter("isbn"));
		if(validarLivro(livro)) {
			livroBO.removerLivro(livro);
			req.setAttribute("msgSucesso", "Livro removido com sucesso.");
		} else {
			req.setAttribute("msgErro", "O Isbn informado não consta em nossa base de dados.");
		}
		req.getRequestDispatcher("/removerLivro.jsp").forward(req, resp);
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
