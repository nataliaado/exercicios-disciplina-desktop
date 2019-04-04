package exercicio3.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TelaListagem {
	private JFrame frmCadastroDeUsuarios;
	private JTextField txtNome;
	private JComboBox cbNivel;
	// private List<Nivel> niveis;
	private JTable tblUsuarios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListagem window = new TelaListagem();
					window.frmCadastroDeUsuarios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaListagem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// TODO consultar os n�veis no banco (criei na m�o aqui :D)
		consultarNiveis(); // TODO alterar esta chamada AQUI

		frmCadastroDeUsuarios = new JFrame();
		frmCadastroDeUsuarios.setTitle("Consulta de usu�rios");
		frmCadastroDeUsuarios.setBounds(100, 100, 585, 405);
		frmCadastroDeUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDeUsuarios.getContentPane().setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(20, 20, 55, 15);
		frmCadastroDeUsuarios.getContentPane().add(lblNome);

		JLabel lblNivel = new JLabel("N�vel:");
		lblNivel.setBounds(20, 55, 55, 15);
		frmCadastroDeUsuarios.getContentPane().add(lblNivel);

		txtNome = new JTextField();
		txtNome.setBounds(70, 15, 320, 28);
		frmCadastroDeUsuarios.getContentPane().add(txtNome);
		txtNome.setColumns(10);

		// Novo componente: Combobox
		cbNivel = new JComboBox();
		// cbNivel.setModel(new DefaultComboBoxModel(niveis.toArray()));

		// Inicia sem nada selecionado no combo
		cbNivel.setSelectedIndex(-1);

		cbNivel.setBounds(70, 50, 320, 28);
		frmCadastroDeUsuarios.getContentPane().add(cbNivel);

		JButton btnConsultarPorNivel = new JButton("Consultar por n�vel");
		btnConsultarPorNivel.addActionListener(new ActionListener() {
			public void actionPerformed1(ActionEvent e) {

			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		btnConsultarPorNivel.setBounds(390, 49, 160, 30);
		frmCadastroDeUsuarios.getContentPane().add(btnConsultarPorNivel);

		JButton btnConsultarPorNome = new JButton("Consultar por nome");
		btnConsultarPorNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Chamar o m�todo do controller: consultarPorNome(String nome)

				// Mostrar na tabela a lista retornada
				// ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
				// Usuario u1 = new Usuario(1, "User1");
				// Usuario u2 = new Usuario(2, "User2");
				// Usuario u3 = new Usuario(3, "User3");
				// usuarios.add(u1);
				// usuarios.add(u2);
				// usuarios.add(u3);

				// Chamar sempre que for atualizar a tabela com os usu�rios
				// atualizarTabelaUsuarios(usuarios);
			}
		});
		btnConsultarPorNome.setBounds(390, 14, 160, 30);
		frmCadastroDeUsuarios.getContentPane().add(btnConsultarPorNome);

		JButton btnConsultarTodos = new JButton("Consultar todos");
		btnConsultarTodos.setBounds(70, 85, 240, 30);
		frmCadastroDeUsuarios.getContentPane().add(btnConsultarTodos);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(310, 85, 240, 30);
		frmCadastroDeUsuarios.getContentPane().add(btnLimpar);

		// Novo componente: tabela
		tblUsuarios = new JTable();
		tblUsuarios.setVisible(true);

		// Cria a tabela vazia apenas com as colunas
		tblUsuarios
				.setModel(new DefaultTableModel(new Object[][] { { "id", "Nome" }, }, new String[] { "id", "Nome" }));

		tblUsuarios.setBounds(70, 120, 480, 230);
		frmCadastroDeUsuarios.getContentPane().add(tblUsuarios);
	}

	/**
	 * Atualiza o JTable de usu�rios.
	 * 
	 * @param usuarios
	 */
	// protected void atualizarTabelaUsuarios(ArrayList<Usuario> usuarios) {
	DefaultTableModel model = (DefaultTableModel) tblUsuarios.getModel();

	Object novaLinha[] = new Object[2];
	// for(Usuario usuario: usuarios){
	// novaLinha[0] = usuario.getId();
	// novaLinha[1] = usuario.getNome();
	// model.addRow(novaLinha);
	// }
	// }

	private void consultarNiveis() {
		// TODO trocar para uma chamada ao BO de Nivel
		// niveis = new ArrayList<Nivel>();

		// Nivel nivelAdm = new Nivel(1, "Administrador");
		// Nivel nivelNormal = new Nivel(2, "Normal");

		// niveis.add(nivelAdm);
		// niveis.add(nivelNormal);
	}

}
