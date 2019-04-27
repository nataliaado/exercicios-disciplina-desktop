package exercicio3.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	CadastroCliente cadastroCliente = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 394);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnClientes = new JMenu("Clientes");
		mnClientes.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-grupo-de-usu\u00E1rio-homem-homem-50.png")));
		menuBar.add(mnClientes);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cadastroCliente = new CadastroCliente();
				desktopPane.add(cadastroCliente);
				cadastroCliente.show();
			}
		});
		mntmCadastrar.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-adicionar-usu\u00E1rio-masculino.png")));
		mntmCadastrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mnClientes.add(mntmCadastrar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-card\u00E1pio.png")));
		mntmListar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
		mnClientes.add(mntmListar);
		
		JMenuItem mntmRelatrio = new JMenuItem("Relat\u00F3rio");
		mntmRelatrio.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-arquivo-50.png")));
		mntmRelatrio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
		mnClientes.add(mntmRelatrio);
		
		JMenu mnProdutos = new JMenu("Produtos");
		mnProdutos.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-move-by-trolley-64.png")));
		menuBar.add(mnProdutos);
		
		JMenu mnFuncionrios = new JMenu("Funcion\u00E1rios");
		mnFuncionrios.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-gest\u00E3o-de-cliente-64.png")));
		menuBar.add(mnFuncionrios);
		
		JMenu mnSobre = new JMenu("Sobre");
		mnSobre.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-cart\u00E3o-de-cr\u00E9dito-sem-contato.png")));
		menuBar.add(mnSobre);
		
		JMenuItem mntmManual = new JMenuItem("Manual");
		mntmManual.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-gerente-de-informa\u00E7\u00F5es-do-cliente.png")));
		mntmManual.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0));
		mnSobre.add(mntmManual);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mntmAjuda.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-suporte-on-line-filled-50.png")));
		mntmAjuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0));
		mnSobre.add(mntmAjuda);
		
		JMenuItem mntmAutores = new JMenuItem("Autores");
		mntmAutores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaSobre s = new TelaSobre();
				s.setVisible(true);
			}
		});
		mntmAutores.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-charlie-chaplin-64.png")));
		mntmAutores.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
		mnSobre.add(mntmAutores);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		desktopPane.setLayout(null);
	}
}
