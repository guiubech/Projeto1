package servicos;

import java.util.List;

import javax.jws.WebService;

import dao.ProdutoDao;
import dao.ProdutoDaoImpl;
import model.Produto;

@WebService(name = "Produto")
public class ProdutoServiceImpl implements ProdutoService {

	
	private ProdutoDao produtoDAO = new ProdutoDaoImpl();
	
	
	
	@Override
	public Produto consultarProduto(Long id) {
		return produtoDAO.consultarProduto(id);
	}
	
	@Override
	public List<Produto> retornaProduto() {
		// TODO Auto-generated method stub
		return null;
	}

}
