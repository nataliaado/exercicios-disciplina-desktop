package exercicio7.model.bo;

import java.util.ArrayList;
import java.util.List;

import exercicio7.model.dao.ProdutoDAO;
import exercicio7.model.seletor.ProdutoSeletor;
import exercicio7.model.vo.Produto;

public class ProdutoBO {

	ProdutoDAO produtoDAO = new ProdutoDAO();

	public boolean inserir(Produto produto) {
		int idGerado = produtoDAO.inserir(produto);
		return idGerado > 0;
	}

	public exercicio7.model.vo.Produto buscarProdutoPorId(String textoId) {
		Produto produtoBuscar = produtoDAO.obterPorId(Integer.parseInt(textoId));
		return produtoBuscar;
	}

	public boolean atualizar(Produto produto) {
		boolean sucesso = produtoDAO.atualizar(produto);
		return sucesso;
	}

	public List<Produto> listarProdutos() {
		ArrayList<Produto> produtos = produtoDAO.listarTodos();
		return produtos;
	}

	public List<Produto> listarProdutosPorFaixaDePreco(double precoMax) {
		ArrayList<Produto> produtos = produtoDAO.listarPorFaixaDePreco(precoMax);
		return produtos;
	}

	public void gerarPlanilha(List<Produto> produtos, String caminhoEscolhido) {
		// TODO
	}

	public List<Produto> listarProdutos(ProdutoSeletor seletor) {
		return produtoDAO.listarComSeletor(seletor);
	}
	
	public int contarProdutos(ProdutoSeletor seletor) {
		return produtoDAO.ContarComSeletor(seletor);
	}
}