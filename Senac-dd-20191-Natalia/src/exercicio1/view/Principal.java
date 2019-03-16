package exercicio1.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;


public class Principal {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSejaBemVindo = new JLabel("Seja Bem Vindo!");
		lblSejaBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSejaBemVindo.setForeground(Color.BLACK);
		lblSejaBemVindo.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblSejaBemVindo.setBounds(112, 112, 205, 39);
		frame.getContentPane().add(lblSejaBemVindo);
		
		JLabel lblola = new JLabel("Olá,");
		lblola.setForeground(Color.BLACK);
		lblola.setFont(new Font("Century Gothic", Font.BOLD, 24));
		lblola.setHorizontalAlignment(SwingConstants.CENTER);
		lblola.setBounds(183, 73, 56, 26);
		frame.getContentPane().add(lblola);
		
	}
}
