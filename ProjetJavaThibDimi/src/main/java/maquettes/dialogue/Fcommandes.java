package maquettes.dialogue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Connexions.Connexions;

import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Fcommandes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTextField txtDzd;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fcommandes frame = new Fcommandes(new Connexions("Luna","Luna"));
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
	public Fcommandes(Connexions con) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Fcommandes.class.getResource("/images/Moon-32.png")));
		setTitle("Gestion des commandes");
		setBounds(100, 100, 924, 734);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel FComPrinc = new JPanel();
		layeredPane.add(FComPrinc, "name_1909504033885967");
		FComPrinc.setLayout(new BorderLayout(0, 0));
		
		
		// PANEL 1 
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 140, 0));
		FComPrinc.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new MigLayout("", "[left]", "[100px][][][][][100px,bottom][][][grow,bottom]"));
		
		JLabel lblCommandes = new JLabel("Commande");
		lblCommandes.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/commande/Shopping-Bag-64-actif.png")));
		lblCommandes.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(lblCommandes, "cell 0 0");
		
		JButton btnNewButton = new JButton("Commandes existantes");
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/commande/Receipt-48.png")));
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(btnNewButton, "cell 0 1");
		
		JButton btnNewButton_1 = new JButton("Supprimer");
		
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(255, 140, 0));
		btnNewButton_1.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/Cancel-48.png")));
		btnNewButton_1.setBorder(null);
		panel_1.add(btnNewButton_1, "cell 0 2");
		
		JButton btnNewButton_2 = new JButton("Supprimer toutes les lignes");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(255, 140, 0));
		btnNewButton_2.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/Garbage-Open-48.png")));
		panel_1.add(btnNewButton_2, "cell 0 3");
		
		JButton btnNewButton_3 = new JButton("Valider la commande");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBackground(new Color(255, 140, 0));
		btnNewButton_3.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/commande/Shopping-Cart-05-48.png")));
		btnNewButton_3.setBorder(null);
		panel_1.add(btnNewButton_3, "cell 0 4");
		
		JButton btnNewButton_4 = new JButton("Aperçu");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(new Color(255, 140, 0));
		btnNewButton_4.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/Preview-48.png")));
		btnNewButton_4.setBorder(null);
		panel_1.add(btnNewButton_4, "cell 0 5");
		
		JButton btnNewButton_5 = new JButton("Imprimer");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_5.setBackground(new Color(255, 140, 0));
		btnNewButton_5.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/Printer-48.png")));
		btnNewButton_5.setBorder(null);
		panel_1.add(btnNewButton_5, "cell 0 6");
		
		JButton btnNewButton_6 = new JButton("Export");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(new Color(255, 140, 0));
		btnNewButton_6.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/Data-Export-48.png")));
		btnNewButton_6.setBorder(null);
		panel_1.add(btnNewButton_6, "cell 0 7");
		
		JButton btnNewButton_7 = new JButton("Accueil");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseFrame();
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setBackground(new Color(255, 140, 0));
		btnNewButton_7.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/Home-48.png")));
		btnNewButton_7.setBorder(null);
		panel_1.add(btnNewButton_7, "cell 0 8");
		// FIN PANEL 1
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 222, 173));
		FComPrinc.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new MigLayout("", "[grow]", "[150px][350px][grow]"));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 222, 173));
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(255, 140, 0), 2), "Informations g\u00E9n\u00E9rales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_2.add(panel_3, "cell 0 0,grow");
		panel_3.setLayout(new MigLayout("", "[150px,right][200px,grow][80px,right][grow]", "[][grow]"));
		
		JLabel lblCommande = new JLabel("Commande en cours");
		lblCommande.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(lblCommande, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		textField.setEditable(false);
		panel_3.add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(lblDate, "cell 2 0,alignx trailing");
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		panel_3.add(textField_1, "cell 3 0,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nom du client");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(lblNewLabel, "cell 0 1,alignx trailing");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selectionner un client"}));
		panel_3.add(comboBox, "cell 1 1 3 1,growx");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(255, 140, 0), 2), "Valeurs de la commande", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_4.setBackground(new Color(255, 222, 173));
		panel_2.add(panel_4, "cell 0 1,grow");
		panel_4.setLayout(new MigLayout("", "[200px,grow][80px,right][grow][100px,right][grow][]", "[40px,top][][80px][grow]"));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Selectionner une commande"}));
		comboBox_1.setToolTipText("");
		panel_4.add(comboBox_1, "cell 0 0,growx");
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblCode, "cell 1 0,alignx trailing");
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		panel_4.add(textField_2, "cell 2 0,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Catégorie");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		panel_4.add(lblNewLabel_1, "cell 3 0,alignx trailing");
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		panel_4.add(textField_3, "cell 4 0 2 1,growx");
		textField_3.setColumns(10);
		
		JLabel lblDsignation = new JLabel("Désignation");
		lblDsignation.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblDsignation, "flowx,cell 0 1");
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		panel_4.add(textField_4, "cell 0 1,growx");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Montant");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblNewLabel_2, "cell 1 1,alignx trailing");
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		panel_4.add(textField_5, "cell 2 1,growx");
		textField_5.setColumns(10);
		
		JLabel lblQuantit = new JLabel("Quantité");
		lblQuantit.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblQuantit, "cell 3 1,alignx trailing");
		
		JSpinner spinner = new JSpinner();
		panel_4.add(spinner, "cell 4 1 2 1,growx");
		
		JButton btnNewButton_8 = new JButton("Modifier");
		btnNewButton_8.setBackground(new Color(255, 222, 173));
		btnNewButton_8.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/Add-New-48.png")));
		btnNewButton_8.setBorder(null);
		panel_4.add(btnNewButton_8, "cell 0 2,alignx right");
		
		JButton btnNewButton_9 = new JButton("Modifier");
		btnNewButton_9.setBackground(new Color(255, 222, 173));
		btnNewButton_9.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/Data-Edit-48.png")));
		btnNewButton_9.setBorder(null);
		panel_4.add(btnNewButton_9, "cell 1 2 2 1,alignx center");
		
		JButton btnNewButton_10 = new JButton("Supprimer");
		btnNewButton_10.setBackground(new Color(255, 222, 173));
		btnNewButton_10.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/Cancel-48.png")));
		btnNewButton_10.setBorder(null);
		panel_4.add(btnNewButton_10, "cell 3 2");
		
		JScrollPane scrollPane = new JScrollPane();
		panel_4.add(scrollPane, "cell 0 3 6 1,grow");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Code", "Code catégorie", "Désignation", "Quantité", "Prix unitaire", "Total"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 222, 173));
		panel_2.add(panel_5, "cell 0 2,grow");
		panel_5.setLayout(new MigLayout("", "[300px,right][150px,left][50px][80px,right]", "[80px][]"));
		
		JLabel lblNewLabel_3 = new JLabel("Mode de réglement");
		lblNewLabel_3.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/commande/ATM-32.png")));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(lblNewLabel_3, "cell 0 0,alignx trailing");
		
		JComboBox comboBox_2 = new JComboBox();
		panel_5.add(comboBox_2, "cell 1 0,growx");
		
		txtDzd = new JTextField();
		txtDzd.setHorizontalAlignment(SwingConstants.CENTER);
		txtDzd.setBackground(new Color(255, 215, 0));
		txtDzd.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDzd.setText("0,00€");
		txtDzd.setEditable(false);
		panel_5.add(txtDzd, "cell 3 0,aligny center");
		txtDzd.setColumns(10);
		txtDzd.setBorder(new LineBorder(new Color(255, 140, 0), 3));
		
		JButton btnNewButton_11 = new JButton("Valider la commande");
		btnNewButton_11.setBackground(new Color(255, 222, 173));
		btnNewButton_11.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/commande/Shopping-Cart-05-48.png")));
		btnNewButton_11.setBorder(null);
		panel_5.add(btnNewButton_11, "cell 2 1 2 1,grow");
		
		JPanel FComTous = new JPanel();
		layeredPane.setLayer(FComTous, 1);
		layeredPane.add(FComTous, "name_1982934410928838");
		FComTous.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		FComTous.add(panel, BorderLayout.WEST);
		panel.setLayout(new MigLayout("", "[left]", "[100px][][][][][100px,bottom][][][grow,bottom]"));
		
		JLabel lblCommandes2 = new JLabel("Commande");
		lblCommandes2.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/commande/Shopping-Bag-64-actif.png")));
		lblCommandes2.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblCommandes2, "cell 0 0");
		
		
		JButton btnNewButton_12 = new JButton("Retour");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FComPrinc.setVisible(true);
				FComTous.setVisible(false);
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_12.setForeground(Color.WHITE);
		btnNewButton_12.setBackground(new Color(255, 140, 0));
		btnNewButton_12.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/Cancel-48.png")));
		btnNewButton_12.setBorder(null);
		panel.add(btnNewButton_12, "cell 0 8");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 222, 173));
		FComTous.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(new LineBorder(new Color(255, 140, 0), 2), "Toutes les commandes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_7.setBackground(new Color(255, 222, 173));
		panel_6.add(panel_7, "cell 0 0,grow");
		panel_7.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_7.add(scrollPane_1, "cell 0 0,grow");
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Code", "Code catégorie", "Désignation", "Quantité", "Prix unitaire", "Total"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JPanel FComSup = new JPanel();
		layeredPane.add(FComSup, "name_1984331761169496");
		FComSup.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 140, 0));
		panel_8.setLayout(new MigLayout("", "[left]", "[100px][][][][][100px,bottom][][][grow,bottom]"));
		FComSup.add(panel_8, BorderLayout.WEST);
		
		
		JLabel lblCommandes3 = new JLabel("Commande");
		lblCommandes3.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/commande/Shopping-Bag-64-actif.png")));
		lblCommandes3.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_8.add(lblCommandes3, "cell 0 0");
		
		
		JButton btnNewButton_14 = new JButton("Retour");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FComPrinc.setVisible(true);
				FComSup.setVisible(false);
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_14.setForeground(Color.WHITE);
		btnNewButton_14.setBackground(new Color(255, 140, 0));
		btnNewButton_14.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/Cancel-48.png")));
		btnNewButton_14.setBorder(null);
		panel_8.add(btnNewButton_14, "cell 0 8");
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 222, 173));
		FComSup.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(new LineBorder(new Color(255, 140, 0), 2), "Supprimer une commande", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_10.setBackground(new Color(255, 222, 173));
		panel_9.add(panel_10, "cell 0 0,grow");
		panel_10.setLayout(new MigLayout("", "[300px,right][100px][grow,right]", "[300px][300px,bottom]"));
		
		JLabel lblSelectionnerLaCommande = new JLabel("Selectionner la commande a supprimer");
		lblSelectionnerLaCommande.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_10.add(lblSelectionnerLaCommande, "cell 0 0,alignx trailing");
		
		JComboBox comboBox_3 = new JComboBox();
		panel_10.add(comboBox_3, "cell 1 0,growx");
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FComSup f = new FComSup();
				f.setVisible(true);
			}
		});
		btnSupprimer.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSupprimer.setIcon(new ImageIcon(Fcommandes.class.getResource("/images/gestion/Garbage-Open-48.png")));
		panel_10.add(btnSupprimer, "cell 2 1");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FComPrinc.setVisible(false);
				FComTous.setVisible(true);
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FComPrinc.setVisible(false);
				FComSup.setVisible(true);
			}
		});
	}
	
	public void CloseFrame(){
	    super.dispose();
	}

}
