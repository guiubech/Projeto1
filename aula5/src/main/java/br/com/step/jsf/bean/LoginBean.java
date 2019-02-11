package br.com.step.jsf.bean;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginBean {

	private Login login = new Login();
	
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String efetuarLogin() {
		if (login.getName().equals("Guilherme") && login.getPassword().equals("gui080389")) {
			System.out.println("passou aqui 1");
			return "login-sucesful";
		}
		System.out.println("passou aqui 2");
		return "erro de login";
	}

}
