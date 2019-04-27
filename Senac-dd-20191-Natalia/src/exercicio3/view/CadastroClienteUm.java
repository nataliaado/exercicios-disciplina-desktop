package exercicio3.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroClienteUm extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel contentPane;
	private JDesktopPane desktopPane;
	CadastroClienteUm cadastroClienteUm = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroClienteUm frame = new CadastroClienteUm();
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
	public CadastroClienteUm() {
		setBounds(100, 100, 350, 376);
		getContentPane().setLayout(null);

		JLabel lblCadastroDeCliente = new JLabel("Cadastro de Cliente");
		lblCadastroDeCliente.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCadastroDeCliente.setBounds(12, 13, 214, 29);
		getContentPane().add(lblCadastroDeCliente);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(22, 67, 56, 16);
		getContentPane().add(lblNome);

		textField = new JTextField();
		textField.setBounds(32, 88, 278, 22);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCep.setBounds(22, 134, 56, 16);
		getContentPane().add(lblCep);

		textField_1 = new JTextField();
		textField_1.setBounds(32, 163, 278, 22);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblDataNascimento = new JLabel("Data Nascimento:");
		lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDataNascimento.setBounds(12, 212, 135, 16);
		getContentPane().add(lblDataNascimento);

		textField_2 = new JTextField();
		textField_2.setBounds(32, 241, 278, 22);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadastroClienteUm = new CadastroClienteUm();
				desktopPane.add(cadastroClienteUm);
				cadastroClienteUm.add(cadastroClienteUm);
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSalvar.setBounds(32, 295, 278, 25);
		getContentPane().add(btnSalvar);

	}
}
