package br.com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/biblioteca",loadOnStartup = 1)
public class BibliotecaController extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		
		System.out.println("iniciando Servlet");
		super.init();
	}
	
	@Override
	public void destroy() {
		
		System.out.println("Fim do Servlet");
		super.destroy();
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello!");
		out.close();
	}
	

}
