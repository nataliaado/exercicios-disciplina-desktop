package exercicio3.model.bo;

import exercicio3.model.dao.UsuarioDAO;
import exercicio3.model.vo.UsuarioVO;
import java.util.ArrayList;

public class UsuarioBO {

	public String salvar(UsuarioVO usuarioVO) {
		String mensagem = "";

		UsuarioDAO usuarioDAO = new UsuarioDAO();

		if (usuarioVO.getNome().length() < 3) {
			mensagem = "Erro ao salvar nome, digite o nome todo";
		}
		if (usuarioVO.getEmail().split("@") == null) {
			mensagem = "Erro ao salvar email, digite corretamente novamente";
		}
		if (usuarioVO.getSenha().length() < 6) {
			mensagem = "Erro ao salvar senha, digite uma senha com mais de 6 caracteres";
		}
		if (usuarioVO.getNivelVO() == null) {
			mensagem = "Erro ao salvar n�vel, digite um n�vel";
		}
		if (mensagem.isEmpty()) {
			int statusPersistencia = usuarioDAO.salvarUsuarioDAO(usuarioVO);

			if (statusPersistencia == 1) {
				mensagem = "Usu�rio salvo com sucesso";
			} else if (statusPersistencia == 0) {
				mensagem = "Erro ao salvar usu�rio";
			}
		}
		return mensagem;
	}

	public String excluir(UsuarioVO usuarioVO) {
		String mensagem = "";

		UsuarioDAO usuarioDAO = new UsuarioDAO();

		if (usuarioVO.getId() == 0) {
			mensagem = "Erro ao excluir usu�rio, digite o id novamente";
		}
		if (mensagem.isEmpty()) {
			int statusPersistencia = usuarioDAO.salvarUsuarioDAO(usuarioVO);

			if (statusPersistencia == 1) {
				mensagem = "Usu�rio excluido com sucesso";
			} else if (statusPersistencia == 0) {
				mensagem = "Erro ao excluir usu�rio";
			}
		}
		return mensagem;
	}

	public String listarPorNivel(UsuarioVO usuarioVO) {
		String mensagem = "";

		UsuarioDAO usuarioDAO = new UsuarioDAO();

		if (usuarioVO.getNivelVO() == null) {
			mensagem = "Erro ao listar n�vel, digite um n�vel";
		}
		if (mensagem.isEmpty()) {
			int statusPersistencia = usuarioDAO.salvarUsuarioDAO(usuarioVO);

			if (statusPersistencia == 1) {
				mensagem = "Usu�rio listado com sucesso";
			} else if (statusPersistencia == 0) {
				mensagem = "Erro ao listar usu�rio";
			}
		}
		return mensagem;
	}

	public ArrayList<UsuarioVO> listarTodos() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.listarTodos();
	}

	public UsuarioVO listarPorNome(String nome) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.listarPorNome(nome);
	}
}
