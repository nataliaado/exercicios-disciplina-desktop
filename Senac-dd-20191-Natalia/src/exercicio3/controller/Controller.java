package exercicio3.controller;

import exercicio3.model.bo.UsuarioBO;
import exercicio3.model.vo.NivelVO;
import exercicio3.model.vo.UsuarioVO;
import java.util.ArrayList;

public class Controller {

	public String salvar(String nome, String email, NivelVO nivel, String senhaTentativa, String senhaConfirma) {
		String mensagem = "";

		if (nome == null || nome.trim().isEmpty()) {
			mensagem = "Preenche o nome";
		}
		if (email == null || email.trim().isEmpty()) {
			mensagem = "Preenche o email";
		}
		if (nivel == null) {
			mensagem = "Preenche o nivel";
		}
		if (senhaTentativa == null || senhaTentativa.trim().isEmpty()) {
			mensagem = "Preenche a senha";
		}
		if (senhaConfirma == null || senhaConfirma.trim().isEmpty()) {
			mensagem = "Preenche a senha de Confirmação";
		}
		if (senhaTentativa != senhaConfirma) {
			mensagem = "Senha incorreta, digite novamente";
		}
		if (mensagem.isEmpty()) {
			UsuarioVO usuarioVO = new UsuarioVO();
			usuarioVO.setNome(nome);
			usuarioVO.setEmail(email);
			usuarioVO.setNivelVO(nivel);
			usuarioVO.setSenha(senhaTentativa);

			UsuarioBO usuarioBO = new UsuarioBO();
			usuarioBO.salvar(usuarioVO);
		}
		return mensagem;
	}

	public String excluir(int idInformado, String email, String senha) {
		String mensagem = "";

		if (idInformado == 0) {
			mensagem = "Preenche o Id";
		}
		if (email == null || email.trim().isEmpty()) {
			mensagem = "Preenche o email";
		}
		if (senha == null || senha.trim().isEmpty()) {
			mensagem = "Preenche a senha";
		}

		if (mensagem.isEmpty()) {
			UsuarioVO usuarioVO = new UsuarioVO();
			usuarioVO.setId(idInformado);

			UsuarioBO usuarioBO = new UsuarioBO();
			usuarioBO.excluir(usuarioVO);
		}
		return mensagem;
	}

	public String listarPorNivel(NivelVO nivel) {
		String mensagem = "";

		if (nivel == null) {
			mensagem = "Preenche o nivel";
		}
		if (mensagem.isEmpty()) {
			UsuarioVO usuarioVO = new UsuarioVO();
			usuarioVO.setNivelVO(nivel);

			UsuarioBO usuarioBO = new UsuarioBO();
			usuarioBO.listarPorNivel(usuarioVO);
		}
		return mensagem;
	}

	public UsuarioVO listarPorNome(String nome) throws Exception {
		if (nome == null) {
			throw new Exception("Selecione um usuário");
		}
		UsuarioBO usuarioBO = new UsuarioBO();
		usuarioBO.listarPorNome(nome);
		return usuarioBO.listarPorNome(nome);
	}

	public ArrayList<UsuarioVO> listarTodos() {
		UsuarioBO usuarioBO = new UsuarioBO();
		return usuarioBO.listarTodos();
	}
}
