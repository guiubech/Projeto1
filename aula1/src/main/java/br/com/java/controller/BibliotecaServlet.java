package br.com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.explosaula.baen.ApresentacaoBean;




@WebServlet(urlPatterns = "/biblioteca")
public class BibliotecaServlet extends HttpServlet {
	
	public String formattedDate;
	
	@Override
	public void doGet(HttpServletRequest resquest, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		//HttpSession session = request.getSession();
		//session.setAttribute("login", "Guilherme");
		
		//ApresentacaoBean apresentacao = new ApresentacaoBean();
		//out.println(apresentacao.menssagem());
		
		out.close();
		
		
		
		
	}

}