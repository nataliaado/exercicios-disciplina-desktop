package exercicio3.view;

import javax.swing.JOptionPane;

import exercicio3.model.vo.UsuarioVO;

public class MenuCadastro {

	public void apresentarMenuCadastro() {

		String nomeInformado = JOptionPane.showInputDialog("Informe o nome: ");

		String email = verificarEmail();
		String senha = informeSenha();
		String nivel = obterNivel();

		UsuarioVO novoUsuario = new UsuarioVO();
		novoUsuario.setNome(nomeInformado);
		novoUsuario.setEmail(email);
		novoUsuario.setSenha(senha);
		novoUsuario.setNivel(nivel);

		JOptionPane.showMessageDialog(null, "Usuário salvo!\n" + novoUsuario.toString());
	}

	private String obterNivel() {
		String nivel = null;
		String informeNivel = JOptionPane.showInputDialog("Informe se você é administrador ou normal");

		if (informeNivel.equals("administrador") || informeNivel.equals("normal")) {
			nivel = informeNivel;
		} else {
			JOptionPane.showMessageDialog(null, "Informe se você é administrador ou normal, sem abreviar!");
			nivel = obterNivel();
		}
		return nivel;
	}

	private String informeSenha() {
		String senha = null;
		String informeSenha = JOptionPane.showInputDialog("Informe a senha de até 8 caracteres");

		if (informeSenha.length() <= 8) {
			senha = informeSenha;
		} else {
			JOptionPane.showMessageDialog(null, "Informe a senha de até 8 caracteres apenas!");
			senha = informeSenha();
		}
		return senha;
	}

	private String verificarEmail() {
		String email = null;
		String emailInformado = JOptionPane.showInputDialog("Informe o e-mail");

		if (emailInformado.endsWith(".com") || emailInformado.endsWith(".com.br")) {
			email = emailInformado;
		} else {
			JOptionPane.showMessageDialog(null, "Informe o e-mail corretamente novamente!");
			email = verificarEmail();
		}
		return email;
	}

}
