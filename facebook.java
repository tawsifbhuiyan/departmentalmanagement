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

public class facebook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					facebook frame = new facebook();
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
	public facebook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\124010.png"));
		lblNewLabel.setBounds(449, 76, 463, 356);
		contentPane.add(lblNewLabel);
		
		JLabel lblfacebooklink = new JLabel("https://www.facebook.com/UnicornCenter");
		lblfacebooklink.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblfacebooklink.setBounds(36, 68, 357, 364);
		contentPane.add(lblfacebooklink);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new aboutus().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(844, 10, 58, 21);
		contentPane.add(btnNewButton);
		
	}

}
