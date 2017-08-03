package maquettes.dialogue;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FLoginMdp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FLoginMdp frame = new FLoginMdp();
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
	public FLoginMdp() {
		setTitle("Luna");
		setIconImage(Toolkit.getDefaultToolkit().getImage(FLoginMdp.class.getResource("/images/Moon-32.png")));
		setBounds(100, 100, 388, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMauvaisLoginOu = new JLabel("Mauvais login ou mot de passe . Veuillez réessayer.");
		lblMauvaisLoginOu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMauvaisLoginOu.setBounds(54, 43, 283, 49);
		contentPane.add(lblMauvaisLoginOu);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(138, 118, 101, 37);
		contentPane.add(btnNewButton);
		
		contentPane.getRootPane().setDefaultButton(btnNewButton);
	}
}
