package exercicio3.view;

import java.awt.EventQueue;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import exercicio3.controller.Controller;
import exercicio3.model.bo.NivelBO;
import exercicio3.model.vo.NivelVO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;

public class TelaCadastro {

	private JFrame frmCadastroDeUsuarios;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JComboBox cbNivel;
	private JPasswordField pfSenha;
	private JPasswordField pfConfirmacaoSenha;
	private List niveis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro window = new TelaCadastro();
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
	public TelaCadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		consultarNiveis();

		frmCadastroDeUsuarios = new JFrame();
		frmCadastroDeUsuarios.setTitle("Cadastro de usuários");
		frmCadastroDeUsuarios.setBounds(100, 100, 407, 256);
		frmCadastroDeUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNome = new JLabel("Nome:");
		frmCadastroDeUsuarios.getContentPane().setLayout(new GridLayout(0, 4, 0, 0));
		frmCadastroDeUsuarios.getContentPane().add(lblNome);
				
						pfConfirmacaoSenha = new JPasswordField();
						frmCadastroDeUsuarios.getContentPane().add(pfConfirmacaoSenha);
				
						JLabel lblSenha = new JLabel("Senha:");
						frmCadastroDeUsuarios.getContentPane().add(lblSenha);
				
						pfSenha = new JPasswordField();
						frmCadastroDeUsuarios.getContentPane().add(pfSenha);
				
						JLabel lblConfirmaoDeSenha = new JLabel("Confirmação:");
						frmCadastroDeUsuarios.getContentPane().add(lblConfirmaoDeSenha);
				
						txtNome = new JTextField();
						txtNome.setColumns(10);
						frmCadastroDeUsuarios.getContentPane().add(txtNome);
				
						JLabel lblNivel = new JLabel("Nível:");
						frmCadastroDeUsuarios.getContentPane().add(lblNivel);
				
						// Novo componente: Combobox
						cbNivel = new JComboBox();
						cbNivel.setModel((ComboBoxModel) new DefaultComboBoxModel(((java.util.List<NivelVO>) niveis).toArray()));
						
								// Inicia sem nada selecionado no combo
								cbNivel.setSelectedIndex(-1);
								frmCadastroDeUsuarios.getContentPane().add(cbNivel);
				
						JLabel lblEmail = new JLabel("Email:");
						frmCadastroDeUsuarios.getContentPane().add(lblEmail);
				
						txtEmail = new JTextField();
						txtEmail.setColumns(10);
						frmCadastroDeUsuarios.getContentPane().add(txtEmail);
				
				JLabel lbl_1 = new JLabel("");
				frmCadastroDeUsuarios.getContentPane().add(lbl_1);
				
				JLabel lbl_2 = new JLabel("");
				frmCadastroDeUsuarios.getContentPane().add(lbl_2);
				
				JLabel lbl_3 = new JLabel("");
				frmCadastroDeUsuarios.getContentPane().add(lbl_3);
				
				JLabel lbl_4 = new JLabel("");
				frmCadastroDeUsuarios.getContentPane().add(lbl_4);
				
				JLabel lbl_5 = new JLabel("");
				frmCadastroDeUsuarios.getContentPane().add(lbl_5);
				
				JLabel lbl_6 = new JLabel("");
				frmCadastroDeUsuarios.getContentPane().add(lbl_6);
				
				JLabel lbl_7 = new JLabel("");
				frmCadastroDeUsuarios.getContentPane().add(lbl_7);
				
						JButton btnSalvar = new JButton("Salvar");
						btnSalvar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								String senha = new String(pfSenha.getPassword());
								String confirmacaoSenha = new String(pfConfirmacaoSenha.getPassword());
								NivelVO nivel = (NivelVO) cbNivel.getModel().getSelectedItem();

								Controller controller = new Controller();
								JOptionPane.showMessageDialog(null,
										controller.salvar(txtNome.getText(), txtEmail.getText(), nivel, confirmacaoSenha, senha));
							}
						});
						frmCadastroDeUsuarios.getContentPane().add(btnSalvar);
				
						JButton btnLimpar = new JButton("Limpar");
						btnLimpar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								txtNome.setText("");
								txtEmail.setText("");
								pfSenha.setText("");
								pfConfirmacaoSenha.setText("");
								cbNivel.setSelectedIndex(-1);
							}
						});
						frmCadastroDeUsuarios.getContentPane().add(btnLimpar);
	}

	private void consultarNiveis() {
		NivelBO nivelBO = new NivelBO();
		nivelBO.consultarNivel();
	}
}