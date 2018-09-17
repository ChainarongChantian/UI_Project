package Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Home extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(
				            UIManager.getSystemLookAndFeelClassName());
					Home frame = new Home();
					frame.setLocation(new Point(0,0)); // ทำให้อยู่ที่ ซ้ายบนของจอภาพ
					frame.setVisible(true);
					frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Home() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				int res = JOptionPane.showConfirmDialog(Home.this, "Are you sure to closing window?", "Confirm closing", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(res == JOptionPane.YES_OPTION) {
					dispose();
				}
				else
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});
		setTitle("Posty - Home");
		Toolkit kit = Toolkit.getDefaultToolkit();
	    Image icons = kit.createImage("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project\\UI_Project\\src\\Frame\\icon.png");
	    setIconImage(icons);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 648, 613);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(66, 60, 91));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ImageIcon icon = new ImageIcon("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project\\UI_Project\\src\\Frame\\icon.png");
		contentPane.setLayout(null);
		
		JPanel MenuBar = new JPanel();
		MenuBar.setBounds(0, 0, 645, 117);
		MenuBar.setLayout(null);
		MenuBar.setBackground(Color.WHITE);
		contentPane.add(MenuBar);
		
		JLabel Login_RegisterBar = new JLabel("Login/Register");
		Login_RegisterBar.setBorder(UIManager.getBorder("MenuBar.border"));
		Login_RegisterBar.setBounds(455, 21, 87, 25);
		MenuBar.add(Login_RegisterBar);
		Login_RegisterBar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Login windowLogin = new Login();
				Toolkit kit = Toolkit.getDefaultToolkit();
				java.awt.Image icons = kit.createImage("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project\\UI_Project\\src\\Frame\\icon.png");
				windowLogin.setIconImage(icons);
				windowLogin.setLocation(getX()+245 , getY()+345);
				windowLogin.noResize();
				windowLogin.setVisible(true);
			}
		});
		Login_RegisterBar.setForeground(SystemColor.textInactiveText);
		Login_RegisterBar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel aboutBar = new JLabel("About");
		aboutBar.setBorder(UIManager.getBorder("MenuBar.border"));
		aboutBar.setBounds(567, 21, 37, 25);
		MenuBar.add(aboutBar);
		aboutBar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				about about = new about();
				Toolkit kit = Toolkit.getDefaultToolkit();
				java.awt.Image icons = kit.createImage("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project\\UI_Project\\src\\Frame\\icon.png");
				about.setIconImage(icons);
				about.setResizable(false);
				about.setVisible(true);
			}
		});
		aboutBar.setForeground(SystemColor.textInactiveText);
		aboutBar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
		JPanel RulesPane = new JPanel();
		RulesPane.setVisible(false);
		
		JPanel WhatPostyPane = new JPanel();
		WhatPostyPane.setBounds(10, 128, 612, 435);
		contentPane.add(WhatPostyPane);
		WhatPostyPane.setVisible(false);
		WhatPostyPane.setBackground(new Color(66, 60, 91));
		WhatPostyPane.setLayout(null);
		
		JLabel lblWhatsPosty = new JLabel("What's Posty?");
		lblWhatsPosty.setForeground(Color.WHITE);
		lblWhatsPosty.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblWhatsPosty.setBorder(UIManager.getBorder("MenuBar.border"));
		lblWhatsPosty.setBounds(22, 11, 580, 35);
		WhatPostyPane.add(lblWhatsPosty);
		
		JLabel WhatPostyLine0 = new JLabel("Posty \u0E2B\u0E23\u0E37\u0E2D \u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E1A\u0E2D\u0E23\u0E4C\u0E14\u0E2A\u0E19\u0E17\u0E19\u0E32 \u0E2D\u0E2D\u0E01\u0E41\u0E1A\u0E1A\u0E40\u0E2D\u0E32\u0E44\u0E27\u0E49\u0E2A\u0E33\u0E2B\u0E23\u0E31\u0E1A\u0E43\u0E2B\u0E49\u0E1A\u0E38\u0E04\u0E04\u0E25\u0E17\u0E31\u0E48\u0E27\u0E44\u0E1B\u0E44\u0E14\u0E49\u0E41\u0E25\u0E01\u0E40\u0E1B\u0E25\u0E35\u0E48\u0E22\u0E19");
		WhatPostyLine0.setForeground(Color.WHITE);
		WhatPostyLine0.setFont(new Font("Tahoma", Font.PLAIN, 14));
		WhatPostyLine0.setBounds(42, 54, 511, 20);
		WhatPostyPane.add(WhatPostyLine0);
		
		JLabel WhatPostyLine1 = new JLabel("\u0E41\u0E2A\u0E14\u0E07\u0E04\u0E27\u0E32\u0E21\u0E04\u0E34\u0E14\u0E40\u0E2B\u0E47\u0E19\u0E1C\u0E48\u0E32\u0E19\u0E01\u0E32\u0E23\u0E15\u0E31\u0E49\u0E07\u0E2B\u0E49\u0E2D\u0E07\u0E2A\u0E19\u0E17\u0E19\u0E32\u0E01\u0E31\u0E19\u0E40\u0E1B\u0E47\u0E19\u0E01\u0E25\u0E38\u0E48\u0E21 \u0E46 \u0E15\u0E32\u0E21\u0E41\u0E15\u0E48\u0E2B\u0E31\u0E27\u0E40\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E17\u0E35\u0E48\u0E01\u0E33\u0E2B\u0E19\u0E14\u0E40\u0E2D\u0E07\u0E44\u0E14\u0E49 ");
		WhatPostyLine1.setForeground(Color.WHITE);
		WhatPostyLine1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		WhatPostyLine1.setBounds(22, 91, 526, 20);
		WhatPostyPane.add(WhatPostyLine1);
		RulesPane.setBounds(10, 128, 612, 435);
		RulesPane.setBackground(new Color(66, 60, 91));
		contentPane.add(RulesPane);
		RulesPane.setLayout(null);
		
		JLabel WhatPostyBar = new JLabel("What's Posty?");
		WhatPostyBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RulesPane.setVisible(false);
				WhatPostyPane.setVisible(true);
			}
		});
		WhatPostyBar.setBorder(UIManager.getBorder("MenuBar.border"));
		WhatPostyBar.setForeground(SystemColor.textInactiveText);
		WhatPostyBar.setBounds(278, 21, 90, 25);
		MenuBar.add(WhatPostyBar);
		WhatPostyBar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel RulesBar = new JLabel("Rules");
		RulesBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WhatPostyPane.setVisible(false);
				RulesPane.setVisible(true);
			}
		});
		RulesBar.setForeground(SystemColor.textInactiveText);
		RulesBar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RulesBar.setBorder(UIManager.getBorder("MenuBar.border"));
		RulesBar.setBounds(393, 21, 37, 25);
		MenuBar.add(RulesBar);
		
		JPanel PostyLogo = new JPanel();
		PostyLogo.setBackground(Color.WHITE);
		PostyLogo.setBounds(10, 11, 208, 95);
		MenuBar.add(PostyLogo);
		PostyLogo.setLayout(null);
		
		JLabel PostyLogo2 = new JLabel("Posty");
		PostyLogo2.setBounds(82, 11, 105, 53);
		PostyLogo.add(PostyLogo2);
		PostyLogo2.setBorder(null);
		PostyLogo2.setFont(new Font("Tahoma", Font.BOLD, 35));
		PostyLogo2.setForeground(new Color(153, 0, 153));
		
		JLabel PostyLogo3 = new JLabel("Learn, Post, Enjoy");
		PostyLogo3.setBounds(82, 56, 97, 14);
		PostyLogo.add(PostyLogo3);
		PostyLogo3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		PostyLogo3.setForeground(new Color(153, 0, 153));
		
		JLabel PostyLogo1 = new JLabel("");
		PostyLogo1.setBounds(10, 11, 84, 68);
		PostyLogo.add(PostyLogo1);
		PostyLogo1.setIcon(new ImageIcon("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project\\UI_Project\\src\\Frame\\iconSmall.png"));
		
		JLabel lblRules_1 = new JLabel("Rules");
		lblRules_1.setBorder(UIManager.getBorder("MenuBar.border"));
		lblRules_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblRules_1.setForeground(Color.WHITE);
		lblRules_1.setBounds(22, 11, 580, 35);
		RulesPane.add(lblRules_1);
		
		JLabel RulesLine0 = new JLabel("\u0E01\u0E32\u0E23\u0E23\u0E48\u0E27\u0E21\u0E01\u0E34\u0E08\u0E01\u0E23\u0E23\u0E21\u0E41\u0E2A\u0E14\u0E07\u0E04\u0E27\u0E32\u0E21\u0E40\u0E2B\u0E47\u0E19\u0E43\u0E19\u0E01\u0E23\u0E30\u0E17\u0E39\u0E49 \u0E1C\u0E39\u0E49\u0E40\u0E02\u0E49\u0E32\u0E23\u0E48\u0E27\u0E21\u0E1E\u0E36\u0E07\u0E15\u0E49\u0E2D\u0E07\u0E1B\u0E0F\u0E34\u0E1A\u0E31\u0E15\u0E34\u0E14\u0E31\u0E07\u0E15\u0E48\u0E2D\u0E44\u0E1B\u0E19\u0E35\u0E49");
		RulesLine0.setForeground(Color.WHITE);
		RulesLine0.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RulesLine0.setBounds(42, 54, 422, 27);
		RulesPane.add(RulesLine0);
		
		JLabel RulesLine1 = new JLabel("1. \u0E2B\u0E49\u0E32\u0E21\u0E40\u0E2A\u0E19\u0E2D\u0E02\u0E49\u0E2D\u0E04\u0E27\u0E32\u0E21\u0E2D\u0E31\u0E19\u0E40\u0E1B\u0E47\u0E19\u0E01\u0E32\u0E23\u0E27\u0E34\u0E1E\u0E32\u0E01\u0E29\u0E4C\u0E27\u0E34\u0E08\u0E32\u0E23\u0E13\u0E4C\u0E2B\u0E23\u0E37\u0E2D\u0E1E\u0E32\u0E14\u0E1E\u0E34\u0E07\u0E2A\u0E16\u0E32\u0E1A\u0E31\u0E19\u0E21\u0E2B\u0E32\u0E01\u0E29\u0E31\u0E15\u0E23\u0E34\u0E22\u0E4C\u0E41\u0E25\u0E30\u0E23\u0E32\u0E0A\u0E27\u0E07\u0E28\u0E4C \u0E40\u0E1B\u0E47\u0E19\u0E2D\u0E31\u0E19\u0E02\u0E32\u0E14");
		RulesLine1.setForeground(Color.WHITE);
		RulesLine1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RulesLine1.setBounds(22, 98, 580, 14);
		RulesPane.add(RulesLine1);
		
		JLabel RulesLine2 = new JLabel("2. \u0E2B\u0E49\u0E32\u0E21\u0E40\u0E2A\u0E19\u0E2D\u0E02\u0E49\u0E2D\u0E04\u0E27\u0E32\u0E21\u0E17\u0E35\u0E48\u0E2A\u0E48\u0E2D\u0E44\u0E1B\u0E43\u0E19\u0E17\u0E32\u0E07\u0E2B\u0E22\u0E32\u0E1A\u0E04\u0E32\u0E22 \u0E01\u0E49\u0E32\u0E27\u0E23\u0E49\u0E32\u0E27 \u0E40\u0E01\u0E34\u0E19\u0E01\u0E27\u0E48\u0E32\u0E17\u0E35\u0E48\u0E1A\u0E23\u0E23\u0E17\u0E31\u0E14\u0E10\u0E32\u0E19\u0E02\u0E2D\u0E07\u0E2A\u0E31\u0E07\u0E04\u0E21\u0E08\u0E30\u0E22\u0E2D\u0E21\u0E23\u0E31\u0E1A\u0E44\u0E14\u0E49");
		RulesLine2.setForeground(Color.WHITE);
		RulesLine2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RulesLine2.setBounds(22, 137, 580, 14);
		RulesPane.add(RulesLine2);
		
		JLabel RulesLine3 = new JLabel("3. \u0E2B\u0E49\u0E32\u0E21\u0E40\u0E2A\u0E19\u0E2D\u0E02\u0E49\u0E2D\u0E04\u0E27\u0E32\u0E21\u0E2B\u0E23\u0E37\u0E2D\u0E40\u0E19\u0E37\u0E49\u0E2D\u0E2B\u0E32\u0E17\u0E35\u0E48\u0E2A\u0E48\u0E2D\u0E44\u0E1B\u0E43\u0E19\u0E17\u0E32\u0E07 \u0E25\u0E32\u0E21\u0E01 \u0E2D\u0E19\u0E32\u0E08\u0E32\u0E23 \u0E23\u0E38\u0E19\u0E41\u0E23\u0E07 \u0E2D\u0E38\u0E08\u0E32\u0E14");
		RulesLine3.setForeground(Color.WHITE);
		RulesLine3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RulesLine3.setBounds(22, 172, 580, 24);
		RulesPane.add(RulesLine3);
		
		JLabel RulesLine4 = new JLabel("4. \u0E2B\u0E49\u0E32\u0E21\u0E40\u0E2A\u0E19\u0E2D\u0E02\u0E49\u0E2D\u0E04\u0E27\u0E32\u0E21\u0E2D\u0E31\u0E19\u0E21\u0E35\u0E40\u0E08\u0E15\u0E19\u0E32\u0E43\u0E2A\u0E48\u0E04\u0E27\u0E32\u0E21\u0E1A\u0E38\u0E04\u0E04\u0E25\u0E2D\u0E37\u0E48\u0E19 \u0E43\u0E2B\u0E49\u0E44\u0E14\u0E49\u0E23\u0E31\u0E1A\u0E01\u0E32\u0E23\u0E14\u0E39\u0E2B\u0E21\u0E34\u0E48\u0E19\u0E40\u0E01\u0E25\u0E35\u0E22\u0E14\u0E0A\u0E31\u0E07\u0E08\u0E32\u0E01\u0E1A\u0E38\u0E04\u0E04\u0E25\u0E2D\u0E37\u0E48\u0E19");
		RulesLine4.setForeground(Color.WHITE);
		RulesLine4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RulesLine4.setBounds(22, 215, 580, 24);
		RulesPane.add(RulesLine4);
		
		JLabel RulesLine5 = new JLabel("\u0E42\u0E14\u0E22\u0E44\u0E21\u0E48\u0E21\u0E35\u0E41\u0E2B\u0E25\u0E48\u0E07\u0E17\u0E35\u0E48\u0E21\u0E32\u0E02\u0E2D\u0E07\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E2D\u0E49\u0E32\u0E07\u0E2D\u0E34\u0E07\u0E17\u0E35\u0E48\u0E0A\u0E31\u0E14\u0E40\u0E08\u0E19");
		RulesLine5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RulesLine5.setForeground(Color.WHITE);
		RulesLine5.setBounds(42, 250, 274, 24);
		RulesPane.add(RulesLine5);
		
		JLabel RulesLine6 = new JLabel("5. \u0E2B\u0E49\u0E32\u0E21\u0E40\u0E2A\u0E19\u0E2D\u0E02\u0E49\u0E2D\u0E04\u0E27\u0E32\u0E21\u0E2B\u0E23\u0E37\u0E2D\u0E40\u0E19\u0E37\u0E49\u0E2D\u0E2B\u0E32\u0E2D\u0E31\u0E19\u0E40\u0E1B\u0E47\u0E19\u0E2A\u0E34\u0E48\u0E07\u0E17\u0E35\u0E48\u0E40\u0E01\u0E35\u0E48\u0E22\u0E27\u0E02\u0E49\u0E2D\u0E07\u0E01\u0E31\u0E1A\u0E2A\u0E34\u0E48\u0E07\u0E1C\u0E34\u0E14\u0E01\u0E0E\u0E2B\u0E21\u0E32\u0E22\u0E2B\u0E23\u0E37\u0E2D\u0E28\u0E35\u0E25\u0E18\u0E23\u0E23\u0E21\u0E2D\u0E31\u0E19\u0E14\u0E35\u0E02\u0E2D\u0E07\u0E2A\u0E31\u0E07\u0E04\u0E21");
		RulesLine6.setForeground(Color.WHITE);
		RulesLine6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RulesLine6.setBounds(22, 285, 580, 24);
		RulesPane.add(RulesLine6);
		
		JLabel RulesLine7 = new JLabel("POSTY \u0E02\u0E2D\u0E2A\u0E07\u0E27\u0E19\u0E2A\u0E34\u0E17\u0E18\u0E34\u0E22\u0E01\u0E40\u0E25\u0E34\u0E01\u0E01\u0E32\u0E23\u0E43\u0E2B\u0E49\u0E1A\u0E23\u0E34\u0E01\u0E32\u0E23\u0E41\u0E01\u0E48\u0E2A\u0E21\u0E32\u0E0A\u0E34\u0E01\u0E0B\u0E36\u0E48\u0E07\u0E44\u0E21\u0E48\u0E43\u0E2B\u0E49\u0E04\u0E27\u0E32\u0E21\u0E23\u0E48\u0E27\u0E21\u0E21\u0E37\u0E2D\u0E43\u0E19\u0E01\u0E32\u0E23\u0E23\u0E31\u0E01\u0E29\u0E32\u0E01\u0E0E\u0E41\u0E25\u0E30\u0E01\u0E15\u0E34\u0E01\u0E32");
		RulesLine7.setForeground(Color.WHITE);
		RulesLine7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RulesLine7.setBounds(42, 369, 560, 24);
		RulesPane.add(RulesLine7);
		
		JLabel RulesLine8 = new JLabel(" \u0E40\u0E1E\u0E37\u0E48\u0E2D\u0E23\u0E31\u0E01\u0E29\u0E32\u0E1A\u0E23\u0E23\u0E22\u0E32\u0E01\u0E32\u0E28\u0E01\u0E32\u0E23\u0E2A\u0E19\u0E17\u0E19\u0E32\u0E17\u0E35\u0E48\u0E14\u0E35\u0E42\u0E14\u0E22\u0E23\u0E27\u0E21");
		RulesLine8.setForeground(Color.WHITE);
		RulesLine8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RulesLine8.setBounds(10, 404, 580, 24);
		RulesPane.add(RulesLine8);
	}	
}