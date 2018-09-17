package Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class about extends JFrame {

	private JPanel contentPane;

	public about() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int res = JOptionPane.showConfirmDialog(about.this, "Are you sure to closing window?", "Confirm closing", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(res == JOptionPane.YES_OPTION) {
					dispose();
				}
				else
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});
		setTitle("Posty - About Program");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 658, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ImageIcon icon = new ImageIcon("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project\\UI_Project\\src\\Frame\\icon.png");
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(66, 60, 91));
		panel.setBounds(0, 0, 656, 339);
		contentPane.add(panel);
		
		ImageIcon iconz = new ImageIcon("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project\\UI_Project\\src\\Frame\\icon.png");
		panel.setLayout(null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Posty \u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E1A\u0E2D\u0E23\u0E4C\u0E14\u0E2A\u0E19\u0E17\u0E19\u0E32");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(267, 23, 278, 53);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0E40\u0E27\u0E2D\u0E23\u0E4C\u0E0A\u0E31\u0E48\u0E19 1.0");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(267, 80, 278, 36);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E1F\u0E23\u0E35\r\n\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(267, 139, 96, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblPosty_1 = new JLabel("\u0E23\u0E32\u0E22\u0E25\u0E30\u0E40\u0E2D\u0E35\u0E22\u0E14 \u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21 Posty \u0E40\u0E1B\u0E47\u0E19\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E2A\u0E19\u0E17\u0E19\u0E32\u0E01\u0E23\u0E30\u0E17\u0E39\u0E49\u0E16\u0E32\u0E21\u0E15\u0E2D\u0E1A");
		lblPosty_1.setForeground(Color.WHITE);
		lblPosty_1.setBounds(267, 184, 388, 28);
		lblPosty_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPosty_1.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblPosty_1);
		
		JLabel label = new JLabel("\u0E1B\u0E23\u0E30\u0E40\u0E17\u0E28\u0E44\u0E17\u0E22");
		label.setForeground(Color.WHITE);
		label.setBounds(267, 219, 128, 36);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(label);
		
		JLabel lblBuu = new JLabel("\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E1C\u0E25\u0E34\u0E15\u0E42\u0E14\u0E22 \u0E1A\u0E23\u0E34\u0E29\u0E31\u0E17 Buu wifi by AIS");
		lblBuu.setForeground(Color.WHITE);
		lblBuu.setBounds(266, 268, 304, 36);
		lblBuu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblBuu);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(25, 41, 208, 95);
		panel.add(panel_1);
		
		JLabel label_1 = new JLabel("Posty");
		label_1.setForeground(new Color(153, 0, 153));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		label_1.setBorder(null);
		label_1.setBounds(82, 11, 105, 53);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Learn, Post, Enjoy");
		label_2.setForeground(new Color(153, 0, 153));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_2.setBounds(82, 56, 97, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project\\UI_Project\\src\\Frame\\iconSmall.png"));
		label_3.setBounds(10, 11, 84, 68);
		panel_1.add(label_3);
		
	}
	private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
	        java.awt.Image img = icon.getImage();
	        java.awt.Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);
	        return new ImageIcon(resizedImage);
	}
}
