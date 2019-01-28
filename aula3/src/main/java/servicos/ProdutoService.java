package servicos;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import model.Produto;
@WebService
@SOAPBinding(style = Style.RPC)
public interface ProdutoService {
	@WebMethod(operationName = "retornaProduto")
	public @WebResult(name="listaProduto") List<Produto> retornaProduto();
	@WebMethod(operationName = "consultaProduto")
	public @WebResult(name="produto") Produto consultarProduto(@WebParam(name = "id") Long id);
	
	
}
