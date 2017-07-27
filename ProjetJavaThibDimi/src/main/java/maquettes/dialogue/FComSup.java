package maquettes.dialogue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import DAO.CommandesDAOMySQL;
import util.GlobalConnection;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class FComSup extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public FComSup(int code){
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(FComSup.class.getResource("/images/Moon-32.png")));
		setTitle("Supprimer une commande");
		setBounds(100, 100, 450, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSupprimerLaCommande = new JLabel("Supprimer la commande ?");
		lblSupprimerLaCommande.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSupprimerLaCommande.setBounds(41, 60, 165, 14);
		contentPane.add(lblSupprimerLaCommande);
		
		JButton btnNewButton = new JButton("Oui");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = null;
				try {
					con = GlobalConnection.getInstance();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				CommandesDAOMySQL com = new CommandesDAOMySQL();
				com.removeCommandes(code, con);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(216, 57, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Non");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(315, 57, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
