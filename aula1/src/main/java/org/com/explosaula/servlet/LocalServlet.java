package org.com.explosaula.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/local")
public class LocalServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

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
		response.setContentType("text/html");
        response.setBufferSize(8192);
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>"
                      + "<head><title>Exercício 1 Servlet</title></head>");
            out.println("<body>"
	                    + "<form action=\"/Projeto1/local\" method=\"post\">"
		                    + "<h2>Olá, onde você se encontra no momento ?</h2>"
		                    + "<input title=\"Estou: \" type=\"text\" "
		                    + "name=\"local\" size=\"25\"/>"
		                    + "<p></p>"
		                    + "<input type=\"submit\" value=\"Submit\"/>"
		                    + "<input type=\"reset\" value=\"Reset\"/>"
	                    + "</form>"
                     + "</body></html>");
        }
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
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {
			String local = request.getParameter("local");
			out.println("<html>");
			if(local.toUpperCase().contains("CASA")) {
				out.println("<head><title>Achamos você !</title></head>");
				out.println("<body>");
				out.println("<h1>Achamos você !</h1>");
				out.println("<img src=\"resources/images/casa.png\" alt=\"casa\">");
				out.println("</body>");
			} else if (local.toUpperCase().contains("TRABALHO")) {
				out.println("<head><title>Achamos você !</title></head>");
				out.println("<body>");
				out.println("<h1>Achamos você !</h1>");
				out.println("<img src=\"resources/images/trabalho.png\" alt=\"trabalho\">");
				out.println("</body>");
			} else if (local.toUpperCase().contains("STEP")
					|| local.toUpperCase().contains("CURSO")) {
				out.println("<head><title>Achamos você !</title></head>");
				out.println("<body>");
				out.println("<h1>Achamos você !</h1>");
				out.println("<img src=\"resources/images/step.png\" alt=\"step\">");
				out.println("</body>");
			} else {
				out.println("<head><title>Achamos você !</title></head>");
				out.println("<body>");
				out.println("<h1>Achamos você !</h1>");
				out.println("<img src=\"resources/images/mundo.jpg\" alt=\"mundo\">");
				out.println("</body>");
			}
			out.println("</html>");
        }
	}
}
