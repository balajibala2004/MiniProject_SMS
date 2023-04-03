package School_Management_System;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Second_Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Second_Frame frame = new Second_Frame();
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
	public Second_Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnView = new JButton("VIEW");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Selection_Frame_2 ob = new Selection_Frame_2();
				ob.setVisible(true);
			}
		});
		btnView.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnView.setBounds(143, 143, 124, 39);
		contentPane.add(btnView);
		
		JButton btnGenerate = new JButton("GENERATE");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// new Selection_Frame_1();
				SelectionFrame_1 obj = new SelectionFrame_1();
				obj.setVisible(true);
				
			}
		});
		btnGenerate.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnGenerate.setBounds(143, 88, 124, 39);
		contentPane.add(btnGenerate);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/loginImage (6).jpg"));
	}

}
