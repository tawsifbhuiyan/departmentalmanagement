package finall;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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

public class aboutus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aboutus frame = new aboutus();
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
	public aboutus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 929, 529);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblintro = new JLabel(" Unicorn Center(Dhanmondi Branch) ");
		lblintro.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblintro.setBounds(10, -30, 816, 202);
		contentPane.add(lblintro);
		
		JLabel lblfacebook = new JLabel("Find us on Facebook");
		lblfacebook.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblfacebook.setBounds(69, 289, 179, 22);
		contentPane.add(lblfacebook);
		
		JButton btnfacebook = new JButton("Facebook");
		btnfacebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//InstagramFrame facebook = new InstagramFrame();
				new facebook().setVisible(true);
				dispose();
				//facebook.addWindowListener(new WindowAdapter() {
                   // @Override
                   //public void windowClosed(WindowEvent e) {
                        // The Instagram JFrame has been closed
                        // Do whatever you want here
                        // ...
                    //}
               // });
			}
			
		});
		btnfacebook.setBackground(new Color(0, 255, 0));
		btnfacebook.setBounds(313, 285, 106, 26);
		contentPane.add(btnfacebook);
		
		JLabel lblinstagram = new JLabel("Find us on Instagram");
		lblinstagram.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblinstagram.setBounds(57, 343, 246, 22);
		contentPane.add(lblinstagram);
		
		JButton btninstagram = new JButton("Instagram");
		btninstagram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new instagram().setVisible(true);
				dispose();
			}
		});
		btninstagram.setForeground(new Color(0, 0, 255));
		btninstagram.setBounds(313, 344, 106, 25);
		contentPane.add(btninstagram);
		
		JLabel lblNewLabel = new JLabel("Phone No.01868360031");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(89, 182, 272, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email:unicorndhanmondi@gmail.com");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(69, 227, 312, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Other branches' information");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(614, 182, 238, 54);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Mohammadpur");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new mohammadpur().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(637, 227, 171, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Savar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new savar().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(637, 292, 171, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Gulshan");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new gulshan().setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(637, 371, 171, 43);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("X");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new frontpage().setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBackground(new Color(255, 255, 0));
		btnNewButton_3.setBounds(845, 20, 60, 21);
		contentPane.add(btnNewButton_3);
		
	}
}
