package School_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import id_card_generator.Home_Page;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class SelectionFrame_1 extends JFrame {

	private JPanel contentPane;
	private JTextField Name;
	public JTextField rollno;
	private JTextField dob;
	private JTextField address;
	private JTextField mobileno;
	private JTextField emobileno;
	private JTextField yoj;
	private JTextField BG;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectionFrame_1 frame = new SelectionFrame_1();
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
	public SelectionFrame_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 988, 710);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Details of Particular");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel.setBounds(291, 11, 378, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name :");
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(33, 83, 119, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Roll No :");
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(33, 128, 119, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Role :");
		lblNewLabel_1_2.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(33, 191, 119, 31);
		contentPane.add(lblNewLabel_1_2);
		
		Name = new JTextField();
		Name.setBounds(204, 83, 223, 28);
		contentPane.add(Name);
		Name.setColumns(10);
		
		rollno = new JTextField();
		rollno.setColumns(10);
		rollno.setBounds(204, 132, 223, 28);
		contentPane.add(rollno);
		
		JComboBox role = new JComboBox();
		role.setFont(new Font("Cambria", Font.PLAIN, 16));
		role.setModel(new DefaultComboBoxModel(new String[] {"STUDENT", "TEACHER", "NON-TEACHING STAFF"}));
		role.setBounds(211, 193, 112, 29);
		contentPane.add(role);
		
		JLabel lblNewLabel_1_2_1 = new JLabel(" Date of Birth :");
		lblNewLabel_1_2_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(539, 191, 130, 31);
		contentPane.add(lblNewLabel_1_2_1);
		
		dob = new JTextField();
		dob.setColumns(10);
		dob.setBounds(712, 194, 138, 28);
		contentPane.add(dob);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Address :");
		lblNewLabel_1_2_1_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1.setBounds(33, 387, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(204, 359, 279, 92);
		contentPane.add(address);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Mobile No :");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1.setBounds(539, 83, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1);
		
		mobileno = new JTextField();
		mobileno.setColumns(10);
		mobileno.setBounds(707, 83, 159, 28);
		contentPane.add(mobileno);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("Emergency   :");
		lblNewLabel_1_2_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1_1.setBounds(539, 128, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1_2 = new JLabel("Contact");
		lblNewLabel_1_2_1_1_1_2.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1_2.setBounds(539, 149, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1_2);
		
		emobileno = new JTextField();
		emobileno.setColumns(10);
		emobileno.setBounds(707, 132, 159, 28);
		contentPane.add(emobileno);
		
		JLabel lblNewLabel_1_2_1_1_1_3 = new JLabel("Blood Group :");
		lblNewLabel_1_2_1_1_1_3.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1_3.setBounds(539, 263, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1_3);
		
		JLabel lblNewLabel_1_2_1_1_1_3_1 = new JLabel("Year Of Joining :");
		lblNewLabel_1_2_1_1_1_3_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1_3_1.setBounds(539, 359, 142, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1_3_1);
		
		yoj = new JTextField();
		yoj.setColumns(10);
		yoj.setBounds(707, 362, 159, 28);
		contentPane.add(yoj);
		
		BG = new JTextField();
		BG.setColumns(10);
		BG.setBounds(707, 267, 159, 28);
		contentPane.add(BG);
		
		JLabel lblNewLabel_1_2_1_1_1_4 = new JLabel("E-Mail :");
		lblNewLabel_1_2_1_1_1_4.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1_4.setBounds(33, 263, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1_4);
		
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(204, 267, 223, 28);
		contentPane.add(email);
		
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String Fullname  = Name.getText(); 
			int Roll = Integer.parseInt(rollno.getText());
			String Role = (String)role.getSelectedItem();
			String Dob = dob.getText();
			String Address = address.getText();
			String Mobileno = mobileno.getText();//Integer.parseInt(mobileno.getText());
			String Emobileno = emobileno.getText();//.parseInt(emobileno.getText());
			//String Bgroup = (String)bgroup.getSelectedItem();
			String bg = BG.getText();
			String Yoj = yoj.getText();
			String Email = email.getText();
			
			String msg = "" + Fullname;
            msg += " \n";
			
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root", "Balajibala@6204");

                String query = "INSERT INTO details values('" + Fullname + "','" + Roll +  "','" + Role +  "','" +
                    Dob + "','" + Address + "','" + Mobileno + "','" + Emobileno  + "','" + Email  + "','" + bg +  "','" + Yoj + "')";

                Statement sta = connection.createStatement();
                int x = sta.executeUpdate(query);
                if (x == 0) {
                    JOptionPane.showMessageDialog(submit, "This is alredy exist");
                } else {
                    JOptionPane.showMessageDialog(submit,
                        "Welcome, " + msg + "Your account is sucessfully created");
                }
                connection.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
			
				
			}
		});
		submit.setFont(new Font("Cambria", Font.PLAIN, 20));
		submit.setBounds(392, 513, 168, 42);
		contentPane.add(submit);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1 = new JLabel("dd/mm/yyyy");
		lblNewLabel_1_2_1_1_1_2_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		lblNewLabel_1_2_1_1_1_2_1.setBounds(549, 221, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1_2_1);
		
		
		
	
		
	
	}
}

