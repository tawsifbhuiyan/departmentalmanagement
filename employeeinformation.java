package finall;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class employeeinformation extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employeeinformation frame = new employeeinformation();
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
	public employeeinformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 556);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "Name", "Age", "Gender", "Phone", "Shift", "Division"},
				{"2001", "Kamal", "33", "Male", "01516776532", "1", "CEO"},
				{"2009", "Artuk", "29", "Male", "01827872812", "2", "Head"},
				{"2003", "Piya", "26", "Female", "01876872312", "1", "CEO"},
				{"2007", "Rian", "21", "Male", "01876543211", "2", "Cashier"},
				{"2005", "Noor", "26", "Male", "01827568333", "1", "Cashier"},
				{"2012", "Shila", "23", "Female", "01617543221", "2", "Cashier"},
				{"2017", "Jamal", "25", "Male", "01564321555", "1", "Security"},
			},
			new String[] {
				"", "", "", "", "", "", ""
			}
		));
		table.setBounds(0, 82, 887, 437);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("This list is applicable only for current employees");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(141, 22, 596, 34);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(802, 22, 39, -3);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new frontpage().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.setBounds(825, 22, 62, 13);
		contentPane.add(btnNewButton_1);
	}
}
