package opps_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class book_ticket extends JFrame {
	private static FileInputStream fis;
    private static FileOutputStream fos;
    private static Workbook wb;
    private static Sheet sh;
    private static Cell cell;
    private static Row row;
    private CellStyle cellstyle;
    private Color mycolor;
    private String excelFilePath;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					book_ticket frame = new book_ticket();
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
	public book_ticket() throws EncryptedDocumentException, IOException{
		fis = new FileInputStream("./database.xlsx");
		wb=WorkbookFactory.create(fis);
		sh=wb.getSheet("Sheet2");
		setTitle("Book Ticket");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(411, 158, 131, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("From :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(32, 69, 78, 33);
		contentPane.add(lblNewLabel);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(411, 75, 235, 22);
		contentPane.add(comboBox);
		comboBox.setSelectedItem("to");
		comboBox.addItem("ERNAKULAM JUNCTION");
		comboBox.addItem("MGR CHENNAI CENTRAL");
		comboBox.addItem("VIJAYAWADA");
		comboBox.addItem("KACHEGUDA");
		final String no =textField.getText();
		
		
		JButton btnNewButton = new JButton("Book Ticket");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1 = textField.getText();
    			String s2 = textField_1.getText();
    			String s4 = textField_2.getText();
    			int noOfRows=sh.getLastRowNum();
    			row = sh.createRow(noOfRows+1);
    			cell = row.createCell(0);
    			cell.setCellValue(s2);
    			cell = row.createCell(1);
    			cell.setCellValue(s1);
    			try {
    				fos = new FileOutputStream("./database.xlsx");
    			} catch (FileNotFoundException e1) {
    				e1.printStackTrace();
    			}
    			try {
    				wb.write(fos);
    			} catch (IOException e1) {
    				e1.printStackTrace();
    			}
    			try {
    				fos.flush();
    			} catch (IOException e1) {
    				e1.printStackTrace();
    			}
    			try {
    				fos.close();
    			} catch (IOException e1) {
    				e1.printStackTrace();
    			}
    			textField.setText(null);
    			textField_1.setText(null);
    			textField_2.setText(null);
				
				
				
    			Object info = comboBox.getSelectedItem();
				if(info.equals("ERNAKULAM JUNCTION")) {
				JOptionPane.showMessageDialog(null, no +"  Tickets Have Been Booked to ERNAKULAM JUNCTION Please Check email To Print Tickets ","", JOptionPane.INFORMATION_MESSAGE);
					
				}
				else if(info.equals("MGR CHENNAI CENTRAL")){
				JOptionPane.showMessageDialog(null, no +"  Tickets Have Been Booked to MGR CHENNAI CENTRAL Please Check email To Print Tickets","", JOptionPane.INFORMATION_MESSAGE);
					
				}
				else if(info.equals("VIJAYAWADA")){
				JOptionPane.showMessageDialog(null, no +"  Tickets Have Been Booked to VIJAYAWADA Please Check email To Print Tickets","", JOptionPane.INFORMATION_MESSAGE);
					
				}
				else if(info.equals("KACHEGUDA")){
				JOptionPane.showMessageDialog(null, no +"  Tickets Have Been Booked to KACHEGUDA Please Check email To Print Tickets","", JOptionPane.INFORMATION_MESSAGE);
					}
								
				
			}
		});
		btnNewButton.setBounds(259, 399, 131, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("COIMBATORE JUNCTION");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(95, 72, 221, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(369, 72, 67, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Tickets");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(95, 151, 157, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Username");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(95, 231, 93, 20);
		contentPane.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(411, 228, 131, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Password");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(95, 300, 93, 20);
		contentPane.add(lblNewLabel_4_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(411, 300, 131, 20);
		contentPane.add(textField_2);

		
	}
}
