package maquettes.dialogue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FConExit extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FConExit() {
		setTitle("Quitter");
		setIconImage(Toolkit.getDefaultToolkit().getImage(FConExit.class.getResource("/images/Moon-32.png")));
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Label qui contient le texte
		JLabel lblQuitterLaplication = new JLabel("Quitter l'aplication ?");
		lblQuitterLaplication.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuitterLaplication.setBounds(50, 65, 130, 14);
		contentPane.add(lblQuitterLaplication);
		
		//Boutton oui
		JButton btnNewButton = new JButton("Oui");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(184, 62, 89, 23);
		contentPane.add(btnNewButton);
		
		// Bouton non
		JButton btnNewButton_1 = new JButton("Non");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(283, 62, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
