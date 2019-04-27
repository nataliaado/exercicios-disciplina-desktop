package exercicio3.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
					// Inicializa a tela principal MAXIMIZADA
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

					JMenuBar menuBar = new JMenuBar();
					frame.setJMenuBar(menuBar);

					JMenu menu = new JMenu("Clientes");
					menu.setIcon(
							new ImageIcon(Principal.class.getResource("/icones/icons8-grupo-de-usu\u00E1rio-homem-homem-50.png")));
					menuBar.add(menu);

					JMenuItem mntmCadastro = new JMenuItem("Cadastrar");
					mntmCadastro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
					mntmCadastro.setIcon(new ImageIcon(
							Principal.class.getResource("/icones/icons8-adicionar-usu\u00E1rio-masculino-50.png")));
					menu.add(mntmCadastro);

					JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listar");
					mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
					mntmNewMenuItem_1.setIcon(
							new ImageIcon(Principal.class.getResource("/icones/icons8-card\u00E1pio-64 (1).png")));
					menu.add(mntmNewMenuItem_1);

					JMenuItem mntmRelatrio = new JMenuItem("Relat\u00F3rio");
					mntmRelatrio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
					mntmRelatrio.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-arquivo-50.png")));
					menu.add(mntmRelatrio);

					JMenuItem mntmNewMenuItem = new JMenuItem("Produtos");
					mntmNewMenuItem.setIcon(
							new ImageIcon(Principal.class.getResource("/icones/icons8-move-by-trolley-64.png")));
					menuBar.add(mntmNewMenuItem);
					
					JMenu mnFuncionarios = new JMenu("Funcionarios");
					mnFuncionarios.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-gest\u00E3o-de-cliente-64.png")));
					menuBar.add(mnFuncionarios);
					
					JMenu mnSobre = new JMenu("Sobre");
					mnSobre.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-cart\u00E3o-de-cr\u00E9dito-sem-contato.png")));
					menuBar.add(mnSobre);
					
					JMenuItem mntmManual = new JMenuItem("Manual");
					mntmManual.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0));
					mntmManual.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-gerente-de-informa\u00E7\u00F5es-do-cliente.png")));
					mnSobre.add(mntmManual);
					
					JMenuItem menuItem = new JMenuItem("Ajuda");
					menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0));
					menuItem.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-suporte-on-line-filled-50.png")));
					mnSobre.add(menuItem);
					
					JMenuItem mntmAutores = new JMenuItem("Autores");
					mntmAutores.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							TelaSobre s = new TelaSobre();
							s.setVisible(true);
						}
					});
					mntmAutores.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
					mntmAutores.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-charlie-chaplin-64.png")));
					mnSobre.add(mntmAutores);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
