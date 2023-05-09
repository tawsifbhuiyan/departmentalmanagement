package finall;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class distributor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					distributor frame = new distributor();
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
	public distributor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 555);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Click on the company icon to check their distributor");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(156, -15, 520, 120);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new pran().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\pran-group-vector-logo.jpg"));
		btnNewButton.setBounds(65, 103, 185, 87);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new duv().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\download (2).png"));
		btnNewButton_1.setBounds(368, 85, 249, 98);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new lux().setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\lux-logo-6A84CF97EA-seeklogo.com.png"));
		btnNewButton_3.setBounds(46, 276, 284, 162);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new apex().setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\apex-shoes-logo-D0480BCBDE-seeklogo.com.png"));
		btnNewButton_4.setBounds(454, 244, 206, 245);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("X");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new frontpage().setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setBackground(new Color(255, 0, 0));
		btnNewButton_5.setBounds(814, 10, 73, 21);
		contentPane.add(btnNewButton_5);
	}
}
