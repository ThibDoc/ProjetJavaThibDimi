package maquettes.dialogue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Insets;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class FAccueil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FAccueil frame = new FAccueil();
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
	public FAccueil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Accueil");
		setIconImage(Toolkit.getDefaultToolkit().getImage(FAccueil.class.getResource("/images/Moon-32.png")));
		setBounds(100, 100, 1079, 579);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Vues");
		menuBar.add(mnNewMenu_1);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.WEST);
		
		JLabel lblSarlLuna = new JLabel("SARL Luna");
		lblSarlLuna.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.setLayout(new MigLayout("", "[92px]", "[21px][grow][100px]"));
		
		JButton btnNewButton = new JButton("Quittez");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnNewButton, "cell 0 2,alignx center,aligny top");
		panel.add(lblSarlLuna, "cell 0 0,alignx left,aligny top");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[grow,center][grow,center][grow,center]", "[grow,center][grow,center][grow,center]"));
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Farticles frame = new Farticles();
				frame.setVisible(true);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Product-128.png")));
		panel_1.add(btnNewButton_4, "cell 1 0");
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fclients frame = new Fclients();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/People-128.png")));
		panel_1.add(btnNewButton_1, "cell 0 1");
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Diagram-128.png")));
		panel_1.add(btnNewButton_2, "cell 1 1");
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Shopping-Bag-128.png")));
		panel_1.add(btnNewButton_5, "cell 2 1");
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Settings-02-128.png")));
		panel_1.add(btnNewButton_3, "cell 1 2");
	}
}
