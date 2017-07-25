package maquettes.dialogue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JToolBar;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLayeredPane;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Fclients extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fclients frame = new Fclients();
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
	public Fclients() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Fclients.class.getResource("/images/Moon-32.png")));
		setTitle("Gestion des clients");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 718);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
			
			JLayeredPane layeredPane = new JLayeredPane();
			contentPane.add(layeredPane, BorderLayout.CENTER);
			layeredPane.setLayout(new BorderLayout(0, 0));
			
			JPanel panel_3 = new JPanel();
			layeredPane.add(panel_3);
			panel_3.setLayout(new BorderLayout(0, 0));
			//panel_3.setVisible(false);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(135, 206, 250));
			panel_3.add(panel_1, BorderLayout.CENTER);
			panel_1.setLayout(new MigLayout("", "[grow]", "[grow 50][grow][]"));
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
			panel_2.setBackground(new Color(135, 206, 250));
			panel_1.add(panel_2, "cell 0 0,grow");
			panel_2.setLayout(new MigLayout("", "[grow 20][grow][grow 20][grow]", "[grow][grow][grow][grow][grow][grow][grow][grow]"));
			
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
				panel_2.add(chckbxNewCheckBox, "flowx,cell 3 4");
				
				JLabel lblNewLabel_6 = new JLabel("Remarque");
				lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
				panel_2.add(lblNewLabel_6, "cell 0 5,alignx right");
				
				JTextArea textArea = new JTextArea();
				textArea.setLineWrap(true);
				panel_2.add(textArea, "cell 1 5 3 3,grow");
				
				JScrollPane scrollPane = new JScrollPane();
				panel_1.add(scrollPane, "cell 0 1,grow");
				
				JLabel lblNewLabel_10 = new JLabel("Trier la liste par");
				lblNewLabel_10.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Sort-Ascending-32.png")));
				panel_1.add(lblNewLabel_10, "flowx,cell 0 2,alignx left");
				
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"zae", "ezzae", "eazzae", "azaze"}));
				panel_1.add(comboBox, "cell 0 2");
				
				JPanel panel = new JPanel();
				panel_3.add(panel, BorderLayout.WEST);
				panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				panel.setBackground(new Color(30, 144, 255));
				panel.setLayout(new MigLayout("", "[left]", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow]"));
				
				JLabel lblNewLabel = new JLabel("Clients");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/client/People-64-actif.png")));
				panel.add(lblNewLabel, "cell 0 0,alignx left,aligny top");
				
				JButton btnNewButton = new JButton("Ajouter");
				btnNewButton.setBackground(new Color(30, 144, 255));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnNewButton.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Add-New-48.png")));
				btnNewButton.setBorder(null);
				panel.add(btnNewButton, "cell 0 1,alignx left,aligny center");
				
				JButton btnNewButton_1 = new JButton("Rechercher");
				btnNewButton_1.setBackground(new Color(30, 144, 255));
				btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnNewButton_1.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Search-48.png")));
				btnNewButton_1.setBorder(null);
				panel.add(btnNewButton_1, "cell 0 2,alignx left,aligny center");
				
				JButton btnNewButton_2 = new JButton("Modifier");
				btnNewButton_2.setBackground(new Color(30, 144, 255));
				btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnNewButton_2.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Data-Edit-48.png")));
				btnNewButton_2.setBorder(null);
				panel.add(btnNewButton_2, "cell 0 3,alignx left,aligny center");
				
				JButton btnNewButton_3 = new JButton("Supprimer");
				btnNewButton_3.setBackground(new Color(30, 144, 255));
				btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnNewButton_3.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Garbage-Open-48.png")));
				btnNewButton_3.setBorder(null);
				panel.add(btnNewButton_3, "cell 0 4,alignx left,aligny center");
				
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
				btnNewButton_4.setBackground(new Color(30, 144, 255));
				btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnNewButton_4.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Home-48.png")));
				btnNewButton_4.setBorder(null);
				panel.add(btnNewButton_4, "cell 0 10,alignx left,aligny center");
				
				JPanel panel_4 = new JPanel();
				layeredPane.add(panel_4, BorderLayout.NORTH);
				layeredPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel_1, panel_1, panel_3, panel_2, textField, lblNewLabel_7, textField_5, lblNewLabel_2, textField_1, lblNewLabel_8, textField_6, lblNewLabel_3, textField_2, lblNewLabel_4, textField_3, lblNewLabel_9, textField_7, lblNewLabel_5, textField_4, chckbxNewCheckBox, lblNewLabel_6, textArea, scrollPane, lblNewLabel_10, comboBox, panel, lblNewLabel, btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_3, btnNewButton_5, btnNewButton_6, btnNewButton_7, btnNewButton_4}));
	}

}
