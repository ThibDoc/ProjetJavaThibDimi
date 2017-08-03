package maquettes.dialogue;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import util.GlobalConnection;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLayeredPane;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import DAO.ClientsDAOMySQL;
import Entite.Clients;
import Entite.Commandes;
import Traitement.TraitementClients;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import java.awt.CardLayout;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Fclients extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField code;
	private JTextField date_creation;
	private JTextField prenom;
	private JTextField nom;
	private JTextField adresse;
	private JTextField code_postal;
	private JTextField ville;
	private JTextField fixe;
	private JTextField mobile;
	private JTextField email;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	public List<Clients> Rcli = new ArrayList<Clients>();

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Fclients() throws SQLException {
		Connection conn = null;
		conn = GlobalConnection.getInstance();
		
		
		
		ClientsDAOMySQL DAOClient = new  ClientsDAOMySQL();
		List<Clients> cli = new ClientsDAOMySQL().getAllClients(conn);
		TraitementClients traitementClients =  new TraitementClients(cli);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Fclients.class.getResource("/images/Moon-32.png")));
		setTitle("Gestion des clients");
		setBounds(100, 100, 845, 718);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
			
			JLayeredPane layeredPane = new JLayeredPane();
			contentPane.add(layeredPane, BorderLayout.CENTER);
				layeredPane.setLayout(new CardLayout(0, 0));
				
				/* --- Fenêtre principal ---- */
				
				JPanel FClient = new JPanel(); // panel principal
				layeredPane.setLayer(FClient, 1);
				layeredPane.add(FClient, "name_11438638148150");
				FClient.setLayout(new BorderLayout(0, 0));
				
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(new Color(135, 206, 250));
				FClient.add(panel_1, BorderLayout.CENTER);
				panel_1.setLayout(new MigLayout("", "[grow]", "[grow 50][grow][]"));
				
				JPanel panel_2 = new JPanel();
				panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				panel_2.setBackground(new Color(135, 206, 250));
				panel_1.add(panel_2, "cell 0 0,grow");
				panel_2.setLayout(new MigLayout("", "[grow 20][grow][grow 20][grow]", "[grow][grow][grow][grow][grow][grow]"));
				
				JLabel lblNewLabel_1 = new JLabel("Code");
				panel_2.add(lblNewLabel_1, "cell 0 0,alignx trailing");
				
				textField = new JTextField();
				panel_2.add(textField, "cell 1 0,growx");
				textField.setColumns(10);
				
				JLabel lblNewLabel_7 = new JLabel("Cr\u00E9\u00E9 le");
				panel_2.add(lblNewLabel_7, "cell 2 0,alignx trailing");
				
				textField_5 = new JTextField();
				panel_2.add(textField_5, "cell 3 0,growx");
				textField_5.setColumns(10);
				
				JLabel lblNewLabel_2 = new JLabel("Pr\u00E9nom");
				panel_2.add(lblNewLabel_2, "cell 0 1,alignx trailing");
				
				textField_1 = new JTextField();
				panel_2.add(textField_1, "cell 1 1,growx");
				textField_1.setColumns(10);
				
				JLabel lblNewLabel_8 = new JLabel("Nom");
				panel_2.add(lblNewLabel_8, "cell 2 1,alignx trailing");
				
				textField_6 = new JTextField();
				panel_2.add(textField_6, "cell 3 1,growx");
				textField_6.setColumns(10);
				
				JLabel lblNewLabel_3 = new JLabel("Adresse");
				panel_2.add(lblNewLabel_3, "cell 0 2,alignx trailing");
				
				textField_2 = new JTextField();
				panel_2.add(textField_2, "cell 1 2 3 1,growx");
				textField_2.setColumns(10);
				
				JLabel lblNewLabel_4 = new JLabel("Fixe");
				panel_2.add(lblNewLabel_4, "cell 0 3,alignx trailing");
				
				textField_3 = new JTextField();
				panel_2.add(textField_3, "cell 1 3,growx");
				textField_3.setColumns(10);
				
				JLabel lblNewLabel_9 = new JLabel("Mobile");
				panel_2.add(lblNewLabel_9, "cell 2 3,alignx trailing");
				
					textField_7 = new JTextField();
					panel_2.add(textField_7, "cell 3 3,growx");
					textField_7.setColumns(10);
					
					JLabel lblNewLabel_5 = new JLabel("Email");
					panel_2.add(lblNewLabel_5, "cell 0 4,alignx trailing");
					
					textField_4 = new JTextField();
					panel_2.add(textField_4, "cell 1 4,growx");
					textField_4.setColumns(10);
					
					JCheckBox chckbxNewCheckBox = new JCheckBox("Carte fid\u00E9lit\u00E9");
					chckbxNewCheckBox.setBackground(new Color(135, 206, 250));
					panel_2.add(chckbxNewCheckBox, "flowx,cell 3 4");
					
					JLabel lblNewLabel_6 = new JLabel("Remarque");
					lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
					panel_2.add(lblNewLabel_6, "cell 0 5,alignx right");
					
					JScrollPane scrollPane_3 = new JScrollPane();
					panel_2.add(scrollPane_3, "cell 1 5 3 1,grow");
					
					JTextArea textArea = new JTextArea();
					scrollPane_3.setViewportView(textArea);
					textArea.setLineWrap(true);
					
					
					JScrollPane scrollPane = new JScrollPane();
					panel_1.add(scrollPane, "cell 0 1,grow");
					
					table_1 = new JTable();
					table_1.setModel(new DefaultTableModel(
							traitementClients.TableauAllClient(),
						new String[] {
							"Code", "Nom", "Prenom", "Carte fidélité", "Date de création"
						}
					));
					scrollPane.setViewportView(table_1);
					
				
					
					table_1.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt){
							Connection connec = null;
							try {
								connec = GlobalConnection.getInstance();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							List<Clients> clii = new ClientsDAOMySQL().getAllClients(connec);
							int numLigne = table_1.getSelectedRow();
							if(numLigne >=0 ){
								Clients result = clii.get(numLigne);
								String code = Integer.toString(result.getCode());
								String fixe = Integer.toString(result.getFixe());
								String mobile = Integer.toString(result.getMobile());
								String date_creation =result.getDate_creation();
								
								textField.setText(code);
								textField_1.setText(result.getPrenom());
								textField_2.setText(result.getAdresse());
								textField_3.setText(fixe);
								textField_4.setText(result.getEmail());
								textField_5.setText(date_creation);
								textField_6.setText(result.getNom());
								textField_7.setText(mobile);
								textArea.setText(result.getRemarques());
								if(result.getCarte_fidelite()==1){
									chckbxNewCheckBox.setSelected(true);
								}
								else chckbxNewCheckBox.setSelected(false);
							}
						}
					});
					
					
					JLabel lblNewLabel_10 = new JLabel("Trier la liste par");
					lblNewLabel_10.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Sort-Ascending-32.png")));
					panel_1.add(lblNewLabel_10, "flowx,cell 0 2,alignx left");
					
					JComboBox comboBox = new JComboBox();
					comboBox.setModel(new DefaultComboBoxModel(new String[] {"zae", "ezzae", "eazzae", "azaze"}));
					panel_1.add(comboBox, "cell 0 2");
					
					JPanel panel = new JPanel();
					FClient.add(panel, BorderLayout.WEST);
					panel.setBorder(new EmptyBorder(5, 5, 5, 5));
					panel.setBackground(new Color(30, 144, 255));
					panel.setLayout(new MigLayout("", "[left]", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow]"));
					
					JLabel lblNewLabel = new JLabel("Clients");
					lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
					lblNewLabel.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/client/People-64-actif.png")));
					panel.add(lblNewLabel, "cell 0 0,alignx left,aligny top");
					
					
					
					
					
					
					
					
					
					JButton btnNewButton_5 = new JButton("Aper\u00E7u");
					btnNewButton_5.setBackground(new Color(30, 144, 255));
					btnNewButton_5.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Preview-48.png")));
					btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
					btnNewButton_5.setBorder(null);
					panel.add(btnNewButton_5, "cell 0 6,alignx left");
					
					JButton btnNewButton_6 = new JButton("Imprimer");
					btnNewButton_6.setBackground(new Color(30, 144, 255));
					btnNewButton_6.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Printer-48.png")));
					btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
					btnNewButton_6.setBorder(null);
					panel.add(btnNewButton_6, "cell 0 7,alignx left");
					
					JButton btnNewButton_7 = new JButton("Export");
					btnNewButton_7.setBackground(new Color(30, 144, 255));
					btnNewButton_7.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Data-Export-48.png")));
					btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 12));
					btnNewButton_7.setBorder(null);
					panel.add(btnNewButton_7, "cell 0 8,alignx left,aligny center");
					
					JButton btnNewButton_4 = new JButton("Accueil");
					btnNewButton_4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							CloseFrame();
						}
					});
					btnNewButton_4.setBackground(new Color(30, 144, 255));
					btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
					btnNewButton_4.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Home-48.png")));
					btnNewButton_4.setBorder(null);
					panel.add(btnNewButton_4, "cell 0 10,alignx left,aligny center");
					
					JPanel FCRecherche = new JPanel();
					layeredPane.setLayer(FCRecherche, 4);
					layeredPane.add(FCRecherche, "name_13820692107793");
					FCRecherche.setLayout(new BorderLayout(0, 0));
					
					JPanel panel_4 = new JPanel();
					panel_4.setBackground(new Color(30, 144, 255));
					FCRecherche.add(panel_4, BorderLayout.WEST);
					panel_4.setLayout(new MigLayout("", "[46px]", "[14px][][][][][][][][][][][][][][][][][][][][][]"));
					
					JLabel lblNewLabel_14 = new JLabel("Recherche");
					lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 18));
					lblNewLabel_14.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/client/User-Find-64.png")));
					panel_4.add(lblNewLabel_14, "cell 0 0,alignx left,aligny top");
					
					JButton btnAperu_1 = new JButton("Aperçu");
					btnAperu_1.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Preview-48.png")));
					panel_4.add(btnAperu_1, "cell 0 7");
					
					JButton btnNewButton_11 = new JButton("Imprimer");
					panel_4.add(btnNewButton_11, "cell 0 8");
					
					JButton btnExport_1 = new JButton("Export");
					panel_4.add(btnExport_1, "cell 0 9");
					
					
					
					JPanel panel_3 = new JPanel();
					panel_3.setBackground(new Color(135, 206, 235));
					FCRecherche.add(panel_3, BorderLayout.CENTER);
					panel_3.setLayout(new MigLayout("", "[grow]", "[grow 20][grow][grow][50px]"));
					
					JPanel panel_11 = new JPanel();
					panel_11.setBackground(SystemColor.activeCaptionBorder);
					panel_3.add(panel_11, "cell 0 0,grow");
					panel_11.setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[grow][grow][grow]"));
					
					JLabel lblCode = new JLabel("Code");
					panel_11.add(lblCode, "cell 0 0,alignx trailing");
					
					textField_18 = new JTextField();
					panel_11.add(textField_18, "cell 1 0,growx");
					textField_18.setColumns(10);
					
					JCheckBox chckbxCarteDeFidlit_1 = new JCheckBox("Carte de fidélité");
					panel_11.add(chckbxCarteDeFidlit_1, "cell 3 0,alignx center");
					
					JLabel lblNom_1 = new JLabel("Nom");
					panel_11.add(lblNom_1, "cell 0 1,alignx trailing");
					
					textField_19 = new JTextField();
					panel_11.add(textField_19, "cell 1 1,growx");
					textField_19.setColumns(10);
					
					JLabel lblPrenom_1 = new JLabel("Prenom");
					panel_11.add(lblPrenom_1, "cell 2 1,alignx trailing");
					
					textField_20 = new JTextField();
					panel_11.add(textField_20, "cell 3 1,growx");
					textField_20.setColumns(10);
					
					table_2 = new JTable();
					table_2.setModel(new DefaultTableModel(
						new Object[][] {
							{null, null, null, null, null},
						},
						new String[] {
							"Code", "Nom", "Prenom", "Carte fidélité", "Date de création"
						}
					));
					
					
					
					JButton button = new JButton("Rechercher");
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							Connection connecti = null;
							
							try {
								connecti = GlobalConnection.getInstance();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							int id;
							if(textField_18.getText().equals("") ){ id = 0;}
							else { id = Integer.parseInt((textField_18.getText())); }
							String nom = textField_19.getText();
							String prenom = textField_20.getText();
							
							int AjoutCarte_fidelite;
							
							if(chckbxCarteDeFidlit_1.isSelected()){
								AjoutCarte_fidelite = 1;
							}
							else{  AjoutCarte_fidelite = 0;}
							
							List<Clients> Rcli = new ClientsDAOMySQL().getClients(id, prenom, nom, AjoutCarte_fidelite, connecti);
							setRClients(Rcli);
							
							
							TraitementClients traitementClients =  new TraitementClients(getRClients());
							table_2.setModel(new DefaultTableModel(
									traitementClients.TableauAllClient(),
								new String[] {
									"Code", "Nom", "Prenom", "Carte fidélité", "Date de création"
								}
							));
						}
					});
					
					
					button.setFont(new Font("Tahoma", Font.BOLD, 12));
					button.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Search-32.png")));
					panel_11.add(button, "cell 1 2 2 1,grow");
					
					JPanel panel_16 = new JPanel();
					panel_3.add(panel_16, "cell 0 1,grow");
					panel_16.setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow][grow][grow]"));
					
					JLabel lblCode_2 = new JLabel("Code");
					panel_16.add(lblCode_2, "cell 0 0,alignx trailing");
					
					textField_32 = new JTextField();
					panel_16.add(textField_32, "cell 1 0,growx");
					textField_32.setColumns(10);
					
					JLabel lblCrLe = new JLabel("Créé le");
					panel_16.add(lblCrLe, "cell 2 0,alignx trailing");
					
					textField_37 = new JTextField();
					panel_16.add(textField_37, "cell 3 0,growx");
					textField_37.setColumns(10);
					
					JLabel lblNom_3 = new JLabel("Nom");
					panel_16.add(lblNom_3, "cell 0 1,alignx trailing");
					
					textField_33 = new JTextField();
					panel_16.add(textField_33, "cell 1 1,growx");
					textField_33.setColumns(10);
					
					JLabel lblPrenom_3 = new JLabel("Prenom");
					panel_16.add(lblPrenom_3, "cell 2 1,alignx trailing");
					
					textField_38 = new JTextField();
					panel_16.add(textField_38, "cell 3 1,growx");
					textField_38.setColumns(10);
					
					JLabel lblAdresse_1 = new JLabel("Adresse");
					panel_16.add(lblAdresse_1, "cell 0 2,alignx trailing");
					
					textField_34 = new JTextField();
					panel_16.add(textField_34, "cell 1 2 3 1,growx");
					textField_34.setColumns(10);
					
					JLabel lblFixe_1 = new JLabel("Fixe");
					panel_16.add(lblFixe_1, "cell 0 3,alignx trailing");
					
					textField_35 = new JTextField();
					panel_16.add(textField_35, "cell 1 3,growx");
					textField_35.setColumns(10);
					
					JLabel lblMobile_1 = new JLabel("Mobile");
					panel_16.add(lblMobile_1, "cell 2 3,alignx trailing");
					
					textField_39 = new JTextField();
					panel_16.add(textField_39, "cell 3 3,growx");
					textField_39.setColumns(10);
					
					JLabel lblEmail_1 = new JLabel("Email");
					panel_16.add(lblEmail_1, "cell 0 4,alignx trailing");
					
					textField_36 = new JTextField();
					panel_16.add(textField_36, "cell 1 4 3 1,growx");
					textField_36.setColumns(10);
					
					JLabel lblRemarques = new JLabel("Remarques");
					panel_16.add(lblRemarques, "cell 0 5,alignx right");
					
					JTextArea textArea_3 = new JTextArea();
					panel_16.add(textArea_3, "cell 1 5 3 3,grow");
					
					JScrollPane scrollPane_1 = new JScrollPane();
					panel_3.add(scrollPane_1, "cell 0 2,grow");
					
					scrollPane_1.setViewportView(table_2);
					
					JLabel lblTrierLaListe = new JLabel("Trier la liste par");
					lblTrierLaListe.setVerticalAlignment(SwingConstants.BOTTOM);
					lblTrierLaListe.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Sort-Ascending-32.png")));
					panel_3.add(lblTrierLaListe, "flowx,cell 0 3,aligny center");
					
					JComboBox comboBox_1 = new JComboBox();
					panel_3.add(comboBox_1, "cell 0 3");
					
					/* --- Fin fenêtre principal ---- */
					
					JPanel FCModifier = new JPanel();
					layeredPane.add(FCModifier, "name_15745152809402");
					FCModifier.setLayout(new BorderLayout(0, 0));
					
					JPanel panel_12 = new JPanel();
					panel_12.setBackground(new Color(30, 144, 255));
					FCModifier.add(panel_12, BorderLayout.WEST);
					panel_12.setLayout(new MigLayout("", "[142px]", "[64px][][][][][][][][][][][][][][][][]"));
					
					JLabel lblSupprimer = new JLabel("Modifier");
					lblSupprimer.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/client/User-Modify-64.png")));
					lblSupprimer.setFont(new Font("Tahoma", Font.BOLD, 18));
					panel_12.add(lblSupprimer, "cell 0 0,alignx left,aligny top");
					
					
					JButton btnNewButton_13 = new JButton("Enregistrer");
					
					btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 12));
					btnNewButton_13.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Save-48.png")));
					btnNewButton_13.setSelectedIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Save-48.png")));
					panel_12.add(btnNewButton_13, "cell 0 2");
					
					
					JButton btnSupprimer = new JButton("Supprimer");
					
					btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 12));
					btnSupprimer.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Garbage-Open-48.png")));
					
					
					panel_12.add(btnSupprimer, "cell 0 3");
					
					JButton btnAnnuler = new JButton("Annuler");
					panel_12.add(btnAnnuler, "cell 0 13");
					btnAnnuler.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							FCModifier.setVisible(false);
							FClient.setVisible(true);
						}
					});
					btnAnnuler.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Cancel-48.png")));
					
					
					
					JPanel panel_13 = new JPanel();
					panel_13.setBackground(new Color(135, 206, 235));
					FCModifier.add(panel_13, BorderLayout.CENTER);
					panel_13.setLayout(new MigLayout("", "[grow]", "[grow 20][grow 50][grow]"));
					
					JPanel panel_15 = new JPanel();
					panel_13.add(panel_15, "cell 0 0,grow");
					panel_15.setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[grow][grow][grow]"));
					
					JLabel lblNom_2 = new JLabel("Nom");
					panel_15.add(lblNom_2, "cell 0 0,alignx trailing");
					
					textField_29 = new JTextField();
					panel_15.add(textField_29, "cell 1 0,growx");
					textField_29.setColumns(10);
					
					JLabel lblPrenom_2 = new JLabel("Prenom");
					panel_15.add(lblPrenom_2, "cell 2 0,alignx trailing");
					
					textField_30 = new JTextField();
					panel_15.add(textField_30, "cell 3 0,growx");
					textField_30.setColumns(10);
					
					JLabel lblCode_1 = new JLabel("Code");
					panel_15.add(lblCode_1, "cell 0 1,alignx trailing");
					
					textField_31 = new JTextField();
					panel_15.add(textField_31, "cell 1 1,growx");
					textField_31.setColumns(10);
					
					JCheckBox chckbxCarteDeFidlit_2 = new JCheckBox("Carte de fidélité");
					panel_15.add(chckbxCarteDeFidlit_2, "cell 3 1");
					
					JButton btnNewButton_14 = new JButton("Rechercher");
					btnNewButton_14.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							Connection connectio = null;
							
							try {
								connectio = GlobalConnection.getInstance();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							int id;
							if(textField_31.getText().equals("") ){ id = 0;}
							else { id = Integer.parseInt((textField_18.getText())); }
							String nom = textField_29.getText();
							String prenom = textField_30.getText();
							
							int AjoutCarte_fidelite;
							
							if(chckbxCarteDeFidlit_2.isSelected()){
								AjoutCarte_fidelite = 1;
							}
							else{  AjoutCarte_fidelite = 0;}
							
							List<Clients> AScli = new ClientsDAOMySQL().getClients(id, prenom, nom, AjoutCarte_fidelite, connectio);
							setRClients(AScli);
							
							
							TraitementClients traitementClients =  new TraitementClients(getRClients());
							table.setModel(new DefaultTableModel(
									traitementClients.TableauAllClient(),
								new String[] {
									"Code", "Nom", "Prenom", "Carte fidélité", "Date de création"
								}
							));
						}
					});
					btnNewButton_14.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Search-32.png")));
					btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 12));
					btnNewButton_14.setSelectedIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Search-32.png")));
					panel_15.add(btnNewButton_14, "cell 1 2 2 1,grow");
					
					JPanel panel_14 = new JPanel();
					panel_14.setBackground(new Color(135, 206, 235));
					panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
					panel_13.add(panel_14, "cell 0 1,grow");
					panel_14.setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow]"));
					
					JLabel label = new JLabel("Code");
					panel_14.add(label, "cell 0 0,alignx right,aligny center");
					
					textField_21 = new JTextField();
					textField_21.setColumns(10);
					panel_14.add(textField_21, "cell 1 0,growx,aligny center");
					
					JLabel label_1 = new JLabel("Créé le");
					panel_14.add(label_1, "cell 2 0,alignx left,aligny center");
					
					textField_22 = new JTextField();
					textField_22.setColumns(10);
					panel_14.add(textField_22, "cell 3 0,growx,aligny center");
					
					JLabel label_2 = new JLabel("Prénom");
					panel_14.add(label_2, "cell 0 1,alignx right,aligny center");
					
					textField_23 = new JTextField();
					textField_23.setColumns(10);
					panel_14.add(textField_23, "cell 1 1,growx,aligny center");
					
					JLabel label_3 = new JLabel("Nom");
					panel_14.add(label_3, "cell 2 1,alignx right,aligny center");
					
					textField_24 = new JTextField();
					textField_24.setColumns(10);
					panel_14.add(textField_24, "cell 3 1,growx,aligny center");
					
					JLabel label_4 = new JLabel("Adresse");
					panel_14.add(label_4, "cell 0 2,alignx right,aligny center");
					
					textField_25 = new JTextField();
					textField_25.setColumns(10);
					panel_14.add(textField_25, "cell 1 2 3 1,growx");
					
					JLabel label_5 = new JLabel("Fixe");
					panel_14.add(label_5, "cell 0 3,alignx right,aligny center");
					
					textField_26 = new JTextField();
					textField_26.setColumns(10);
					panel_14.add(textField_26, "cell 1 3,growx,aligny center");
					
					JLabel label_6 = new JLabel("Mobile");
					panel_14.add(label_6, "cell 2 3,alignx right,aligny center");
					
					textField_27 = new JTextField();
					textField_27.setColumns(10);
					panel_14.add(textField_27, "cell 3 3,growx,aligny center");
					
					JLabel label_7 = new JLabel("Email");
					panel_14.add(label_7, "cell 0 4,alignx right,aligny center");
					
					textField_28 = new JTextField();
					textField_28.setColumns(10);
					panel_14.add(textField_28, "cell 1 4,growx,aligny center");
					
					JCheckBox checkBox = new JCheckBox("Carte fidélité");
					checkBox.setBackground(new Color(135, 206, 250));
					panel_14.add(checkBox, "cell 3 4,alignx left,aligny top");
					
					JLabel label_8 = new JLabel("Remarque");
					label_8.setHorizontalAlignment(SwingConstants.RIGHT);
					panel_14.add(label_8, "cell 0 5,alignx left,aligny center");
					
					JScrollPane scrollPane_4 = new JScrollPane();
					panel_14.add(scrollPane_4, "cell 1 5,grow");
					
					JTextArea textArea_2 = new JTextArea();
					scrollPane_4.setViewportView(textArea_2);
					textArea_2.setLineWrap(true);
					
					JScrollPane scrollPane_2 = new JScrollPane();
					panel_13.add(scrollPane_2, "cell 0 2,grow");
					
					table = new JTable();
					table.setModel(new DefaultTableModel(
						new Object[][] {
							{null, null, null, null, null},
						},
						new String[] {
							"Code", "Nom", "Prenom", "Carte Fidélité", "Date de création"
						}
					));
					scrollPane_2.setViewportView(table);
					
					JPanel FCAjout = new JPanel(); // panel ajout
					layeredPane.setLayer(FCAjout, 2);
					layeredPane.add(FCAjout, "name_11438623287941");
					FCAjout.setLayout(new BorderLayout(0, 0));
					
					JPanel panel_5 = new JPanel();
					panel_5.setBackground(new Color(30, 144, 255));
					FCAjout.add(panel_5, BorderLayout.WEST);
					panel_5.setLayout(new MigLayout("", "[117px]", "[64px][][][][][][][][grow,center][center][center][][][][][][][][][][]"));
					
					JLabel lblNewLabel_11 = new JLabel("Ajout");
					lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 18));
					lblNewLabel_11.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/client/User-Add-64.png")));
					panel_5.add(lblNewLabel_11, "cell 0 0,alignx left,aligny top");
					
					JButton btnNewButton_8 = new JButton("Sauvegarder");
					
					btnNewButton_8.setBackground(new Color(30, 144, 255));
					btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 12));
					btnNewButton_8.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Save-48.png")));
					panel_5.add(btnNewButton_8, "cell 0 2,alignx center");
					
					JButton btnAperu = new JButton("Aperçu");
					btnAperu.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Search-32.png")));
					btnAperu.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						}
					});
					btnAperu.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_5.add(btnAperu, "cell 0 8,alignx left,aligny center");
					
					JButton btnImprimer = new JButton("Imprimer");
					btnImprimer.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_5.add(btnImprimer, "cell 0 9,alignx left");
					
					
					
					
					
					JPanel panel_6 = new JPanel();
					FCAjout.add(panel_6, BorderLayout.CENTER);
					panel_6.setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[grow 10][grow 30][grow 20][grow 40]"));
					
					JPanel panel_7 = new JPanel();
					panel_7.setBorder(new TitledBorder(null, "Client", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panel_6.add(panel_7, "cell 0 0 4 1,grow");
					panel_7.setLayout(new MigLayout("", "[grow][grow][grow][grow][grow]", "[grow]"));
					
					JLabel lblNewLabel_12 = new JLabel("Code");
					panel_7.add(lblNewLabel_12, "cell 0 0,alignx trailing");
					
					code = new JTextField();
					panel_7.add(code, "cell 1 0,growx");
					code.setColumns(10);
					
					JLabel lblNewLabel_13 = new JLabel("Créé le");
					panel_7.add(lblNewLabel_13, "cell 2 0,alignx trailing");
					
					date_creation = new JTextField();
					panel_7.add(date_creation, "cell 3 0,growx");
					date_creation.setColumns(10);
					
					JCheckBox carte_fidelite = new JCheckBox("Carte de fidélité");
					carte_fidelite.setHorizontalAlignment(SwingConstants.CENTER);
					panel_7.add(carte_fidelite, "cell 4 0,alignx center");
					
					JPanel panel_8 = new JPanel();
					panel_8.setBorder(new TitledBorder(null, "Etat Civil", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panel_6.add(panel_8, "cell 0 1 4 1,grow");
					panel_8.setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[grow][grow][grow]"));
					
					JLabel lblPrenom = new JLabel("Prénom");
					panel_8.add(lblPrenom, "cell 0 0,alignx trailing");
					
					prenom = new JTextField();
					panel_8.add(prenom, "cell 1 0,growx");
					prenom.setColumns(10);
					
					JLabel lblNom = new JLabel("Nom");
					panel_8.add(lblNom, "cell 2 0,alignx trailing");
					
					nom = new JTextField();
					panel_8.add(nom, "cell 3 0,growx");
					nom.setColumns(10);
					
					JLabel lblAdresse = new JLabel("Adresse");
					panel_8.add(lblAdresse, "cell 0 1,alignx trailing");
					
					adresse = new JTextField();
					panel_8.add(adresse, "cell 1 1 3 1,growx");
					adresse.setColumns(10);
					
					JLabel lblCodePostal = new JLabel("Code postal");
					panel_8.add(lblCodePostal, "cell 0 2,alignx trailing");
					
					code_postal = new JTextField();
					panel_8.add(code_postal, "cell 1 2,growx");
					code_postal.setColumns(10);
					
					JLabel lblVille = new JLabel("Ville");
					panel_8.add(lblVille, "cell 2 2,alignx trailing");
					
					ville = new JTextField();
					panel_8.add(ville, "cell 3 2,growx");
					ville.setColumns(10);
					
					JPanel panel_9 = new JPanel();
					panel_9.setBorder(new TitledBorder(null, "Coordonn\u00E9s", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panel_6.add(panel_9, "cell 0 2 4 1,grow");
					panel_9.setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[grow][grow]"));
					
					JLabel lblFixe = new JLabel("Fixe");
					panel_9.add(lblFixe, "cell 0 0,alignx trailing");
					
					fixe = new JTextField();
					panel_9.add(fixe, "cell 1 0,growx");
					fixe.setColumns(10);
					
					JLabel lblMobile = new JLabel("Mobile");
					panel_9.add(lblMobile, "cell 2 0,alignx trailing");
					
					mobile = new JTextField();
					panel_9.add(mobile, "cell 3 0,growx");
					mobile.setColumns(10);
					
					JLabel lblEmail = new JLabel("Email");
					panel_9.add(lblEmail, "cell 0 1,alignx trailing");
					
					email = new JTextField();
					panel_9.add(email, "cell 1 1 3 1,growx");
					email.setColumns(10);
					
					JPanel panel_10 = new JPanel();
					panel_10.setBorder(new TitledBorder(null, "Remarques", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panel_6.add(panel_10, "cell 0 3 4 1,grow");
					panel_10.setLayout(new MigLayout("", "[grow]", "[grow]"));
					
					JTextArea remarques = new JTextArea();
					panel_10.add(remarques, "cell 0 0,grow");
					
					JButton btnExport = new JButton("Export");
					btnExport.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel_5.add(btnExport, "cell 0 10,alignx left");
					
					JButton btnNewButton = new JButton("Ajouter");
					btnNewButton.setBackground(new Color(30, 144, 255));
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							FClient.setVisible(false);
							FCAjout.setVisible(true);
						}
					});
					btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
					btnNewButton.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Add-New-48.png")));
					btnNewButton.setBorder(null);	
					panel.add(btnNewButton, "cell 0 1,alignx left,aligny center");
					
					JButton btnNewButton_3 = new JButton("Supprimer");
					btnNewButton_3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							FCModifier.setVisible(true);
							FClient.setVisible(false);
							
						}
					});
					btnNewButton_3.setBackground(new Color(30, 144, 255));
					btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
					btnNewButton_3.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Garbage-Open-48.png")));
					btnNewButton_3.setBorder(null);
					panel.add(btnNewButton_3, "cell 0 4,alignx left,aligny center");
					
					JButton btnNewButton_1 = new JButton("Rechercher");
					btnNewButton_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							FCRecherche.setVisible(true);
							FClient.setVisible(false);
							
						}
					});
					btnNewButton_1.setBackground(new Color(30, 144, 255));
					btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
					btnNewButton_1.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Search-48.png")));
					btnNewButton_1.setBorder(null);
					panel.add(btnNewButton_1, "cell 0 2,alignx left,aligny center");
					
					JButton btnNewButton_2 = new JButton("Modifier");
					btnNewButton_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							FCModifier.setVisible(true);
							FClient.setVisible(false);
							
						}
					});
					btnNewButton_2.setBackground(new Color(30, 144, 255));
					btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
					btnNewButton_2.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Data-Edit-48.png")));
					btnNewButton_2.setBorder(null);
					panel.add(btnNewButton_2, "cell 0 3,alignx left,aligny center");
					
					JButton btnNewButton_12 = new JButton("Annuler");
					btnNewButton_12.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							FCRecherche.setVisible(false);
							FClient.setVisible(true);
							
						}
					});
					btnNewButton_12.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Cancel-48.png")));
					panel_4.add(btnNewButton_12, "cell 0 21");
					
					
					JButton btnNewButton_9 = new JButton("Annuler");
					btnNewButton_9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							FCAjout.setVisible(false);
							FClient.setVisible(true);
						}
					});
					btnNewButton_9.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Cancel-48.png")));
					panel_5.add(btnNewButton_9, "cell 0 20,alignx left");
					
					layeredPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel_1, panel_1, FClient, panel_2, textField, lblNewLabel_7, textField_5, lblNewLabel_2, textField_1, lblNewLabel_8, textField_6, lblNewLabel_3, textField_2, lblNewLabel_4, textField_3, lblNewLabel_9, textField_7, lblNewLabel_5, textField_4, chckbxNewCheckBox, lblNewLabel_6, textArea, scrollPane, lblNewLabel_10, comboBox, panel, lblNewLabel, btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_3, btnNewButton_5, btnNewButton_6, btnNewButton_7, btnNewButton_4}));

					btnNewButton_8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							Connection conne = null;
							try {
								conne = GlobalConnection.getInstance();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							String ajoutNom = nom.getText();
							String ajoutPrenom = prenom.getText();
							String ajoutAdresse = adresse.getText();
							String ajoutEmail = email.getText();
							int AjoutMobile = Integer.parseInt(mobile.getText());
							int AjoutFixe = Integer.parseInt(fixe.getText());
							String AjouteDate_creation = date_creation.getText();
							String AjoutRemarques = remarques.getText();
							
							int AjoutCarte_fidelite;
							
							if(carte_fidelite.isSelected()){
								AjoutCarte_fidelite = 1;
							}
							else{  AjoutCarte_fidelite = 0;}
							
							List<Commandes> list= new ArrayList<Commandes>();
							
							Clients newClient = new Clients(AjouteDate_creation, ajoutPrenom, ajoutNom, ajoutAdresse, AjoutFixe, AjoutMobile, ajoutEmail, AjoutRemarques, AjoutCarte_fidelite, list);
							
							
							
							DAOClient.insertClients(newClient, conne);
							List<Clients> cli = new ClientsDAOMySQL().getAllClients(conne);
							TraitementClients traitementClients =  new TraitementClients(cli);
							table_1.setModel(new DefaultTableModel(
									traitementClients.TableauAllClient(),
								new String[] {
									"Code", "Nom", "Prenom", "Carte fidélité", "Date de création"
								}
							));
						}
					});
					
					table_2.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt){

							int numLigne = table_2.getSelectedRow();
							if(numLigne >=0 ){
								Clients result = getRClients().get(numLigne);
								String code = Integer.toString(result.getCode());
								String fixe = Integer.toString(result.getFixe());
								String mobile = Integer.toString(result.getMobile());
								String date_creation =result.getDate_creation();
								
								textField_32.setText(code);
								textField_38.setText(result.getPrenom());
								textField_34.setText(result.getAdresse());
								textField_35.setText(fixe);
								textField_36.setText(result.getEmail());
								textField_37.setText(date_creation);
								textField_33.setText(result.getNom());
								textField_39.setText(mobile);
								textArea_3.setText(result.getRemarques());
								if(result.getCarte_fidelite()==1){
									chckbxCarteDeFidlit_1.setSelected(true);
								}
								else chckbxCarteDeFidlit_1.setSelected(false);
							}
						}
					});
					
					table.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt){
							
							int numLigne = table.getSelectedRow();
							if(numLigne >=0 ){
								Clients result = getRClients().get(numLigne);
								String code = Integer.toString(result.getCode());
								String fixe = Integer.toString(result.getFixe());
								String mobile = Integer.toString(result.getMobile());
								String date_creation =result.getDate_creation();
								
								textField_21.setText(code);
								textField_23.setText(result.getPrenom());
								textField_25.setText(result.getAdresse());
								textField_26.setText(fixe);
								textField_28.setText(result.getEmail());
								textField_22.setText(date_creation);
								textField_24.setText(result.getNom());
								textField_27.setText(mobile);
								textArea_2.setText(result.getRemarques());
								if(result.getCarte_fidelite()==1){
									checkBox.setSelected(true);
								}
								else checkBox.setSelected(false);
							}
						}
					});
					
					btnNewButton_13.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							
							Connection connection = null;
							try {
								connection = GlobalConnection.getInstance();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							int code = Integer.parseInt(textField_21.getText());
							String updateNom = textField_24.getText();
							String updatePrenom = textField_23.getText();
							String updateAdresse = textField_25.getText();
							String updateEmail = textField_28.getText();
							int updateMobile = Integer.parseInt(textField_27.getText());
							int updateFixe = Integer.parseInt(textField_26.getText());
							String updateDate_creation = textField_22.getText();
							String updateRemarques = textArea_2.getText();
							
							
							
							int UpdateCarte_fidelite;
							
							if(checkBox.isSelected()){
								UpdateCarte_fidelite = 1;
							}
							else{  UpdateCarte_fidelite = 0;}
							
							List<Commandes> list= new ArrayList<Commandes>();
							
							Clients newClient = new Clients(updateDate_creation, updatePrenom, updateNom, updateAdresse, updateFixe, updateMobile, updateEmail, updateRemarques, UpdateCarte_fidelite, list);
							
							int id;
							if(textField_18.getText().equals("") ){ id = 0;}
							else { id = Integer.parseInt((textField_18.getText())); }
							String nom = textField_29.getText();
							String prenom = textField_30.getText();
							
							int AjoutCarte_fidelite;
							
							if(chckbxCarteDeFidlit_2.isSelected()){
								AjoutCarte_fidelite = 1;
							}
							else{  AjoutCarte_fidelite = 0;}
							
							DAOClient.updateClients(newClient,code, connection);
							
							List<Clients> AScli = new ClientsDAOMySQL().getClients(id, prenom, nom, AjoutCarte_fidelite, connection);
							setRClients(AScli);
							
							
							TraitementClients traitementClients =  new TraitementClients(getRClients());
							table.setModel(new DefaultTableModel(
									traitementClients.TableauAllClient(),
								new String[] {
									"Code", "Nom", "Prenom", "Carte fidélité", "Date de création"
								}
							));
						}
					});
					
					btnSupprimer.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							Connection connection = null;
							try {
								connection = GlobalConnection.getInstance();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							int code = Integer.parseInt(textField_21.getText());
							
							DAOClient.removeClients(code, connection);
							
							int AjoutCarte_fidelite;
							
							if(chckbxCarteDeFidlit_2.isSelected()){
								AjoutCarte_fidelite = 1;
							}
							else{  AjoutCarte_fidelite = 0;}
							String nom = textField_29.getText();
							String prenom = textField_30.getText();
							int id;
							if(textField_18.getText().equals("") ){ id = 0;}
							else { id = Integer.parseInt((textField_18.getText())); }
							
							List<Clients> AScli = new ClientsDAOMySQL().getClients(id, prenom, nom, AjoutCarte_fidelite, connection);
							setRClients(AScli);
							
							
							TraitementClients traitementClients =  new TraitementClients(getRClients());
							table.setModel(new DefaultTableModel(
									traitementClients.TableauAllClient(),
								new String[] {
									"Code", "Nom", "Prenom", "Carte fidélité", "Date de création"
								}
							));
							
						}
					});
	
	
	}
	
	
	public void setRClients(List<Clients> Rlist){
		Rcli = Rlist;
	}
	
	public List<Clients> getRClients(){
		return Rcli;
	}
	
	public void CloseFrame(){
	    super.dispose();
	}

}
