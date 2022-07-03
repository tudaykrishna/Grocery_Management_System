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

public class cancle extends JFrame {
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
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cancle frame = new cancle();
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
	public cancle() throws EncryptedDocumentException, IOException{
		fis = new FileInputStream("./database.xlsx");
		wb=WorkbookFactory.create(fis);
		sh=wb.getSheet("Sheet2");
		final int noOfRows=sh.getLastRowNum();
		setTitle("Cancel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(411, 186, 131, 20);
		contentPane.add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(411, 87, 131, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Username");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(95, 87, 93, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Password");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(95, 186, 93, 20);
		contentPane.add(lblNewLabel_4_1);
		
		
		JButton btnNewButton = new JButton("Cancel Ticket");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String s1 = textField_1.getText();
	                String s2 = textField_2.getText();
	                
	        		for(int i=1;i<=noOfRows;i++) {
	        			Cell uday = sh.getRow(i).getCell(0);
	        			Cell krishna = sh.getRow(i).getCell(1);
	        			String ye = uday.toString();
	        			String ey = krishna.toString();
	        		 if(!ye.equals(s1)) {
		                	continue;}
		              else if(ye.equals(s1)){
		            	  row = sh.createRow(i);
		        			cell = row.createCell(0);
		        			cell.setCellValue("");	
		        			cell = row.createCell(1);
		        			cell.setCellValue("");
		        			try {
								fos = new FileOutputStream("./database.xlsx");
							} catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
		        			try {
								wb.write(fos);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
		        			try {
								fos.flush();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
		        			try {
								fos.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
	                	

	                	 break;
	                	 
	                }               
			}
        	JOptionPane.showMessageDialog(null,"          YOUR TICKET HAVE BEEN CANCLED       ","CANCLE TICKET", JOptionPane.INFORMATION_MESSAGE);			
								
				
			}
		});
		btnNewButton.setBounds(258, 275, 131, 33);
		contentPane.add(btnNewButton);

		
	}
}
