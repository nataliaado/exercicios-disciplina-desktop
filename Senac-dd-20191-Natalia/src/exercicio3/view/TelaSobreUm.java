package exercicio3.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaSobreUm extends JFrame {

	private JPanel contentPane;
	private JTextField txtNatliaAraujo;
	private JTextField txtAnliseEDesenvolvimento;
	private JLabel lblCidade;
	private JTextField txtFlorianpolis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSobreUm frame = new TelaSobreUm();
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
	public TelaSobreUm() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNome.setBounds(12, 23, 136, 29);
		contentPane.add(lblNome);

		txtNatliaAraujo = new JTextField();
		txtNatliaAraujo.setText("Nat\u00E1lia Araujo");
		txtNatliaAraujo.setBounds(12, 50, 305, 22);
		contentPane.add(txtNatliaAraujo);
		txtNatliaAraujo.setColumns(10);

		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCurso.setBounds(12, 94, 108, 22);
		contentPane.add(lblCurso);

		txtAnliseEDesenvolvimento = new JTextField();
		txtAnliseEDesenvolvimento.setText("An\u00E1lise e Desenvolvimento de Sistemas");
		txtAnliseEDesenvolvimento.setBounds(12, 117, 305, 22);
		contentPane.add(txtAnliseEDesenvolvimento);
		txtAnliseEDesenvolvimento.setColumns(10);

		lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCidade.setBounds(12, 152, 108, 29);
		contentPane.add(lblCidade);

		txtFlorianpolis = new JTextField();
		txtFlorianpolis.setText("Florian\u00F3polis");
		txtFlorianpolis.setBounds(12, 180, 305, 22);
		contentPane.add(txtFlorianpolis);
		txtFlorianpolis.setColumns(10);
	}

}
