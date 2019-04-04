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

	public String excluir(String idInformado, String email, String senha) {
		String mensagem = "";

		if (idInformado == null || idInformado.trim().isEmpty()) {
			mensagem = "Preenche o Id";
		}
		if (email == null || email.trim().isEmpty()) {
			mensagem = "Preenche o email";
		}
		if (senha == null || senha.trim().isEmpty()) {
			mensagem = "Preenche a senha";
		}
		if (mensagem.isEmpty()) {
			UsuarioVO usuarioNormal = new UsuarioVO();
			usuarioNormal.setId(Integer.parseInt(idInformado));

			UsuarioVO usuarioADM = new UsuarioVO();
			usuarioADM.setEmail(email);
			usuarioADM.setSenha(senha);

			UsuarioBO usuarioBO = new UsuarioBO();
			usuarioBO.excluir(usuarioNormal, usuarioADM);
		}
		return mensagem;
	}

	public ArrayList<UsuarioVO> listarPorNivel(NivelVO nivel) throws Exception {
		if (nivel == null) {
			throw new Exception("Selecione um nível");
		}
		UsuarioBO usuarioBO = new UsuarioBO();
		usuarioBO.listarPorNivel(nivel);
		return usuarioBO.listarPorNivel(nivel);
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
