package exercicio3.view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MenuListar {

	public void apresentarMenuListar() {

		ArrayList<String> usuarios = new ArrayList<String>();

		usuarios.add("Nome: Pedro");
		usuarios.add(" Id: 1");
		usuarios.add(" Email: pedro@hotmail.com");
		usuarios.add(" Senha: 01234567");
		usuarios.add(" N�vel: normal\n\n");

		usuarios.add("Nome: Carolina");
		usuarios.add(" Id: 2");
		usuarios.add(" Email: carolina@hotmail.com.br");
		usuarios.add(" Senha: 12345678");
		usuarios.add(" N�vel: administrador\n\n");

		usuarios.add("Nome: Jo�o");
		usuarios.add(" Id: 3");
		usuarios.add(" Email: jo�o@gmail.com");
		usuarios.add(" Senha: 23456789");
		usuarios.add(" N�vel: normal\n\n");

		usuarios.add("Nome: Fernanda");
		usuarios.add(" Id: 4");
		usuarios.add(" Email: fernanda@gmail.com.br");
		usuarios.add(" Senha: 39476493");
		usuarios.add(" N�vel: administrador\n\n");

		JOptionPane.showMessageDialog(null, "Lista de todos usu�rios:\n\n" + usuarios.toString());
	}

}
