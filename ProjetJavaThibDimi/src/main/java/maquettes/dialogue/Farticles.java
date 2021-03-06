package maquettes.dialogue;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import util.GlobalConnection;
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
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DAO.ArticlesDAOMySQL;
import Entite.Articles;
import Traitement.TraitementArticle;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import java.awt.Toolkit;

public class Farticles extends JFrame {

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
	private JTable table;
	private JTextField textField_5;
	private List<Articles> listeA = new ArrayList<Articles>();

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Farticles() throws SQLException {
		
		Connection conn = null;
		conn = GlobalConnection.getInstance();
		ArticlesDAOMySQL daoArt = new ArticlesDAOMySQL();
		TraitementArticle t = new TraitementArticle();
		listeA = daoArt.getAllArticles(conn);
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("Gestion des articles");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Farticles.class.getResource("/images/Moon-32.png")));
		setBounds(100, 100, 1018, 569);
		contentPane = new JPanel();
		contentPane.setBorder(null);
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
				CloseFrame();
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
		panel_1.setBackground(new Color(153, 204, 102));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[grow,center]", "[200px,center][grow,center][150px,grow]"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 102));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_2, "cell 0 0,grow");
		panel_2.setLayout(new MigLayout("", "[100px][300px,grow][100px,right][grow]", "[center][50px][][][]"));
		
		JLabel lblNewLabel_1 = new JLabel("Code");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblNewLabel_1, "cell 0 0,alignx trailing,aligny top");
		
		textField = new JTextField();
		textField.setEditable(false);
		panel_2.add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Catégorie");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblNewLabel_2, "cell 2 0,alignx trailing");
		
		textField_1 = new JTextField();
		panel_2.add(textField_1, "cell 3 0,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Désignation");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblNewLabel_3, "cell 0 1,alignx trailing");
		
		textField_2 = new JTextField();
		panel_2.add(textField_2, "cell 1 1 3 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblQuantit = new JLabel("Quantité");
		lblQuantit.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblQuantit, "cell 0 2,alignx right");
		
		JSlider slider = new JSlider();
		slider.setBackground(new Color(153, 204, 102));
		slider.addChangeListener((ChangeEvent e) ->{
			String valeur = Integer.toString(slider.getValue());
			textField_3.setText(valeur);
		});
		panel_2.add(slider, "flowx,cell 1 2,growx");
		
		textField_3 = new JTextField();
		panel_2.add(textField_3, "cell 1 2,alignx right");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Prix Unitaire");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblNewLabel_4, "cell 2 2,alignx trailing");
		
		textField_4 = new JTextField();
		panel_2.add(textField_4, "flowx,cell 3 2,growx");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("€");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblNewLabel_5, "cell 3 2");
		
		JButton btnNewButton_3 = new JButton("Ajouter");
		btnNewButton_3.setBackground(new Color(153, 204, 102));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setIcon(new ImageIcon(Farticles.class.getResource("/images/gestion/Add-New-48.png")));
		btnNewButton_3.setBorder(null);
		panel_2.add(btnNewButton_3, "flowx,cell 1 4,alignx center");
		
		JButton btnNewButton_4 = new JButton("Modifier");
		btnNewButton_4.setBackground(new Color(153, 204, 102));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setIcon(new ImageIcon(Farticles.class.getResource("/images/gestion/Data-Edit-48.png")));
		btnNewButton_4.setBorder(null);
		panel_2.add(btnNewButton_4, "cell 1 4,alignx center");
		
		JButton btnNewButton_5 = new JButton("Supprimer");
		btnNewButton_5.setBackground(new Color(153, 204, 102));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_5.setIcon(new ImageIcon(Farticles.class.getResource("/images/gestion/Garbage-Open-48.png")));
		btnNewButton_5.setBorder(null);
		panel_2.add(btnNewButton_5, "cell 1 4,alignx center");
		
		JButton btnNewButton_6 = new JButton("Effacer les champs");
		btnNewButton_6.setBackground(new Color(153, 204, 102));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_6.setIcon(new ImageIcon(Farticles.class.getResource("/images/gestion/Cancel-48.png")));
		btnNewButton_6.setBorder(null);
		panel_2.add(btnNewButton_6, "cell 1 4");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(153, 204, 102));
		panel_1.add(panel_3, "cell 0 1,grow");
		panel_3.setLayout(new MigLayout("", "[grow]", "[]"));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane, "flowx,cell 0 0,growx");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			t.TableauArticleCommande(listeA),
			new String[] {
				"Code", "Catégorie", "Désignation", "Quantité", "Prix Unitaire"
			}
		));
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt){
				int numLigne = table.getSelectedRow();
				if(numLigne >=0 ){
					Articles result = listeA.get(numLigne);
					String code = Integer.toString(result.getCode());
					String categorie = result.getCategorie();
					String designation = result.getDesignation();
					String quantite =Integer.toString(result.getQuantite());
					String prix_unitaire = Double.toString(result.getPrix_unitaire());
					
					textField.setText(code);
					textField_1.setText(categorie);
					textField_2.setText(designation);
					textField_3.setText(quantite);
					textField_4.setText(prix_unitaire);
				}
			}
		});
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(153, 204, 102));
		panel_1.add(panel_4, "cell 0 2,grow");
		panel_4.setLayout(new MigLayout("", "[150px,right][][][][300px][]", "[]"));
		
		JLabel lblNewLabel_6 = new JLabel("Trier par");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setIcon(new ImageIcon(Farticles.class.getResource("/images/gestion/Sort-Ascending-32.png")));
		panel_4.add(lblNewLabel_6, "cell 0 0");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Code");
		rdbtnNewRadioButton.setBackground(new Color(153, 204, 102));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_4.add(rdbtnNewRadioButton, "cell 1 0");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Catégorie");
		rdbtnNewRadioButton_1.setBackground(new Color(153, 204, 102));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_4.add(rdbtnNewRadioButton_1, "cell 2 0");
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Recherche");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setIcon(new ImageIcon(Farticles.class.getResource("/images/gestion/Search-32.png")));
		panel_4.add(lblNewLabel_7, "cell 3 0,alignx trailing");
		
		textField_5 = new JTextField();
		panel_4.add(textField_5, "cell 4 0,growx");
		textField_5.setColumns(10);
		
		JButton btnRechercher = new JButton("Rechercher");
		
		btnRechercher.setBackground(new Color(153, 204, 102));
		panel_4.add(btnRechercher, "cell 5 0");
		
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
			}
		});
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conne = null;
				try {
					conne = GlobalConnection.getInstance();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					
				}
				try{
				listeA = daoArt.getAllArticles(conne);
				int numLigne = table.getSelectedRow();
				Articles artADel = listeA.get(numLigne);
				
				daoArt.removeArticles(artADel.getCode(), conne);
				listeA.remove(artADel);
				
				table.setModel(new DefaultTableModel(
						t.TableauArticleCommande(listeA),
						new String[] {
							"Code", "Catégorie", "Désignation", "Quantité", "Prix Unitaire"
						}
					));
				}catch(ArrayIndexOutOfBoundsException ee){
					FErreur log = new FErreur("Aucun article n'est selectionné");
					log.setVisible(true);
				}
			}
		});
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conne = null;
				try {
					conne = GlobalConnection.getInstance();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					
				}
				try{
				int updateCode = Integer.parseInt(textField.getText());
				String updateCateg = textField_1.getText();
				String updateDesignation = textField_2.getText();
				int updateQuantite= Integer.parseInt(textField_3.getText());
				Double updatePrixUnit = Double.parseDouble(textField_4.getText());
				
				Articles updArt = new Articles(updateCateg, updateDesignation, updateQuantite, updatePrixUnit);
				updArt.setCode(updateCode);
				daoArt.updateArticles(updArt, conne);
				listeA = daoArt.getAllArticles(conne);
				table.setModel(new DefaultTableModel(
						t.TableauArticleCommande(listeA),
						new String[] {
							"Code", "Catégorie", "Désignation", "Quantité", "Prix Unitaire"
						}
					));
				}catch(NumberFormatException eeee){
					FErreur log = new FErreur("Aucun article selectionné ou un champ est vide !");
					log.setVisible(true);
				}
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conne = null;
				try {
					conne = GlobalConnection.getInstance();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					
				}
				try{
				String newCateg = textField_1.getText();
				String newDesignation = textField_2.getText();
				int newQuantite= Integer.parseInt(textField_3.getText());
				Double newPrixUnit = Double.parseDouble(textField_4.getText());
				
				Articles newArt = new Articles(newCateg, newDesignation, newQuantite, newPrixUnit);
				daoArt.insertArticles(newArt, conne);
				listeA = daoArt.getAllArticles(conne);
				table.setModel(new DefaultTableModel(
						t.TableauArticleCommande(listeA),
						new String[] {
							"Code", "Catégorie", "Désignation", "Quantité", "Prix Unitaire"
						}
					));
				}catch(NumberFormatException eeee){
					FErreur log = new FErreur("Un ou plusieurs champs sont vides");
					log.setVisible(true);
				}
			}
		});
		
		rdbtnNewRadioButton_1.addActionListener((ActionEvent e) ->{
			Connection conne = null;
			try {
				conne = GlobalConnection.getInstance();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
			}
			listeA = daoArt.getAllArticleOrderCateg(conne);
			table.setModel(new DefaultTableModel(
					t.TableauArticleCommande(listeA),
					new String[] {
						"Code", "Catégorie", "Désignation", "Quantité", "Prix Unitaire"
					}
				));
		});
		
		rdbtnNewRadioButton.addActionListener((ActionEvent e) ->{
			Connection conne = null;
			try {
				conne = GlobalConnection.getInstance();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
			}
			listeA = daoArt.getAllArticles(conne);
			table.setModel(new DefaultTableModel(
					t.TableauArticleCommande(listeA),
					new String[] {
						"Code", "Catégorie", "Désignation", "Quantité", "Prix Unitaire"
					}
				));
		});
		
		btnRechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conne = null;
				try {
					conne = GlobalConnection.getInstance();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
				}
				
				try{
				Articles laRecherche = daoArt.getArticles(conne, textField_5.getText());
				listeA.clear();
				listeA.add(laRecherche);
				table.setModel(new DefaultTableModel(
						t.TableauArticleCommande(listeA),
						new String[] {
							"Code", "Catégorie", "Désignation", "Quantité", "Prix Unitaire"
						}
					));
				}catch(NullPointerException exxx){
					FErreur log = new FErreur("Article introuvable");
					log.setVisible(true);
				}
			}
		});
		
		textField_2.requestFocus();
		
	}
	
	public void CloseFrame(){
	    super.dispose();
	}
}
