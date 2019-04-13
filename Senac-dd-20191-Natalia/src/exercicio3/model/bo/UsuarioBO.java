package exercicio3.model.bo;

import exercicio3.model.dao.UsuarioDAO;
import exercicio3.model.vo.NivelVO;
import exercicio3.model.vo.UsuarioVO;
import java.util.ArrayList;

public class UsuarioBO {

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

	public ArrayList<UsuarioVO> listarPorNivel(NivelVO nivel) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.listarPorNivel(nivel);
	}

	public String excluir(UsuarioVO usuarioVO, UsuarioVO usuarioADM) {
		String mensagem = "";
		UsuarioDAO usuarioDAO = new UsuarioDAO();

		if (usuarioDAO.existeRegistroADM(usuarioADM) == false) {
			mensagem = "Usu�rio Admin de e-mail e senha inexistente";
		} else {
			int statusPersistencia = usuarioDAO.excluir(usuarioVO);

			if (statusPersistencia == 1) {
				mensagem = "Usu�rio excluido com sucesso";
			} else if (statusPersistencia == 0) {
				mensagem = "Erro ao excluir usu�rio";
			}
		}
		return mensagem;
	}

	public String salvar(String nome, String email, String senhaTentativa, NivelVO nivel) {
		String mensagem = "";

		if (nome.length() < 3) {
			mensagem = "Nome inv�lido. M�nimo de 3 caracteres";
		} else if (!emailCorreto(email)) {
			mensagem = "Email inv�lido. Somente um '@'";
		} else if (senhaTentativa.length() < 6) {
			mensagem = "Senha inv�lida. M�nimo de 6 caracteres";
		} else if (nivel == null) {
			mensagem = "Nivel inv�lido";
		} else if (mensagem.isEmpty()) {
			UsuarioVO usuario = new UsuarioVO();
			usuario.setNome(nome);
			usuario.setEmail(email);
			usuario.setSenha(senhaTentativa);
			usuario.setNivelVO(nivel);

			UsuarioDAO usuarioDAO = new UsuarioDAO();
			int statusPersistencia = usuarioDAO.salvarUsuarioDAO(usuario);

			if (statusPersistencia >= 1) {
				mensagem = "Usuario salvo com sucesso";
			} else {
				mensagem = "Erro ao salvar usuario";
			}
		}
		return mensagem;

	}

	private boolean emailCorreto(String email) {
		boolean emailCorreto = false;
		String[] partes = email.split("@");
		if (partes.length == 2) {
			emailCorreto = true;
		}
		return emailCorreto;
	}
}