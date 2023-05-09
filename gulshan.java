package finall;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gulshan extends JFrame {

	private JPanel contentPane;
	private final JButton btnNewButton = new JButton("X");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gulshan frame = new gulshan();
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
	public gulshan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 555);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Unicorn Center(Gulshan Branch)");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(145, 39, 325, 116);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phone:01817787234");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(63, 165, 222, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("E-mail:unicorngulshan@gmail.com");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(63, 219, 280, 58);
		contentPane.add(lblNewLabel_2);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new aboutus().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setBounds(812, 25, 64, 21);
		contentPane.add(btnNewButton);
	}

}
