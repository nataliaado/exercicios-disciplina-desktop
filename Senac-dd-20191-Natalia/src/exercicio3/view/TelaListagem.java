package exercicio3.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import exercicio3.controller.Controller;
import exercicio3.model.bo.NivelBO;
import exercicio3.model.vo.NivelVO;
import exercicio3.model.vo.UsuarioVO;

public class TelaListagem {

	private JFrame frmCadastroDeUsuarios;
	private JTextField txtNome;
	private JComboBox cbNivel;
	private List<NivelVO> niveis;
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
		consultarNiveis();

		frmCadastroDeUsuarios = new JFrame();
		frmCadastroDeUsuarios.setTitle("Consulta de usu�rios");
		frmCadastroDeUsuarios.setBounds(100, 100, 720, 405);
		frmCadastroDeUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNome = new JLabel("Nome:");

		JLabel lblNivel = new JLabel("N�vel:");

		txtNome = new JTextField();
		txtNome.setColumns(10);

		JButton btnConsultarPorNome = new JButton("Consultar por nome");
		btnConsultarPorNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller controller = new Controller();
				UsuarioVO usuario = new UsuarioVO();
				usuario = controller.listarPorNome(txtNome.getText());
				ArrayList<UsuarioVO> usuarios = new ArrayList<UsuarioVO>();
				usuarios.add(usuario);
				atualizarTabelaUsuarios(usuarios);
			}
		});

		JButton btnConsultarTodos = new JButton("Consultar todos");
		btnConsultarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller controller = new Controller();
				ArrayList<UsuarioVO> usuarios = new ArrayList<UsuarioVO>();
				usuarios = controller.listarTodos();
				atualizarTabelaUsuarios(usuarios);
			}
		});
		frmCadastroDeUsuarios.getContentPane()
				.setLayout(new FormLayout(
						new ColumnSpec[] {
								FormSpecs.UNRELATED_GAP_COLSPEC, ColumnSpec.decode("65px"), ColumnSpec.decode("40px"),
								ColumnSpec.decode("320px"), ColumnSpec.decode("97px"), ColumnSpec.decode("240px"), },
						new RowSpec[] { FormSpecs.PARAGRAPH_GAP_ROWSPEC, RowSpec.decode("30px"),
								FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("30px"), FormSpecs.RELATED_GAP_ROWSPEC,
								RowSpec.decode("30px"), FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("230px"), }));
		frmCadastroDeUsuarios.getContentPane().add(lblNome, "2, 2, fill, center");
		frmCadastroDeUsuarios.getContentPane().add(txtNome, "3, 2, 2, 1, fill, fill");
		frmCadastroDeUsuarios.getContentPane().add(lblNivel, "2, 4, fill, center");

		// Novo componente: Combobox
		cbNivel = new JComboBox();
		cbNivel.setModel(new DefaultComboBoxModel(niveis.toArray()));

		// Inicia sem nada selecionado no combo
		cbNivel.setSelectedIndex(-1);
		frmCadastroDeUsuarios.getContentPane().add(cbNivel, "3, 4, 2, 1, fill, fill");

		JButton btnConsultarPorNivel = new JButton("Consultar por n�vel");
		btnConsultarPorNivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller controller = new Controller();
				NivelVO nivel = (NivelVO) cbNivel.getModel().getSelectedItem();
				ArrayList<UsuarioVO> usuarios = new ArrayList<UsuarioVO>();
				usuarios = controller.listarPorNivel(nivel);
				atualizarTabelaUsuarios(usuarios);
			}
		});
		frmCadastroDeUsuarios.getContentPane().add(btnConsultarPorNivel, "6, 4, left, fill");
		frmCadastroDeUsuarios.getContentPane().add(btnConsultarTodos, "2, 6, 3, 1, center, fill");
		frmCadastroDeUsuarios.getContentPane().add(btnConsultarPorNome, "6, 2, left, fill");

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				cbNivel.setSelectedIndex(-1);
				DefaultTableModel model = (DefaultTableModel) tblUsuarios.getModel();
				model.setRowCount(1);
			}
		});
		frmCadastroDeUsuarios.getContentPane().add(btnLimpar, "5, 6, fill, fill");

		// Novo componente: tabela
		tblUsuarios = new JTable();
		tblUsuarios.setVisible(true);

		// Cria a tabela vazia apenas com as colunas
		tblUsuarios
				.setModel(new DefaultTableModel(new Object[][] { { "id", "Nome" }, }, new String[] { "id", "Nome" }));
		frmCadastroDeUsuarios.getContentPane().add(tblUsuarios, "3, 8, 3, 1, fill, fill");
	}

	/**
	 * Atualiza o JTable de usu�rios.
	 * 
	 * @param usuarios
	 */
	protected void atualizarTabelaUsuarios(ArrayList<UsuarioVO> usuarios) {
		DefaultTableModel model = (DefaultTableModel) tblUsuarios.getModel();

		Object novaLinha[] = new Object[2];
		for (UsuarioVO usuario : usuarios) {
			novaLinha[0] = usuario.getId();
			novaLinha[1] = usuario.getNome();
			model.addRow(novaLinha);
		}
	}

	private void consultarNiveis() {
		NivelBO nivel = new NivelBO();
		niveis = nivel.consultarNivel();
	}

}