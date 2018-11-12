package org.com.explosaula.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.explosaula.bo.BibliotecaBO;
import org.com.explosaula.bo.LivroBO;
import org.com.explosaula.bo.impl.BibliotecaBOImpl;
import org.com.explosaula.bo.impl.LivroBOImpl;
import org.com.explosaula.model.Biblioteca;
import org.com.explosaula.model.Livro;



@WebServlet(name = "biblioteca", urlPatterns = "/biblioteca")
public class BibliotecaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private BibliotecaBO bibliotecaBO = new BibliotecaBOImpl();
	private LivroBO livroBO = new LivroBOImpl();
	
	/**
	 * *
	 * 
     * doGet, Método que é redirecionado as requisições do cliente via verbo GET.
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
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Biblioteca biblioteca = bibliotecaBO.consultaBiblioteca();
		request.setAttribute("livros", biblioteca.getLivros());
		request.getRequestDispatcher("/biblioteca.jsp").forward(request, response);
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
		request.getRequestDispatcher("/livro.jsp").forward(request, response);
	}

}

