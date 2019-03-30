package exercicio3.controller;

import exercicio3.model.bo.UsuarioBO;
import exercicio3.model.vo.UsuarioVO;

public class Controller {

	public String salvar(String nome, String email, String nivel, String senhaTentativa, String senhaConfirma) {
		String mensagem = "";

		if (nome == null || nome.trim().isEmpty()) {
			mensagem = "Preenche o nome";
		}
		if (email == null || email.trim().isEmpty()) {
			mensagem = "Preenche o email";
		}
		if (nivel == null || nivel.trim().isEmpty()) {
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
			usuarioVO.setNivel(nivel);
			usuarioVO.setSenha(senhaTentativa);

			UsuarioBO usuarioBO = new UsuarioBO();
			usuarioBO.salvar(usuarioVO);
		}
		return mensagem;
	}

	public String excluir(int idInformado, String email, String senha, String nivel) {
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
		if (nivel == null || nivel.trim().isEmpty()) {
			mensagem = "Preenche o nivel";
		}
		if (mensagem.isEmpty()) {
			UsuarioVO usuarioVO = new UsuarioVO();
			usuarioVO.setId(idInformado);

			UsuarioBO usuarioBO = new UsuarioBO();
			usuarioBO.excluir(usuarioVO);
		}
		return mensagem;
	}

	public String listar(String nome, String email, String nivel, String senha) {

		String mensagem = "";

		if (nome == null || nome.trim().isEmpty()) {
			mensagem = "Preenche o nome";
		}
		if (email == null || email.trim().isEmpty()) {
			mensagem = "Preenche o email";
		}
		if (nivel == null || nivel.trim().isEmpty()) {
			mensagem = "Preenche o nivel";
		}
		if (senha == null || senha.trim().isEmpty()) {
			mensagem = "Preenche a senha";
		}
		if (mensagem.isEmpty()) {
			
			UsuarioVO usuarioVO = new UsuarioVO();
			usuarioVO.setNome(nome);
			usuarioVO.setEmail(email);
			usuarioVO.setNivel(nivel);
			usuarioVO.setSenha(senha);

			UsuarioBO usuarioBO = new UsuarioBO();
			usuarioBO.listar(usuarioVO);
		}
		return mensagem;

	}

}
