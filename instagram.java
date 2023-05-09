package finall;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class instagram extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					instagram frame = new instagram();
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
	public instagram() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 590);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\pngtree-instagram-black-and-white-icon-png-image_6618439.png"));
		lblNewLabel.setBounds(523, 71, 313, 360);
		contentPane.add(lblNewLabel);
		
		JLabel yrtrt = new JLabel("https://www.instagram.com/unicorncenter0000");
		yrtrt.setForeground(new Color(0, 255, 255));
		yrtrt.setBackground(new Color(0, 255, 255));
		yrtrt.setFont(new Font("Tahoma", Font.BOLD, 16));
		yrtrt.setBounds(57, 188, 399, 256);
		contentPane.add(yrtrt);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new aboutus().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(833, 20, 63, 21);
		contentPane.add(btnNewButton);
		
	}

}
