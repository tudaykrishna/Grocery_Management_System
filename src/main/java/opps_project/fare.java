package opps_project;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class fare extends JFrame {

	private JPanel contentPane;
	private static FileInputStream fis;
    private static FileOutputStream fos;
    private static Workbook wb;
    private static Sheet sh;
    private static Cell cell;
    private static Row row;
    private CellStyle cellstyle;
    private Color mycolor;
    private String excelFilePath;
	/**
	 * Launch the application.
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		fis = new FileInputStream("./database.xlsx");
		wb=WorkbookFactory.create(fis);
		sh=wb.getSheet("Sheet3");
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fare frame = new fare();
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
	public fare() {
		String q1,q2,q3,q4;
		Cell r1,r2,r3,r4;
		
	
		r1 = sh.getRow(1).getCell(0);
		r2 = sh.getRow(1).getCell(1);
		r3 = sh.getRow(1).getCell(2);
		r4 = sh.getRow(1).getCell(3);
		q1 = r1.toString();
		q2 = r2.toString();
		q3 = r3.toString();
		q4 = r4.toString();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ERNAKULAM JUNCTION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(67, 56, 247, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MGR CHENNAI CENTRAL");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_1.setBounds(67, 126, 247, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("VIJAYAWADA");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_2.setBounds(67, 199, 140, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("KACHEGUDA");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_3.setBounds(67, 266, 159, 39);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_8 = new JLabel(q1);
		lblNewLabel_8.setBounds(392, 68, 61, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel(q2);
		lblNewLabel_9.setBounds(392, 139, 61, 16);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel(q3);
		lblNewLabel_10.setBounds(392, 209, 61, 16);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel(q4);
		lblNewLabel_11.setBounds(392, 279, 61, 16);
		contentPane.add(lblNewLabel_11);
	}

}
