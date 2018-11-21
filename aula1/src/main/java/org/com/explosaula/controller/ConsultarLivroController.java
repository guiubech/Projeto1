package org.com.explosaula.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.explosaula.bo.LivroBO;
import org.com.explosaula.model.Livro;



@WebServlet(name = "consultarLivro",urlPatterns = { "/consultarLivro" })
public class ConsultarLivroController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private LivroBO livroBO;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/consultarLivro.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String isbn = request.getParameter("isbn");
		Livro livro = livroBO.consultaLivro(isbn);
		request.setAttribute("livro", livro);
		request.getRequestDispatcher("/consultarLivro.jsp").forward(request, response);
	}

}
