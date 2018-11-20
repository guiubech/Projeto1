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
	
	/**
	 * *
	 * 
     * doPost, Método que é redirecionado as requisições do cliente via verbo POST.
     * O método service da classe extendida HttpServlet recebe as requisições e 
     * redireciona para o método correto de acordo com o verbo utilizado.   
     *
     * @param req   Objeto usado para enviar as requisições ao servlet
     *                        
     * @param resp  Objeto usado para retonar headers para o cliente
     *
     * @throws IOException   Exception lançada caso ocorra algum erro no input ou output
     *
     * @throws ServletException  Exception lançada caso ocorra algum erro genérico na servlet
     * 
     */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String isbn = request.getParameter("isbn");
		Livro livro = livroBO.consultaLivro(isbn);
		request.setAttribute("livro", livro);
		request.getRequestDispatcher("/consultarLivro.jsp").forward(request, response);
	}

}
