package exercicio7.controller;

import java.util.List;

import exercicio7.model.bo.ProdutoBO;
import exercicio7.model.seletor.ProdutoSeletor;
import exercicio7.model.vo.Produto;

public class ProdutoController {

	public static final String TIPO_RELATORIO_XLS = "xls";
	public static final String TIPO_RELATORIO_PDF = "pdf";

	private ProdutoBO produtoBO = new ProdutoBO();

	public List<Produto> listarTodosProdutos() {
		return produtoBO.listarProdutos();
	}

	public List<Produto> listarProdutosAtePreco(double maximo) {
		return produtoBO.listarProdutosPorFaixaDePreco(maximo);
	}

	public String salvar(Produto produto) {
		String validacao = validarProduto(produto);

		if (validacao == "") {
			if (produto.getId() > 0) {
				if (produtoBO.atualizar(produto)) {
					validacao = "Produto atualizado com sucesso!";
				} else {
					validacao = "Erro ao atualizar produto";
				}
			} else {
				if (produtoBO.inserir(produto)) {
					validacao = "Produto salvo com sucesso!";
				} else {
					validacao = "Erro ao salvar produto";
				}
			}
		}

		return validacao;
	}

	private String validarProduto(Produto produto) {
		String validacao = "";

		if (produto == null) {
			validacao = "- Produto está NULO!";
		} else {
			if (produto.getNome().trim().equals("")) {
				validacao += "- Nome é obrigatório \n";
			}
			if (produto.getFabricante().trim().equals("")) {
				validacao += "- Fabricante é obrigatório \n";
			}
		}
		return validacao;
	}

	public void gerarRelatorio(List<Produto> produtos, String caminhoEscolhido, String tipoRelatorio) {
		if (tipoRelatorio.equals(TIPO_RELATORIO_XLS)) {
			produtoBO.gerarPlanilha(produtos, caminhoEscolhido);
		}
	}

	public List<Produto> listarProdutos(ProdutoSeletor seletor) {
		return produtoBO.listarProdutos(seletor);
	}
	
	public int contarProdutos(ProdutoSeletor seletor) {
		return produtoBO.contarProdutos(seletor);
	}
}