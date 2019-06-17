package exercicio4.view;

import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaAjuda extends JInternalFrame {

	private JPanel contentPane;
	private JTextField txtAjuda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAjuda frame = new TelaAjuda();
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
	public TelaAjuda() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Ajuda");
		setBounds(0, 0, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblAjuda = new JLabel("Ajuda");
		lblAjuda.setBounds(182, 11, 61, 19);
		lblAjuda.setFont(new Font("Dialog", Font.BOLD, 20));
		getContentPane().add(lblAjuda);
		
		JLabel lblDigiteAquiSua = new JLabel("Digite aqui sua Duvida :");
		lblDigiteAquiSua.setBounds(141, 41, 158, 19);
		lblDigiteAquiSua.setFont(new Font("Dialog", Font.BOLD, 13));
		getContentPane().add(lblDigiteAquiSua, "2, 6, 2, 1, left, top");
		

		JButton btn = new JButton("Pesquisar");
		btn.setBounds(123, 101, 189, 19);
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					URI uri = new URI("https://www.google.com/search?q=" + URLEncoder.encode(txtAjuda.getText(), "UTF-8"));
					Desktop.getDesktop().browse(uri);
				} catch (IOException ex) {
					ex.printStackTrace();
				} catch (URISyntaxException ex) {
					ex.printStackTrace();
				}
			}
		});
		getContentPane().add(btn, "2, 10");
		
		JButton btnGoogle = new JButton("Google");
		btnGoogle.setBounds(158, 133, 107, 19);
		btnGoogle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					URI uri = new URI("https://www.google.com");
					Desktop.getDesktop().browse(uri);
				} catch (IOException ex) {
					ex.printStackTrace();
				} catch (URISyntaxException ex) {
					ex.printStackTrace();
				}
			}
		});
		getContentPane().add(btnGoogle, "2, 14");
		
		txtAjuda = new JTextField();
		txtAjuda.setBounds(30, 71, 373, 20);
		getContentPane().add(txtAjuda);
		txtAjuda.setColumns(10);

	}
}