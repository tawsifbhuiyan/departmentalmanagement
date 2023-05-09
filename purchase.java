package finall;

import java.awt.EventQueue;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

public class purchase extends JFrame {

	private JPanel contentPane;
	private JTable jTable;
	private JTextField jtxtTax;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTotal;
	private JTextField jtxtChange;
	private JTextField jtxtDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					purchase frame = new purchase();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	double cTotal;
	double cTax;
	double cash;
	double cChange;
	double  amountDue;
	double discount;
	double change;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	public void Itemcost()
	{
		double sum=0;
		double tax=3.9;
		for(int i=0;i<jTable.getRowCount();i++)
		{
			sum=sum+Double.parseDouble(jTable.getValueAt(i,1).toString());
		}
		jtxtSubTotal.setText(Double.toString(sum));
		cTotal = Double.parseDouble(jtxtSubTotal.getText());
		 cTax=(cTotal*tax)/100;
		String iTaxTotal= String.format("$ %.2f",cTax);
		jtxtTax.setText(iTaxTotal);
		
		String iSubTotal= String.format("$ %.2f",cTotal);
		jtxtSubTotal.setText(iSubTotal);
		
		String iTotal= String.format("$ %.2f",cTotal+cTax);
		jtxtTotal.setText(iTotal);
		
		//String Barcode= String.format("Total is %.2f",cTotal+cTax);
		//jtxtBarcode.setText(Barcode);
		
	}
	
	public void Change()
	{
		double sum=0;
		double tax=3.9;
		 cash=Double.parseDouble(jtxtDisplay.getText());
		for(int i=0;i<jTable.getRowCount();i++)
		{
			sum=sum+Double.parseDouble(jTable.getValueAt(i,1).toString());
		}
		
		double cTax=(tax*sum)/100;
		 cChange=(cash-(sum+cTax));
		String ChangeGiven = String.format("$ %.2f",cChange);
		jtxtChange.setText(ChangeGiven);
	}
	/*public purchase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBounds(10, 10, 134, 353);
		contentPane.add(panel);
		panel.setLayout(null);*/
		

	/**
	 * Create the frame.
	 */
	public purchase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 555);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCap = new JLabel("Cap");
		lblCap.setIcon(null);
		lblCap.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCap.setBounds(557, 31, 96, 73);
		contentPane.add(lblCap);
		
		JButton btnCap = new JButton("");
		btnCap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
                //imageFrame.getContentPane().add(lblCapcode);
                //imageFrame.pack();
                //imageFrame.setVisible(true);
				new cap().setVisible(true);
				//dispose();
				
				double PriceOfItem=108;
				DefaultTableModel model=(DefaultTableModel) jTable.getModel();
				//model.addRow(new Object[] {"Cap",PriceOfItem," "});
				//model.addRow(new Object[] {"Cap",PriceOfItem});
				model.addRow(new Object[] {"Cap",PriceOfItem,"Taka"}); 
				Itemcost();
			}
		});
		btnCap.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\0001128_rollsroller-base-ball-cap-size-medium_415.jpeg"));
		btnCap.setBounds(540, 93, 85, 73);
		contentPane.add(btnCap);
		
		JButton btnPen = new JButton("New button");
		btnPen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
               // imageFrame.getContentPane().add(lblPencode);
                //imageFrame.pack();
                //imageFrame.setVisible(true);
				new pen().setVisible(true);
				//dispose();
				double PriceOfItem=40;
				DefaultTableModel model=(DefaultTableModel) jTable.getModel();
				model.addRow(new Object[] {"Pen",PriceOfItem,"Taka"});
				Itemcost();
			}
		});
		btnPen.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\istockphoto-1059543698-170667a.jpg"));
		btnPen.setBounds(663, 93, 79, 73);
		contentPane.add(btnPen);
		
		JLabel lblPen = new JLabel("Pen");
		lblPen.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPen.setBounds(671, 55, 71, 25);
		contentPane.add(lblPen);
		
		JButton btnToy = new JButton("");
		btnToy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
                //imageFrame.getContentPane().add(lblToycode);
                //imageFrame.pack();
                //imageFrame.setVisible(true);
				new toy().setVisible(true);
				
				double PriceOfItem=90;
				DefaultTableModel model=(DefaultTableModel) jTable.getModel();
				//model.addRow(new Object[] {"Toy","1",PriceOfItem});
				model.addRow(new Object[] {"Toy",PriceOfItem,"Taka"});
				Itemcost();
			}
		});
		btnToy.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\12467985_111822-wls-baby-doll-img.jfif"));
		btnToy.setBounds(794, 93, 96, 73);
		contentPane.add(btnToy);
		
		JLabel lblNewLabel = new JLabel("Toy");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(834, 55, 85, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnBag = new JButton("");
		btnBag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
                //imageFrame.getContentPane().add(lblBagcode);
                //imageFrame.pack();
                //imageFrame.setVisible(true);
				new bag().setVisible(true);
				
				
				double PriceOfItem=430;
				DefaultTableModel model=(DefaultTableModel) jTable.getModel();
				//model.addRow(new Object[] {"Bag","1",PriceOfItem});
				model.addRow(new Object[] {"Bag",PriceOfItem,"Taka"});
				Itemcost();
			}
		});
		btnBag.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\photo-1584917865442-de89df76afd3.jfif"));
		btnBag.setBounds(563, 238, 85, 73);
		contentPane.add(btnBag);
		
		JLabel lblBag = new JLabel("Bag");
		lblBag.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBag.setBounds(582, 209, 71, 18);
		contentPane.add(lblBag);
		
		JButton btnSoap = new JButton("");
		btnSoap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
               // imageFrame.getContentPane().add(lblSoap);
               // imageFrame.pack();
               // imageFrame.setVisible(true);
				new soap().setVisible(true);
				double PriceOfItem=35;
				DefaultTableModel model=(DefaultTableModel) jTable.getModel();
				//model.addRow(new Object[] {"Soap","1",PriceOfItem});
				model.addRow(new Object[] {"Soap",PriceOfItem,"Taka"});
				Itemcost();
			}
		});
		btnSoap.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\istockphoto-505574760-612x612.jpg"));
		btnSoap.setBounds(700, 234, 64, 77);
		contentPane.add(btnSoap);
		
		JLabel lblNewLabel_1 = new JLabel("Soap");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(697, 209, 45, 18);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCup = new JButton("");
		btnCup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
               // imageFrame.getContentPane().add(lblCupcode);
               // imageFrame.pack();
               // imageFrame.setVisible(true);
				new cup().setVisible(true);
				double PriceOfItem=120;
				DefaultTableModel model=(DefaultTableModel) jTable.getModel();
				//model.addRow(new Object[] {"Cup","1",PriceOfItem});
				model.addRow(new Object[] {"Cup",PriceOfItem,"Taka"});
				Itemcost();
			}
		});
		btnCup.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\640px-Cup_and_Saucer_LACMA_47.35.6a-b_(1_of_3).jpg"));
		btnCup.setBounds(805, 238, 85, 73);
		contentPane.add(btnCup);
		
		JLabel lblNewLabel_2 = new JLabel("Cup");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(839, 206, 80, 24);
		contentPane.add(lblNewLabel_2);
		
		JButton btnWatch = new JButton("");
		btnWatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
               // imageFrame.getContentPane().add(lblWatch);
               // imageFrame.pack();
                //imageFrame.setVisible(true);
				new watch().setVisible(true);
				
				double PriceOfItem=700;
				DefaultTableModel model=(DefaultTableModel) jTable.getModel();
				//model.addRow(new Object[] {"Watch","1",PriceOfItem});
				model.addRow(new Object[] {"Watch",PriceOfItem,"Taka"});
				Itemcost();
			}
		});
		btnWatch.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\71VjM5LOeYL._AC_UL1500_.jpg"));
		btnWatch.setBounds(582, 380, 76, 73);
		contentPane.add(btnWatch);
		
		JLabel lblNewLabel_3 = new JLabel("Watch");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(588, 341, 85, 25);
		contentPane.add(lblNewLabel_3);
		
		JButton btnShirt = new JButton("");
		btnShirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
               // imageFrame.getContentPane().add(lblShirtcode);
               // imageFrame.pack();
               // imageFrame.setVisible(true);
				new Shirt().setVisible(true);
				double PriceOfItem=900;
				DefaultTableModel model=(DefaultTableModel) jTable.getModel();
				//model.addRow(new Object[] {"Shirt","1",PriceOfItem});
				model.addRow(new Object[] {"Shirt",PriceOfItem,"Taka"});
				Itemcost();
			}
		});
		btnShirt.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\download.jpg"));
		btnShirt.setBounds(712, 380, 70, 73);
		contentPane.add(btnShirt);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(555, 353, 70, -13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Shirt");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(714, 337, 50, 33);
		contentPane.add(lblNewLabel_5);
		
		JButton btnJug = new JButton("");
		btnJug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
              //  imageFrame.getContentPane().add(lblJugcode);
              //  imageFrame.pack();
               // imageFrame.setVisible(true);
				new jug().setVisible(true);
				double PriceOfItem=80;
				DefaultTableModel model=(DefaultTableModel) jTable.getModel();
				//model.addRow(new Object[] {"Jug","1",PriceOfItem});
				model.addRow(new Object[] {"Jug",PriceOfItem,"Taka"});
				Itemcost();
			}
		});
		btnJug.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\M0354_990116-6_1_(cropped).jpg"));
		btnJug.setBounds(811, 380, 79, 62);
		contentPane.add(btnJug);
		
		JLabel lblNewLabel_6 = new JLabel("Jug");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(836, 348, 64, 18);
		contentPane.add(lblNewLabel_6);
		
		jTable = new JTable();
		jTable.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		jTable.setFont(new Font("Tahoma", Font.BOLD, 14));
		jTable.setVisible(false);
		jTable.setBackground(new Color(255, 255, 255));
		jTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Item", "Price", null},
			},
			new String[] {
				"Item", "Price", "Currency"
			}
		));
		jTable.getColumnModel().getColumn(0).setPreferredWidth(98);
		jTable.getColumnModel().getColumn(0).setMinWidth(84);
		jTable.getColumnModel().getColumn(0).setMaxWidth(1000);
		jTable.getColumnModel().getColumn(1).setPreferredWidth(70);
		jTable.getColumnModel().getColumn(1).setMinWidth(47);
		jTable.getColumnModel().getColumn(2).setPreferredWidth(56);
		jTable.getColumnModel().getColumn(2).setMinWidth(11);
		jTable.setBounds(10, 0, 243, 573);
		jTable.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(jTable);
		
		jtxtTax = new JTextField();
		jtxtTax.setBounds(429, 480, 71, 25);
		contentPane.add(jtxtTax);
		jtxtTax.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Tax");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(363, 473, 56, 35);
		contentPane.add(lblNewLabel_7);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.setBounds(429, 445, 71, 25);
		contentPane.add(jtxtSubTotal);
		jtxtSubTotal.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Sub Total");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(338, 445, 81, 25);
		contentPane.add(lblNewLabel_8);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setBounds(429, 405, 71, 30);
		contentPane.add(jtxtTotal);
		jtxtTotal.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Payable");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBounds(342, 405, 71, 25);
		contentPane.add(lblNewLabel_9);
		
		jtxtChange = new JTextField();
		jtxtChange.setBounds(425, 366, 75, 25);
		contentPane.add(jtxtChange);
		jtxtChange.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Change");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(338, 362, 75, 28);
		contentPane.add(lblNewLabel_10);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setBounds(416, 326, 84, 25);
		contentPane.add(jtxtDisplay);
		jtxtDisplay.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Cash");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11.setBounds(342, 327, 84, 18);
		contentPane.add(lblNewLabel_11);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(comboBox.getSelectedItem().equals("Cash"));
				//{
					Change();
				//}
				//String total = jtxtTotal.getText(); //get the value from the text field
				//textArea.append("Total: " + total + "\n"); //append the value to the text area
			}
		});
		btnPay.setBackground(new Color(255, 255, 0));
		btnPay.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPay.setBounds(397, 279, 103, 21);
		contentPane.add(btnPay);
		
		JButton btnPaymentDone = new JButton("Make Invoice");
		btnPaymentDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double total = cTotal + cTax;
		         discount = total * 0.3;
		        // discount=String.format("%.2f",discount);
		         //double originalValue = 12.3456;
		         DecimalFormat decimalFormat = new DecimalFormat("#.##");
		         double discount1 = Double.parseDouble(decimalFormat.format(discount));
		         amountDue = total - discount;
		         double amountDue1 = Double.parseDouble(decimalFormat.format(amountDue));
		        //double cash = Double.parseDouble(jtxtCash.getText());
		         change = cash - amountDue;
		         double change1 = Double.parseDouble(decimalFormat.format(change));
		         double cTax1 = Double.parseDouble(decimalFormat.format(cTax));
				jtxtTotal.setText(String.format("%.2f", amountDue)); // Display the amount due after discount
		        jtxtChange.setText(String.format("%.2f", change)); // Display the change after cash payment
				DefaultTableModel model=(DefaultTableModel) jTable.getModel();
				model.addRow(new Object[] {"... ...",  ".....","....."});
				model.addRow(new Object[] {"Sub.Total:",cTotal,"Taka"});
				//model.addRow(new Object[] {"Discount:"," ",discount});
				model.addRow(new Object[] {"Discount:",discount1,"Taka "});
				//model.addRow(new Object[] {"Tax:"," ",cTax});
				model.addRow(new Object[] {"Tax:",cTax1,"Taka"});
				//model.addRow(new Object[] {"Payable:"," ",amountDue});
				model.addRow(new Object[] {"Payable:",amountDue1,"Taka "});
				//model.addRow(new Object[] {"Paid:"," ",cash});
				model.addRow(new Object[] {"Paid:",cash,"Taka"});
				//model.addRow(new Object[] {"Change:"," ",change});
				model.addRow(new Object[] {"Change:",change1,"Taka"});
				model.addRow(new Object[] {"... ...", ".....","....."});
				model.addRow(new Object[] {"Thank","You","..."});
				model.addRow(new Object[] {"Come","Again","..."});
				model.addRow(new Object[] {"... ...", ".....","....."});
				jTable.setVisible(true);
				JFrame frame = new JFrame("Invoice:");

                // Add the JTable to the JFrame
                frame.getContentPane().add(new JScrollPane(jTable), java.awt.BorderLayout.CENTER);

                // Set the size of the JFrame
                frame.setSize(400, 300);

                // Show the JFrame
                frame.setVisible(true);
				
				
				//new jtable().setVisible(true);		
				//new invoicetable(model).setVisible(true);
				//dispose();
				
				
				
				Itemcost();
			}
		});
		btnPaymentDone.setBackground(new Color(255, 128, 255));
		btnPaymentDone.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPaymentDone.setBounds(384, 219, 123, 33);
		contentPane.add(btnPaymentDone);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrinterJob printerJob = PrinterJob.getPrinterJob();
		        printerJob.setJobName("Print JTable");

		        printerJob.setPrintable(new Printable() {
		            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		                if (pageIndex > 0) {
		                    return Printable.NO_SUCH_PAGE;
		                }

		                Graphics2D graphics2D = (Graphics2D) graphics;
		                graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

		                jTable.print(graphics2D);

		                return Printable.PAGE_EXISTS;
		            }
		        });

		        boolean returningResult = printerJob.printDialog();

		        if (returningResult) {
		            try {
		                printerJob.print();
		            } catch (PrinterException printerException) {
		                JOptionPane.showMessageDialog(null, "Print Error: " + printerException.getMessage());
		            }
		        }
				
			
			
			
			
				
				
				
				
				
			}
		});
		btnPrint.setBackground(new Color(0, 128, 255));
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPrint.setBounds(384, 163, 103, 35);
		contentPane.add(btnPrint);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
				jtxtTax.setText(null);
				jtxtSubTotal.setText(null);
				jtxtTotal.setText(null);
				
				DefaultTableModel RecordTable = (DefaultTableModel) jTable.getModel();
				RecordTable.setRowCount(0);
			}
		});
		btnStart.setBackground(new Color(255, 255, 0));
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStart.setBounds(363, 10, 79, 33);
		contentPane.add(btnStart);
		
		JLabel lblNewLabel_12 = new JLabel("Promo Code");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_12.setBounds(384, 61, 114, 13);
		contentPane.add(lblNewLabel_12);
		
		textField_1 = new JTextField();
		textField_1.setBounds(378, 86, 109, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnApply = new JButton("Apply");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String promoCode = textField_1.getText();

			        if (promoCode.equals("iitju")) {
			            // execute the desired code here
			        	JOptionPane.showMessageDialog(null, "Congratulations you availed 30% discount");
			        	try {
				            Thread.sleep(3000); // wait for 3 seconds
				        } catch (InterruptedException ex) {
				            ex.printStackTrace();
				        }
				        double total = cTotal + cTax;
				         discount = total * 0.3;
				         amountDue = total - discount;
				        //double cash = Double.parseDouble(jtxtCash.getText());
				         change = cash - amountDue;

				        jtxtTotal.setText(String.format("%.2f", amountDue)); // Display the amount due after discount
				        jtxtChange.setText(String.format("%.2f", change)); // Display the change after cash payment
			            
			        } else {
			            //contentPane.showMessageDialog(this, "Sorry, wrong promo code.");
			        	JOptionPane.showMessageDialog(null, "Sorry, wrong promo code.");
			        }
			}
		});
		btnApply.setBackground(new Color(255, 0, 0));
		btnApply.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnApply.setBounds(388, 119, 85, 21);
		contentPane.add(btnApply);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new frontpage().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setBounds(834, 19, 56, 18);
		contentPane.add(btnNewButton);
	}
}
