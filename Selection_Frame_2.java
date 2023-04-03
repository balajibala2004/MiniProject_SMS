package School_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Selection_Frame_2 extends JFrame {

	public JPanel contentPane;
	public JTextField rollfield;
	public String key;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selection_Frame_2 frame = new Selection_Frame_2();
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
	public Selection_Frame_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter  Roll.no");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel.setBounds(41, 84, 140, 30);
		contentPane.add(lblNewLabel);
		
		rollfield = new JTextField();
		rollfield.setBounds(184, 88, 140, 24);
		contentPane.add(rollfield);
		rollfield.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 key  = rollfield.getText();
				

				SelectionFrame_2 ob = new SelectionFrame_2(key);
				ob.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton.setBounds(141, 178, 89, 23);
		contentPane.add(btnNewButton);
	}
}


//String query = "INSERT INTO details values('" + Fullname + "','" + Roll +  "','" + Role +  "','" +
//Dob + "','" + Address + "','" + Mobileno + "','" + Emobileno  + "','" + Email  + "','" + bg +  "','" + Yoj + "')";
