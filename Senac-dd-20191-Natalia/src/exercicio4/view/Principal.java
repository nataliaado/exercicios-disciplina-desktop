package exercicio4.view;

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
	TelaCadastroCliente cadastroCliente = null;
	TelaListarProdutos listarProdutos = null;
	TelaExcluirProduto excluirProduto = null;
	TelaAlterar alterarProduto = null;
	TelaAjuda ajuda = null;
	TelaSobre sobre = null;

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
		setBounds(100, 100, 648, 443);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnClientes = new JMenu("Clientes");
		mnClientes.setIcon(
				new ImageIcon(Principal.class.getResource("/icones/icons8-grupo-de-usu\u00E1rio-homem-homem-50.png")));
		menuBar.add(mnClientes);

		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				if (cadastroCliente == null) {
					desktopPane.add(cadastroCliente);
					cadastroCliente.show();
				} else if (cadastroCliente != null) {
					cadastroCliente.setVisible(true);
				}

			}
		});
		mntmCadastrar.setIcon(
				new ImageIcon(Principal.class.getResource("/icones/icons8-adicionar-usu\u00E1rio-masculino.png")));
		mntmCadastrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mnClientes.add(mntmCadastrar);

		JMenuItem mntmListar = new JMenuItem("Listar");
		JMenuItem mntmAlteraoDeProduto = new JMenuItem("Alteração de Produto");
		mntmAlteraoDeProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (alterarProduto == null) {
					alterarProduto = new TelaAlterar();
					desktopPane.add(alterarProduto);
					alterarProduto.show();
				} else if (alterarProduto != null) {
					alterarProduto.setVisible(true);
				}
			}
		});
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

		JMenuItem mntmExcluirProduto = new JMenuItem("Excluir Produto");
		mntmExcluirProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (excluirProduto == null) {
					desktopPane.add(excluirProduto);
					excluirProduto.show();
				} else if (excluirProduto != null) {
					excluirProduto.setVisible(true);
				}

			}
		});
		mnProdutos.add(mntmExcluirProduto);

		JMenuItem mntmListarProdutos = new JMenuItem("Listar Produtos");
		mntmListarProdutos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (listarProdutos == null) {
					desktopPane.add(listarProdutos);
					listarProdutos.show();
				} else if (listarProdutos != null) {
					listarProdutos.setVisible(true);
				}
			}
		});
		mnProdutos.add(mntmListarProdutos);

		JMenu mnFuncionrios = new JMenu("Funcion\u00E1rios");
		mnFuncionrios
				.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-gest\u00E3o-de-cliente-64.png")));
		menuBar.add(mnFuncionrios);

		JMenu mnSobre = new JMenu("Sobre");
		mnSobre.setIcon(new ImageIcon(
				Principal.class.getResource("/icones/icons8-cart\u00E3o-de-cr\u00E9dito-sem-contato.png")));
		menuBar.add(mnSobre);

		JMenuItem mntmManual = new JMenuItem("Manual");
		mntmManual.setIcon(new ImageIcon(
				Principal.class.getResource("/icones/icons8-gerente-de-informa\u00E7\u00F5es-do-cliente.png")));
		mntmManual.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0));
		mnSobre.add(mntmManual);

		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mntmAjuda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ajuda == null) {
					ajuda = new TelaAjuda();
					desktopPane.add(ajuda);
					ajuda.setVisible(true);
				} else if (ajuda != null) {
					ajuda.setVisible(true);
				}
			}
		});
		mntmAjuda.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-suporte-on-line-filled-50.png")));
		mntmAjuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0));
		mnSobre.add(mntmAjuda);

		JMenuItem mntmAutores = new JMenuItem("Autores");
		mntmAutores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sobre == null) {
					desktopPane.add(sobre);
					sobre.setVisible(true);
				} else if (sobre != null) {
					sobre.setVisible(true);
				}
			}
		});
		mntmAutores.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-charlie-chaplin-64.png")));
		mntmAutores.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
		mnSobre.add(mntmAutores);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		desktopPane.setLayout(null);
	}
}
