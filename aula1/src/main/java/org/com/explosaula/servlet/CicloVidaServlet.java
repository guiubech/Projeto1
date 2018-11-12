package org.com.explosaula.servlet;

import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;



@WebServlet("/cicloDeVida")
public class CicloVidaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(CicloVidaServlet.class.getCanonicalName());
	/**
	 * *
	 * init, Método que é chamado quando se inicia o ciclo de vida do servlet
     *
     * @throws ServletException  Exception lançada caso ocorra algum erro genérico na servlet
     * 
     */
	@Override
	public void init() throws ServletException {
		getServletContext().setAttribute("contexto", "contexto");
		logger.info("Aqui se inicia o ciclo de vida do Servlet.");
		super.init();
	}
	
	/**
	 * *
	 * init, Método que é chamado quando finaliza o ciclo de vida do servlet
     *
     * @throws ServletException  Exception lançada caso ocorra algum erro genérico na servlet
     * 
     */
	@Override
	public void destroy() {
		logger.info("Fim do ciclo de vida do Servlet.");
		super.destroy();
    }
}