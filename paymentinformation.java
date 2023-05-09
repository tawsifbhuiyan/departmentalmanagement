package finall;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paymentinformation extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paymentinformation frame = new paymentinformation();
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
	public paymentinformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 555);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cash", "Credit Card", "Bkash", "Nagad"}));
		comboBox.setBounds(154, 222, 70, 42);
		contentPane.add(comboBox);
		
		JLabel lblpaymethod = new JLabel("Pay Method");
		lblpaymethod.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblpaymethod.setBounds(22, 219, 122, 45);
		contentPane.add(lblpaymethod);
		
		JButton btnBkash = new JButton("New button");
		btnBkash.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\342483221_622108993126906_5328921727837036669_n.jpg"));
		btnBkash.setBounds(366, 29, 100, 70);
		contentPane.add(btnBkash);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\342367820_561515472717100_3894071365816776811_n.jpg"));
		btnNewButton.setBounds(366, 123, 110, 82);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\342483221_622108993126906_5328921727837036669_n.jpg"));
		btnNewButton_1.setBounds(370, 252, 96, 56);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\342323516_1178838533515271_4091875884437609612_n.jpg"));
		btnNewButton_2.setBounds(366, 355, 110, 56);
		contentPane.add(btnNewButton_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(627, 137, 159, 56);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Credit Card No.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(645, 181, 159, 60);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("X");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new frontpage().setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBackground(new Color(255, 255, 0));
		btnNewButton_3.setBounds(832, 23, 70, 21);
		contentPane.add(btnNewButton_3);
		
	}
}
