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
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;

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
					menu.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-gest\u00E3o-de-cliente-64.png")));
					menuBar.add(menu);
					
					JMenuItem mntmCadastro = new JMenuItem("Cadastrar");
					mntmCadastro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
					mntmCadastro.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-adicionar-usu\u00E1rio-masculino-50.png")));
					menu.add(mntmCadastro);
					
					JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listar");
					mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
					mntmNewMenuItem_1.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-card\u00E1pio-64 (1).png")));
					menu.add(mntmNewMenuItem_1);
					
					JMenuItem mntmRelatrio = new JMenuItem("Relat\u00F3rio");
					mntmRelatrio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
					mntmRelatrio.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-arquivo-50.png")));
					menu.add(mntmRelatrio);
					
					JMenuItem mntmNewMenuItem = new JMenuItem("Produtos");
					mntmNewMenuItem.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-move-by-trolley-64.png")));
					menuBar.add(mntmNewMenuItem);
					
					JDesktopPane desktopPane = new JDesktopPane();
					frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
