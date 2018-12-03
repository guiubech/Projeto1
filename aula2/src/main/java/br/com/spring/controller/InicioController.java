package br.com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.spring.model.Usuario;

@Controller
@RequestMapping(value = "/")
public class InicioController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView inicio(@ModelAttribute("usuario") Usuario usuario) {
		ModelAndView model = new ModelAndView("login");
		return model;
	}

}
