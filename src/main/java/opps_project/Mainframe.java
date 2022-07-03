package opps_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.poi.EncryptedDocumentException;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;

public class Mainframe extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainframe frame = new Mainframe();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				    frame.setVisible(true);
				    frame.setResizable(false);
				    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Mainframe() {
		setName("frame21");
		setTitle("RAILWAY MANAGEMENT SYSTEM");
		setForeground(Color.CYAN);
		setBounds(100, 100, 1980, 1070);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
        getContentPane().setLayout(null); 

        JLabel NewLabel = new JLabel("");
	NewLabel.setIcon(new ImageIcon("./mainframe.jpg"));
	NewLabel.setBounds(0, 0, 1924, 1003); 
	getContentPane().add(NewLabel);
	
	 JLabel RailwayManagementSystem = new JLabel("INDIAN RAILWAYS WELCOMES YOU");
	 RailwayManagementSystem.setForeground(Color.RED);
	 RailwayManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 36));
	 RailwayManagementSystem.setBounds(700, 60, 1000, 55);
		NewLabel.add(RailwayManagementSystem);
		
		
		 JMenuBar menuBar = new JMenuBar();
			setJMenuBar(menuBar);
				
		        JMenu RailwaySystem = new JMenu("RAILWAY SYSTEM");
		        RailwaySystem.setForeground(Color.BLUE);
			menuBar.add(RailwaySystem);
				
		        JMenuItem TrainDetails = new JMenuItem("TRAIN INFO");
		        TrainDetails.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		train_info info = new train_info();
		        		info.show();
		        		info.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		        	}
		        });
		        RailwaySystem.add(TrainDetails);
				
			JMenuItem PassengerDetails = new JMenuItem("TRAIN TIMETABLE");
			PassengerDetails.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					time_table pi = new time_table();
					pi.show();
					pi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
			});
			RailwaySystem.add(PassengerDetails);
				
			JMenuItem Cancellation = new JMenuItem("CANCELLATION");
			Cancellation.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cancle can = null;
					try {
						can = new cancle();
					} catch (EncryptedDocumentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					can.show();
					can.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
			});
			
			JMenuItem mntmNewMenuItem_1 = new JMenuItem("PAYMENT DETAILS");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					payment_dietals show = null;
					try {
						show = new payment_dietals();
					} catch (EncryptedDocumentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					show.show();
					show.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
			});
			RailwaySystem.add(mntmNewMenuItem_1);
			RailwaySystem.add(Cancellation);
				
			JMenu Ticket = new JMenu("TICKET");
		        Ticket.setForeground(Color.RED);
			menuBar.add(Ticket);
			
			JMenuItem mntmNewMenuItem = new JMenuItem("BOOK TICKET");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					book_ticket ticket = null;
					try {
						ticket = new book_ticket();
					} catch (EncryptedDocumentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					ticket.show();
					ticket.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
				}
			});
			Ticket.add(mntmNewMenuItem);
			
			JMenu mnNewMenu_1 = new JMenu("FARE ENQUIRY ");
			mnNewMenu_1.setForeground(Color.BLUE);
			menuBar.add(mnNewMenu_1);
			
			JMenuItem mntmNewMenuItem_5 = new JMenuItem("CHECK THE TRAIN FARE");
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						fare.main(null);
					} catch (EncryptedDocumentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			});
			mnNewMenu_1.add(mntmNewMenuItem_5);
			
			JMenu mnNewMenu = new JMenu("CUSTOMER SERVICES");
			mnNewMenu.setForeground(Color.RED);
			mnNewMenu.setBackground(Color.WHITE);
			menuBar.add(mnNewMenu);
			
			JMenuItem mntmNewMenuItem_3 = new JMenuItem("GET SERVICES EMAIL \r\n");
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SERVICE_EMAIL qw = new SERVICE_EMAIL();
					qw.show();
					qw.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
					
				}
			});
			mnNewMenu.add(mntmNewMenuItem_3);
			
			JMenuItem mntmNewMenuItem_2 = new JMenuItem("GET SERVICES NUMBERS \r\n");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SERVICE_CELL cell = new SERVICE_CELL();
					cell.show();
					cell.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
			});
			mnNewMenu.add(mntmNewMenuItem_2);
			
			JMenu mnNewMenu_2 = new JMenu("EDIT USER PROFILE");
			mnNewMenu_2.setForeground(Color.BLUE);
			menuBar.add(mnNewMenu_2);
			
			JMenuItem mntmNewMenuItem_6 = new JMenuItem("CHANGE PASSWORD");
			mntmNewMenuItem_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {
						Change_password.main(null);
					} catch (IOException ex) {
						ex.printStackTrace();
					}
					dispose();
				}
			});
			mnNewMenu_2.add(mntmNewMenuItem_6);
			
			JMenuItem mntmNewMenuItem_4 = new JMenuItem("LOG OUT");
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login.main(null);
					dispose();
				}
			});
			mntmNewMenuItem_4.setForeground(Color.RED);
			menuBar.add(mntmNewMenuItem_4);
	}
}
