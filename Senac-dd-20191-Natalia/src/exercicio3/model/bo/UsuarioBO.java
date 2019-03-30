package exercicio3.model.bo;

import exercicio3.model.dao.UsuarioDAO;
import exercicio3.model.vo.UsuarioVO;

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
		if (usuarioVO.getNivel() == null) {
			mensagem = "Erro ao salvar n�vel, digite um n�vel";
		} else {
			int statusPersistencia = usuarioDAO.salvarUsuarioDAO(usuarioVO);

			if (statusPersistencia == 1) {
				mensagem = "Usu�rio salvo com sucesso";
			} else if (statusPersistencia == 0) {
				mensagem = "Erro ao salvar usu�rio";
			}
		}
		return mensagem;
	}

	public void excluir(UsuarioVO usuarioVO) {

	}

	public String listar(UsuarioVO usuarioVO) {
		String mensagem = "";

		UsuarioDAO usuarioDAO = new UsuarioDAO();

		if (usuarioVO.getNome().length() < 3) {
			mensagem = "Erro ao listar nome, digite o nome todo";
		}
		if (usuarioVO.getEmail().split("@") == null) {
			mensagem = "Erro ao listar email, digite corretamente novamente";
		}
		if (usuarioVO.getSenha().length() < 6) {
			mensagem = "Erro ao listar senha, digite uma senha com mais de 6 caracteres";
		}
		if (usuarioVO.getNivel() == null) {
			mensagem = "Erro ao listar n�vel, digite um n�vel";
		} else {
			int statusPersistencia = usuarioDAO.salvarUsuarioDAO(usuarioVO);

			if (statusPersistencia == 1) {
				mensagem = "Usu�rio listado com sucesso";
			} else if (statusPersistencia == 0) {
				mensagem = "Erro ao listar usu�rio";
			}
		}
		return mensagem;
	}

}
