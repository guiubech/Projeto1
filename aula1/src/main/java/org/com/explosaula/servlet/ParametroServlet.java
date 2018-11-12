package org.com.explosaula.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/parametro",
initParams = @WebInitParam(name = "Projeto", value = "Java avançado !"))
public class ParametroServlet extends HttpServlet {

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
response.setContentType("text/html; charset=UTF-8");
try (PrintWriter out = response.getWriter()){
	out.println("<p>Parâmetro de inicialização: " + getInitParameter("Projeto") + "</p>");
    out.println("<p>Parâmetro de url: " + request.getParameter("Nome") + "</p>");
    out.println("<p>Parâmetro no contexto: " + getServletContext().getAttribute("contexto") + "</p>");
}
}
}

