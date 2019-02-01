package br.com.step.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.step.rest.dao.ProdutoDAO;
import br.com.step.rest.model.Produto;

@Path("/produto")
public class ProdutoRest {

	private static final String CHARSET_UTF8 = ";charset=utf8";
	@Inject
	private ProdutoDAO produtoDAO;

	@GET
	@Path("/nome")
	//@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON + CHARSET_UTF8)
	public List <Produto> listaProduto() {
		return produtoDAO.listaProduto();
	}

}
