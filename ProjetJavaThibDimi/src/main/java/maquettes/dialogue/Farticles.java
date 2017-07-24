package maquettes.dialogue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Farticles extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Farticles frame = new Farticles();
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
	public Farticles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1018, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 0));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new MigLayout("", "[center]", "[grow][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("Articles");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setIcon(new ImageIcon(Farticles.class.getResource("/images/gestion/article/Product-64-actif.png")));
		panel.add(lblNewLabel, "cell 0 0,alignx left,aligny top");
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setIcon(new ImageIcon(Farticles.class.getResource("/images/gestion/Home-48.png")));
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton = new JButton("Apperçu");
		btnNewButton.setBackground(new Color(0, 204, 0));
		btnNewButton.setIcon(new ImageIcon(Farticles.class.getResource("/images/gestion/Preview-48.png")));
		btnNewButton.setBorder(null);
		panel.add(btnNewButton, "cell 0 1");
		
		JButton btnNewButton_1 = new JButton("Imprimer");
		btnNewButton_1.setBackground(new Color(0, 204, 0));
		btnNewButton_1.setIcon(new ImageIcon(Farticles.class.getResource("/images/gestion/Printer-48.png")));
		btnNewButton_1.setBorder(null);
		panel.add(btnNewButton_1, "cell 0 2");
		
		JButton btnNewButton_2 = new JButton("Export");
		btnNewButton_2.setBackground(new Color(0, 204, 0));
		btnNewButton_2.setIcon(new ImageIcon(Farticles.class.getResource("/images/gestion/Data-Export-48.png")));
		btnNewButton_2.setBorder(null);
		panel.add(btnNewButton_2, "cell 0 3");
		btnAccueil.setBackground(new Color(0, 204, 0));
		btnAccueil.setBorder(null);
		panel.add(btnAccueil, "cell 0 4");
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[grow,center]", "[grow,center]"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_2, "cell 0 0,alignx center,aligny top");
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, "cell 0 0,alignx center,aligny center");
	}

}
