package opps_project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.poi.EncryptedDocumentException;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class admin_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_page frame = new admin_page();
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
	public admin_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Page");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(308, 11, 140, 52);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton(" LogOut");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					superAdmin_login.main(null);
				} catch (EncryptedDocumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(600, 25, 115, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Manage User");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Manage_user.main(null);
				} catch (EncryptedDocumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
				
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBounds(58, 147, 207, 52);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Manage Fare");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					try {
						manage_fare.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (EncryptedDocumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton_3_1.setForeground(Color.BLACK);
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_3_1.setBounds(456, 147, 207, 52);
		contentPane.add(btnNewButton_3_1);
	}

}