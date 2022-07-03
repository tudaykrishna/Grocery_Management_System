package opps_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JComboBox;

public class train_info extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					train_info frame = new train_info();
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
	public train_info() {
		setTitle("Train Info");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JButton btnNewButton = new JButton("Check the Train Info");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object info = comboBox.getSelectedItem();
				if(info.equals("ERNAKULAM JUNCTION")) {
					ernakulam_train_info a = new ernakulam_train_info();
					a.show();
					a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
				}
				else if(info.equals("MGR CHENNAI CENTRAL")){
					CHENNAI_train_info b = new CHENNAI_train_info();
					b.show();
					b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
				}
				else if(info.equals("VIJAYAWADA")){
					vijayawada_train_info c = new vijayawada_train_info();
					c.show();
					c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
				}
				else if(info.equals("KACHEGUDA")){
					kacheguda_train_info d = new kacheguda_train_info();
					d.show();
					d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
				}
			}
		});
		btnNewButton.setBounds(242, 180, 176, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("COIMBATORE JUNCTION");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(95, 72, 221, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(369, 72, 67, 27);
		contentPane.add(lblNewLabel_2);

		
	}
}
