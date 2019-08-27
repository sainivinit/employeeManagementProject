package employeemanagement;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class editframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editframe frame = new editframe();
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
	public editframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1132, 644);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edit Data");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(418, 11, 261, 27);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(884, 17, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
	
		btnSearch.setBounds(1023, 16, 89, 23);
		contentPane.add(btnSearch);
		
		JLabel lblEnterId = new JLabel("Enter id");
		lblEnterId.setBounds(884, 0, 48, 14);
		contentPane.add(lblEnterId);
		
		JTextField lblNewLabel_1 = new JTextField("ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 113, 264, 27);
		contentPane.add(lblNewLabel_1);
		
		JTextField lblNewLabel_2 = new JTextField("First Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 236, 264, 25);
		contentPane.add(lblNewLabel_2);
		
		JTextField lblNewLabel_3 = new JTextField("Last Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 352, 264, 27);
		contentPane.add(lblNewLabel_3);
		
		JTextField lblNewLabel_4 = new JTextField("Email Id");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 465, 264, 27);
		contentPane.add(lblNewLabel_4);
		
		JTextField lblNewLabel_5 = new JTextField("Countery");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(418, 465, 261, 27);
		contentPane.add(lblNewLabel_5);
		
		JTextField lblNewLabel_6 = new JTextField("Age");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(418, 113, 261, 27);
		contentPane.add(lblNewLabel_6);
		
		JTextField lblNewLabel_7 = new JTextField("Mobile No.");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(418, 223, 261, 27);
		contentPane.add(lblNewLabel_7);
		
		JTextField label = new JTextField("Position");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(418, 352, 261, 27);
		contentPane.add(label);
		
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","root");
					Statement  st=con.createStatement();
					ResultSet rs=st.executeQuery("SELECT * FROM emp Where id="+(textField.getText()));
					rs.next();
					
					String a=rs.getString(1);
					String b=rs.getString(2);
					String c=rs.getString(3);
					String d=rs.getString(4);
					String ee=rs.getString(5);
					String f=rs.getString(6);
					String g=rs.getString(7);
					String h=rs.getString(8);
					
					
					lblNewLabel_1.setText(a);
					lblNewLabel_2.setText(b);
					lblNewLabel_3.setText(c);
					lblNewLabel_4.setText(d);
					lblNewLabel_5.setText(ee);
					lblNewLabel_6.setText(f);
					lblNewLabel_7.setText(g);
					label.setText(h);
					//lblNewLabel_9.setText();
					
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				
			}
		});
	}
}