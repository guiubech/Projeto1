package br.com.step.jsf.bean;

public class Hora {
	
	private static String dia = "Bom Dia ";
	private static String tarde = "Boa Tarde ";
	private static String Noite = "Boa Noite";
	
	
	public static String getDia() {
		return dia;
	}
	public static void setDia(String dia) {
		Hora.dia = dia;
	}
	public static String getTarde() {
		return tarde;
	}
	public static void setTarde(String tarde) {
		Hora.tarde = tarde;
	}
	public static String getNoite() {
		return Noite;
	}
	public static void setNoite(String noite) {
		Noite = noite;
	}

}
