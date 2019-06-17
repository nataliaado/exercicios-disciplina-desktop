package exercicio4.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TelaListarProdutos extends JInternalFrame {
	private JTable table;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListarProdutos frame = new TelaListarProdutos();
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
	public TelaListarProdutos() {
		setTitle("Lista de Produtos");
		setForeground(Color.WHITE);
		setFrameIcon(new ImageIcon(TelaListarProdutos.class.getResource("/icones/icons8-documento-regular.png")));
		setClosable(true);
		setBounds(100, 100, 600, 445);
		getContentPane().setLayout(null);

		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListar.setBounds(243, 72, 100, 40);
		getContentPane().add(btnListar);

		JComboBox cmbCategoria = new JComboBox();
		cmbCategoria.setBackground(Color.WHITE);
		cmbCategoria.setForeground(Color.WHITE);
		cmbCategoria.setBounds(353, 39, 219, 20);
		getContentPane().add(cmbCategoria);

		table = new JTable();
		table.setBounds(10, 116, 564, 280);
		getContentPane().add(table);

		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(422, 12, 62, 14);
		getContentPane().add(lblCategoria);

		txtNome = new JTextField();
		txtNome.setBounds(20, 39, 219, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(86, 12, 46, 14);
		getContentPane().add(lblNome);

	}
}