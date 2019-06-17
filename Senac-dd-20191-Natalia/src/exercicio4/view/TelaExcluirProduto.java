package exercicio4.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaExcluirProduto extends JInternalFrame {
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExcluirProduto frame = new TelaExcluirProduto();
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
	public TelaExcluirProduto() {
		setBounds(100, 100, 200, 150);
		getContentPane().setLayout(null);
		
		JLabel lblExcluirProduto = new JLabel("Excluir Produto");
		lblExcluirProduto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblExcluirProduto.setBounds(23, 11, 139, 25);
		getContentPane().add(lblExcluirProduto);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(30, 36, 46, 14);
		getContentPane().add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(45, 36, 86, 20);
		getContentPane().add(txtId);
		txtId.setColumns(10);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(42, 67, 89, 23);
		getContentPane().add(btnExcluir);

	}
}