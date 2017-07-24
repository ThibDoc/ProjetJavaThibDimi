package maquettes.dialogue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextPane;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fconnexion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fconnexion frame = new Fconnexion();
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
	public Fconnexion() {
		setTitle("SARL LUNA");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Fconnexion.class.getResource("/images/Moon-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Connexion au programme");
		lblNewLabel.setBounds(5, 5, 432, 48);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Fconnexion.class.getResource("/images/connection/Shopping-Cart-05-48.png")));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(15, 64, 417, 121);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNomDutilisateur = new JLabel("Nom D'utilisateur");
		lblNomDutilisateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomDutilisateur.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomDutilisateur.setIcon(new ImageIcon(Fconnexion.class.getResource("/images/connection/Windows-8-Login-16.png")));
		lblNomDutilisateur.setBounds(10, 11, 126, 14);
		panel.add(lblNomDutilisateur);
		
		JLabel lblNewLabel_1 = new JLabel("Mot de passe");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setIcon(new ImageIcon(Fconnexion.class.getResource("/images/connection/Key-16.png")));
		lblNewLabel_1.setBounds(28, 36, 108, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		lblNomDutilisateur.setLabelFor(textField);
		textField.setBounds(146, 9, 261, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		lblNewLabel_1.setLabelFor(textField_1);
		textField_1.setColumns(10);
		textField_1.setBounds(146, 33, 261, 20);
		panel.add(textField_1);
		
		JTextPane txtpnVeuillezSaisirLe = new JTextPane();
		txtpnVeuillezSaisirLe.setForeground(new Color(128, 128, 128));
		txtpnVeuillezSaisirLe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnVeuillezSaisirLe.setText("Veuillez saisir le nom de l'utilisateur et le mot de passe pour acc\u00E9der \u00E0 l'application");
		txtpnVeuillezSaisirLe.setBounds(10, 58, 198, 52);
		panel.add(txtpnVeuillezSaisirLe);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 189, 432, 69);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setHorizontalAlignment(SwingConstants.LEFT);
		btnValider.setForeground(new Color(255, 255, 255));
		btnValider.setBounds(302, 11, 130, 55);
		btnValider.setIcon(new ImageIcon(Fconnexion.class.getResource("/images/connection/Power-48.png")));
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(btnValider);
		
		JButton button = new JButton("New button");
		button.setBounds(282, 66, 89, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(408, 66, 89, 23);
		panel_1.add(button_1);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setHorizontalAlignment(SwingConstants.LEFT);
		btnQuitter.setBounds(172, 11, 130, 55);
		panel_1.add(btnQuitter);
		btnQuitter.setIcon(new ImageIcon(Fconnexion.class.getResource("/images/connection/Stop-48.png")));
		btnQuitter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton = new JButton("Param\u00E8tres");
		btnNewButton.setBounds(-3, 11, 165, 55);
		panel_1.add(btnNewButton);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon(Fconnexion.class.getResource("/images/connection/Customize-01-48.png")));
	}
}
