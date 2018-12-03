package br.com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/produto")
public class ProdutosController {
	
	//@Autowired
	//private ProdutoService produtoService;
	
	@GetMapping
	public ModelAndView carregaProdutos(ModelMap model) {
		//model.addAttribute("produtos", produtoService.retornaProdutos());
		return new ModelAndView("produto");
	}

}
