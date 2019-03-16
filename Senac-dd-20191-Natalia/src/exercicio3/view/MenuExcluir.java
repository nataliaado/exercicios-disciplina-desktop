package exercicio3.view;

import javax.swing.JOptionPane;

import exercicio3.model.vo.UsuarioVO;

public class MenuExcluir {

	public void apresentarMenuExcluir() {

		int idInformado = informeId();

		UsuarioVO novoUsuario = new UsuarioVO();
		novoUsuario.setId(idInformado);

		JOptionPane.showMessageDialog(null, "Usuário de id : " + novoUsuario.getId() + " foi excluido!\n");

	}

	private int informeId() {
		int id = 0;
		String informeId = JOptionPane.showInputDialog("Informe o id para excluir");

		if (informeId != null) {
			JOptionPane.showMessageDialog(null, "Deseja confirmar a ação?");
			id = Integer.parseInt(informeId);
		} else {
			JOptionPane.showMessageDialog(null, "Informe o id novamente, apenas números!");
			id = Integer.parseInt(informeId);
		}
		return id;
	}

}
