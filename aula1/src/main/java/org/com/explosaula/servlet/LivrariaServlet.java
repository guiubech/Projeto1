package org.com.explosaula.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.explosaula.baen.ApresentacaoBean;

@WebServlet(urlPatterns = "/livraria",name="livraria")
public class LivrariaServlet extends HttpServlet {

	public String formattedDate;

	@Override
	public void doGet(HttpServletRequest resquest, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		ApresentacaoBean apresentacao = new ApresentacaoBean();
		out.println(apresentacao.menssagem());

		out.close();

	}

}
