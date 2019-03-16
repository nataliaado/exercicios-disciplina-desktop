package exercicio3.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {

	private static final int OPCAO_MENU_CADASTRO = 1;
	private static final int OPCAO_MENU_EXCLUIR = 2;
	private static final int OPCAO_MENU_LISTAR = 3;
	private static final int OPCAO_MENU_SAIR = 4;

	Scanner teclado = new Scanner(System.in);

	public void apresentarMenuGrafico() {
		String textoMenu = "CRUD de Usuários \n" + "Opções: \n" + OPCAO_MENU_CADASTRO + " - Cadastro \n"
				+ OPCAO_MENU_EXCLUIR + " - Excluir \n" + OPCAO_MENU_LISTAR + " - Listar \n" + OPCAO_MENU_SAIR
				+ " - Sair \n" + "Digite a Opção (somente o número): ";
		String opcaoInformada = JOptionPane.showInputDialog(textoMenu);

		try {
			int opcao = Integer.parseInt(opcaoInformada);
			encaminharParaTelaEscolhida(opcao);
		} catch (NumberFormatException nExp) {
			JOptionPane.showMessageDialog(null, "Informe um número INTEIRO");
			apresentarMenuGrafico();
		}
	}

	private void encaminharParaTelaEscolhida(int opcao) {
		switch (opcao) {
		case OPCAO_MENU_CADASTRO: {
			MenuCadastro menuCadastro = new MenuCadastro();
			menuCadastro.apresentarMenuCadastro();
			break;
		}
		case OPCAO_MENU_EXCLUIR: {
			MenuExcluir menuExcluir = new MenuExcluir();
			menuExcluir.apresentarMenuExcluir();
			break;
		}
		case OPCAO_MENU_LISTAR: {
			MenuListar menuListar = new MenuListar();
			menuListar.apresentarMenuListar();
			break;
		}
		case OPCAO_MENU_SAIR: {
			int opcaoSelecionada = JOptionPane.showConfirmDialog(null, "Deseja sair?: ");
			switch (opcaoSelecionada) {
			case JOptionPane.YES_OPTION:
				JOptionPane.showMessageDialog(null, "Até Mais");
				break;
			case JOptionPane.NO_OPTION:
				apresentarMenuGrafico();
				break;
			case JOptionPane.CANCEL_OPTION:
				apresentarMenuGrafico();
				break;
			}
		}
		default: {
			System.out.println("\nOpção Inválida");
		}
		}
	}

	public void apresentarMenu() {
		mostrarOpcoes();
		int opcao = Integer.parseInt(teclado.next());
		while (opcao != 4) {
			encaminharParaTelaEscolhida(opcao);
			mostrarOpcoes();
			opcao = Integer.parseInt(teclado.next());
		}
	}

	private void mostrarOpcoes() {
		System.out.println("CRUD de Usuários");
		System.out.println("\nOpções:");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Excluir");
		System.out.println("3 - Listar");
		System.out.println("4 - Sair");
		System.out.print("\nDigite a Opção: ");
	}

}
