package exercicio4.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaAlterar extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtCep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlterar frame = new TelaAlterar();
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
	public TelaAlterar() {
		setBounds(100, 100, 329, 270);
		getContentPane().setLayout(null);
		
		JLabel lblAlterarProduto = new JLabel("Alterar Produto");
		lblAlterarProduto.setFont(new Font("Dialog", Font.BOLD, 20));
		lblAlterarProduto.setBounds(12, 12, 272, 16);
		getContentPane().add(lblAlterarProduto);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 39, 66, 15);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(12, 59, 295, 19);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCep = new JLabel("Preço:");
		lblCep.setBounds(12, 90, 66, 15);
		getContentPane().add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setBounds(12, 109, 295, 19);
		getContentPane().add(txtCep);
		txtCep.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(120, 149, 114, 25);
		getContentPane().add(btnSalvar);

	}

	}