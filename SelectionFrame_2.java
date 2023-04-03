package School_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

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
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JFrame; 



public class SelectionFrame_2  extends JFrame{

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
			//    SelectionFrame_2 frame = new SelectionFrame_2( );
			//	frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SelectionFrame_2(String KEY ) {
		 String key = KEY ;
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
		
		JLabel lblNewLabel_1_2_1 = new JLabel(" Date of Birth :");
		lblNewLabel_1_2_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(539, 191, 130, 31);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Address :");
		lblNewLabel_1_2_1_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1.setBounds(33, 387, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Mobile No :");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1.setBounds(539, 83, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("Emergency   :");
		lblNewLabel_1_2_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1_1.setBounds(539, 128, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1_2 = new JLabel("Contact");
		lblNewLabel_1_2_1_1_1_2.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1_2.setBounds(539, 149, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1_2);
		
		JLabel lblNewLabel_1_2_1_1_1_3 = new JLabel("Blood Group :");
		lblNewLabel_1_2_1_1_1_3.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1_3.setBounds(539, 263, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1_3);
		
		JLabel lblNewLabel_1_2_1_1_1_3_1 = new JLabel("Year Of Joining :");
		lblNewLabel_1_2_1_1_1_3_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1_3_1.setBounds(539, 359, 142, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1_3_1);
		
		JLabel lblNewLabel_1_2_1_1_1_4 = new JLabel("E-Mail :");
		lblNewLabel_1_2_1_1_1_4.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1_4.setBounds(33, 263, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1_4);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1 = new JLabel("dd/mm/yyyy");
		lblNewLabel_1_2_1_1_1_2_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		lblNewLabel_1_2_1_1_1_2_1.setBounds(549, 221, 130, 31);
		contentPane.add(lblNewLabel_1_2_1_1_1_2_1);
		

		
		
		
		
		
		
		
		
		
		
		
		
		 try {
			 //String KEY = super.key;
			// System.out.println();
			 String a = "Select * from details where Roll = ";
			 String b = key ;
			 String query = a + b ;
			 //Class.forname("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root", "Balajibala@6204");
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query);
             ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            rs.next();
            String a1=rs.getString(1);
            int a2 = rs.getInt(2);
            String A2 = String.valueOf(a2);
            String a3=rs.getString(3);
            String a4=rs.getString(4);
            String a5=rs.getString(5);
            String a6=rs.getString(6);
            String a7=rs.getString(7);
            String a8=rs.getString(8);
            String a9=rs.getString(9);
            String a10=rs.getString(10);
            
            // System.out.println(a);
     		JLabel fnlabel = new JLabel("");
    		fnlabel.setText(a1);
    		fnlabel.setFont(new Font("Cambria", Font.PLAIN, 20));
    		fnlabel.setBounds(204, 83, 223, 25);
    		contentPane.add(fnlabel);
    		
    		JLabel rllabel = new JLabel("");
    		rllabel.setText(A2);
    		rllabel.setFont(new Font("Cambria", Font.PLAIN, 20));
    		rllabel.setBounds(211, 124, 166, 29);
    		contentPane.add(rllabel);
    		
    		JLabel relabel = new JLabel("");
    		relabel.setText(a3);
    		relabel.setFont(new Font("Cambria", Font.PLAIN, 19));
    		relabel.setBounds(204, 197, 173, 25);
    		contentPane.add(relabel);
    		
    		JLabel maillabel = new JLabel("");
    		maillabel.setText(a8);
    		maillabel.setFont(new Font("Cambria", Font.PLAIN, 16));
    		maillabel.setBounds(211, 263, 272, 25);
    		contentPane.add(maillabel);
    		
    		JLabel addresslabel = new JLabel("");
    		addresslabel.setText(a5);
    		addresslabel.setFont(new Font("Cambria", Font.PLAIN, 20));
    		addresslabel.setBounds(211, 386, 194, 31);
    		contentPane.add(addresslabel);
    		
    		JLabel mnlabel = new JLabel("");
    		mnlabel.setText(a6);
    		mnlabel.setFont(new Font("Cambria", Font.PLAIN, 20));
    		mnlabel.setBounds(712, 80, 154, 28);
    		contentPane.add(mnlabel);
    		
    		JLabel eclabel = new JLabel("");
    		eclabel.setText(a7);
    		eclabel.setFont(new Font("Cambria", Font.PLAIN, 20));
    		eclabel.setBounds(712, 128, 138, 25);
    		contentPane.add(eclabel);
    		
    		JLabel doblabel = new JLabel("");
    		doblabel.setText(a4);
    		doblabel.setFont(new Font("Cambria", Font.PLAIN, 18));
    		doblabel.setBounds(707, 191, 159, 25);
    		contentPane.add(doblabel);
    		
    		JLabel bglabel = new JLabel("");
    		bglabel.setText(a9);
    		bglabel.setFont(new Font("Cambria", Font.PLAIN, 20));
    		bglabel.setBounds(712, 263, 154, 25);
    		contentPane.add(bglabel);
    		
    		JLabel yojlabel = new JLabel("");
    		yojlabel.setText(a10);
    		yojlabel.setFont(new Font("Cambria", Font.PLAIN, 20));
    		yojlabel.setBounds(717, 359, 149, 25);
    		contentPane.add(yojlabel);
    		
            
             
         } catch (Exception exception) {
             exception.printStackTrace();
         }
	
		
	
	}
}

