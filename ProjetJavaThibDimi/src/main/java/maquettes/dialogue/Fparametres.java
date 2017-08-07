package maquettes.dialogue;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.UIManager;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Fparametres extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtJdbcmysqllocalhostluna;
	private JTextField txtRoot;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public Fparametres() {
		setTitle("Luna");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Fparametres.class.getResource("/images/Moon-32.png")));
		setBounds(100, 100, 388, 237);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[grow][grow][grow][grow]"));
		
		JLabel lblNewLabel_1 = new JLabel("Connexion à la base de données");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1, "cell 1 0 2 1,alignx center");
		
		JLabel lblNewLabel = new JLabel("Nom");
		contentPane.add(lblNewLabel, "cell 0 1,alignx trailing");
		
		txtJdbcmysqllocalhostluna = new JTextField();
		txtJdbcmysqllocalhostluna.setText("jdbc:mysql://localhost:3306/luna");
		contentPane.add(txtJdbcmysqllocalhostluna, "cell 1 1 2 1,growx");
		txtJdbcmysqllocalhostluna.setColumns(10);
		
		JLabel lblUtilisateur = new JLabel("Utilisateur");
		contentPane.add(lblUtilisateur, "cell 0 2,alignx trailing");
		
		txtRoot = new JTextField();
		txtRoot.setText("root");
		contentPane.add(txtRoot, "cell 1 2,growx");
		txtRoot.setColumns(10);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		contentPane.add(lblMotDePasse, "cell 2 2,alignx trailing");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 3 2,growx");
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.setIcon(new ImageIcon(Fparametres.class.getResource("/images/gestion/Cancel-48.png")));
		contentPane.add(btnNewButton_1, "cell 1 3");
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setIcon(new ImageIcon(Fparametres.class.getResource("/images/gestion/Save-48.png")));
		contentPane.add(btnNewButton, "cell 2 3");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
}
