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




@WebServlet(urlPatterns = "/biblioteca")
public class BibliotecaServlet extends HttpServlet {
	
	public String formattedDate;
	
	@Override
	public void doGet(HttpServletRequest resquest, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		//HttpSession session = request.getSession();
		//session.setAttribute("login", "Guilherme");
		
		String msgHoras;
		SimpleDateFormat sdfHoraMinuto = new SimpleDateFormat("HH:mm");
		SimpleDateFormat sdfData = new SimpleDateFormat("dd-mm-yyyy");
		
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		
		String horaMinutoFormatado = sdfHoraMinuto.format(calendar.getTime());
		String dataFormatada = sdfData.format(calendar.getTime());
		
		if(hora > 18 && hora < 23) {
			out.print("A biblioteca está fechada");
		}else if (hora > 0 && hora < 7) {
			out.println("A biblioteca está fechada");
		}else {
			out.print("A loja está aberta");
		}
		
		out.close();
		
		
		
		
	}

}
