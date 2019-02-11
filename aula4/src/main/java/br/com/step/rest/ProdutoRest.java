package br.com.step.rest;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.com.step.rest.dao.ProdutoDAO;
import br.com.step.rest.model.ConsultaCep;
import br.com.step.rest.model.Produto;

@Path("/produto")
public class ProdutoRest {

	private static final String CHARSET_UTF8 = ";charset=utf8";
	@Inject
	private ProdutoDAO produtoDAO;

	
	//retorna todos
	@GET
	@Produces(MediaType.APPLICATION_JSON + CHARSET_UTF8)
	public List <Produto> listaProduto() {
		return produtoDAO.findAll();
	}
	
	//retorna por id
	@GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Produto findById(@PathParam("id") Long id) {
        return produtoDAO.findById(id);
    }
	
	//adiciona
	@POST
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.TEXT_PLAIN)
    public void persist(Produto produto) {
        produtoDAO.persist(produto);
    }
	
	//excluir
	@Path("/{id}")
	@DELETE
	@Consumes(MediaType.TEXT_PLAIN)
    public void remove(@PathParam("id") Long id) {
		System.out.println("passou aqui");
        produtoDAO.remove(id);
    }
	
	//editar
	@PUT
    @Consumes(MediaType.APPLICATION_JSON + CHARSET_UTF8)
    public void merge(Produto produto) {
        produtoDAO.merge(produto);
    }
	
	
	//retorna Cep
		@GET
		@Produces(MediaType.APPLICATION_JSON + CHARSET_UTF8)
		public List <ConsultaCep> listaConsultaCep() {
			return null;
		}
	

}
