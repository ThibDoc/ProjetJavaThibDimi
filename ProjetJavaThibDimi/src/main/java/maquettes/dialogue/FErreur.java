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

public class FErreur extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FErreur(String texte) {
		setTitle("Luna");
		setIconImage(Toolkit.getDefaultToolkit().getImage(FErreur.class.getResource("/images/Moon-32.png")));
		setBounds(100, 100, 388, 237);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		// Boutton Ok
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(138, 118, 101, 37);
		contentPane.add(btnNewButton);
		
		// Appuie sur ok sa appuie sur le boutton ok
		contentPane.getRootPane().setDefaultButton(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(UIManager.getColor("Button.background"));
		textPane.setOpaque(true);
		StyledDocument doc = textPane.getStyledDocument();		
		MutableAttributeSet center = new SimpleAttributeSet();		
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, 0, center, true);
		textPane.setText(texte);
		
		
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPane.setBounds(10, 45, 352, 62);
		contentPane.add(textPane);
	}
}
