package finall;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class frontpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frontpage frame = new frontpage();
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
	public frontpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 547);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to leave the market place?","Confirmation",JOptionPane.YES_NO_OPTION)==0)
				{
					frontpage.this.dispose();
					
				}
			}
		});
		btnExit.setBackground(new Color(128, 255, 128));
		btnExit.setBounds(63, 354, 121, 46);
		contentPane.add(btnExit);
		
		JButton btnAboutus = new JButton("About Us");
		btnAboutus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new aboutus().setVisible(true);
				dispose();
			}
		});
		btnAboutus.setBackground(new Color(0, 255, 255));
		btnAboutus.setBounds(63, 263, 121, 46);
		contentPane.add(btnAboutus);
		
		JButton btnPaymentinformation = new JButton("Payment Information");
		btnPaymentinformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new paymentinformation().setVisible(true);
				dispose();
			}
		});
		btnPaymentinformation.setBackground(new Color(255, 128, 192));
		btnPaymentinformation.setBounds(257, 258, 161, 56);
		contentPane.add(btnPaymentinformation);
		
		JButton btnPurchase = new JButton("Purchase");
		btnPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new purchase().setVisible(true);
				dispose();
			}
		});
		btnPurchase.setForeground(new Color(128, 0, 255));
		btnPurchase.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPurchase.setBounds(268, 355, 129, 40);
		contentPane.add(btnPurchase);
		
		JLabel lblNewLabel = new JLabel("Welcome To Unicorn Center(Dhanmondi Branch)");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(140, 71, 707, 100);
		contentPane.add(lblNewLabel);
		
		JButton btnLogout = new JButton("Log Out");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//btnExit.addMouseListener(new MouseAdapter() {
				//	@Override
					
			}
		});
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?","Confirmation",JOptionPane.YES_NO_OPTION)==0)
				{
					//frontpage.this.dispose();
					new loginpage().setVisible(true);
					dispose();
					
				}
			}
		});
		btnLogout.setBackground(new Color(128, 255, 128));
		btnLogout.setBounds(289, 446, 129, 34);
		contentPane.add(btnLogout);
		
		JButton btnNewButton = new JButton("Employee Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new employeeinformation().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(128, 128, 255));
		btnNewButton.setBounds(497, 264, 134, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Customer Database");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new customerdatabase().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(484, 353, 167, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Distributor Information");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new distributor().setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(255, 0, 128));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(702, 294, 200, 62);
		contentPane.add(btnNewButton_2);
	}
}
