package opps_project;


import java.awt.*;import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.*;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class superAdmin_login extends JFrame implements ActionListener{
    TextField t1,t2;
    Label l1,l2;
    Button b2,b3;
    GridBagLayout gbl;  
    GridBagConstraints gbc; 
    Font f1,f2;
    
    public superAdmin_login(){
        super("Login");        
        setTitle("Admin");
        setBackground(Color.WHITE);;
        f1 = new Font("TimesRoman",Font.BOLD,20);
        f2 = new Font("TimesRoman",Font.BOLD,15);
		
        gbl=new GridBagLayout(); 
	gbc=new GridBagConstraints();
        getContentPane().setLayout(gbl); 
	
        l1 = new Label("Username");
        l1.setFont(f1);
	
        l2 = new Label("Password");
        l2.setFont(f1);

	
        t1 = new TextField(15); 
	t2 = new TextField(15); 
        t2.setEchoChar('*');
	
	b2 = new Button("Reset");
        b2.setFont(f2);
		
        b3 = new Button("Submit");
        b3.setFont(f2);
		
        gbc.gridx=0;
	gbc.gridy=0; 
        gbl.setConstraints(l1,gbc);
	getContentPane().add(l1);
        
	gbc.gridx=2;
        gbc.gridy=0;
	gbl.setConstraints(t1,gbc);
        getContentPane().add(t1);
		
	gbc.gridx=0;
        gbc.gridy=2;
	gbl.setConstraints(l2,gbc);
        getContentPane().add(l2);

	gbc.gridx=2;
        gbc.gridy=2;
        gbl.setConstraints(t2,gbc);
	getContentPane().add(t2);
				
	
	gbc.gridx=0;
        gbc.gridy=8;
	gbl.setConstraints(b2,gbc);
        getContentPane().add(b2);

        gbc.gridx=2;
	gbc.gridy=8;
        gbl.setConstraints(b3,gbc);
	getContentPane().add(b3);
	
        gbc.gridx=4;
	gbc.gridy=8;
        

        b2.addActionListener(this);
        b3.addActionListener(this);
                
        setVisible(true);   
        setSize(400,250); 
        setLocation(400,200);   
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
          
            t1.setText("");  
            t2.setText(""); 
	}
      
        if(ae.getSource()==b3){
        	 String s1 = t1.getText();
             String s2 = t2.getText();

     		 if(s1.equals("admin")&& s2.equals("admin")) {
	                	
             	 admin_page.main(null); 
             	 dispose();
           
             }
               else  {	               
             	JOptionPane.showMessageDialog(null,"            INVALID LOGIN        ","ERROR",JOptionPane.ERROR_MESSAGE);
             	t1.setText(null);
             	t2.setText(null);
             }
		}}
            
   
    public static void main(String[] args) throws EncryptedDocumentException, IOException{
            new superAdmin_login();
    }
}
