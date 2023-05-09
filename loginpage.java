package finall;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import audiotestpack.jtablee;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class loginpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel Usernamelbl;
	private JLabel lblPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage frame = new loginpage();
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
	public loginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(199, 136, 141, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(199, 217, 141, 51);
		contentPane.add(passwordField);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setBackground(new Color(255, 255, 128));
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user="raj";
				String code="123456";
				String usera="samina";
				String code1="123456";
				String userb="afia";
				String code2="123456";
				String userc="tawsif";
				String code3="123456";
				var user1 = textField.getText();
				String user2 = String.valueOf(user1);
				var userPWord = passwordField.getPassword();
				String userPWord1 = String.valueOf(userPWord);
				if(user1.equals(user) && userPWord1.equals(code) ||user1.equals(usera) && userPWord1.equals(code1)||user1.equals(userb)
						&& userPWord1.equals(code2)||
						user1.equals(userc) && userPWord1.equals(code3))
				{
					textField.setText("Login Successful");
					new frontpage().setVisible(true);
					dispose();
					
					
				
					
				}
				else
				{
					//textField.setText("Incorrect..!!!");
					JOptionPane.showMessageDialog(null, "Sorry, wrong username or password");
				}
			}
		});
		btnlogin.setBounds(227, 291, 85, 37);
		contentPane.add(btnlogin);
		
		Usernamelbl = new JLabel("Username");
		Usernamelbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		Usernamelbl.setBounds(40, 147, 107, 28);
		contentPane.add(Usernamelbl);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(40, 227, 107, 37);
		contentPane.add(lblPassword);
	}
}
