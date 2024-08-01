package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bookmyshow {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookmyshow window = new bookmyshow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bookmyshow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 593, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BookMyShow");
		lblNewLabel.setFont(new Font("Footlight MT Light", Font.BOLD, 25));
		lblNewLabel.setBounds(210, 24, 203, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(71, 97, 107, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Movie");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(71, 184, 94, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tickets");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_3.setBounds(71, 265, 107, 35);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(211, 97, 139, 35);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Kanthara", "Salaar", "OYE"}));
		c1.setBounds(210, 184, 140, 35);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "4", "6"}));
		c2.setBounds(210, 265, 140, 33);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String sm=(String) c1.getSelectedItem();
				String nt=(String) c2.getSelectedItem();
				int t=Integer.parseInt(nt);
				int bill=0;
				if(sm.equals("Kanthara"))
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+ "\n Selected Movie:"+sm+"\n Tickets:"+t+"\n your bill:"+bill);
				}
				else if(sm.equals("salaar"))
				{
					bill=100*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+ "\n Selected Movie:"+sm+"\n Tickets:"+t+"\n your bill:"+bill);
				}
				else if(sm.equals("OYE"))
				{
					bill=200*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+ "\n Selected Movie:"+sm+"\n Tickets:"+t+"\n your bill:"+bill);
				}
				else
				{
						JOptionPane.showMessageDialog(btnNewButton, "please select your movie ");
					}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(210, 355, 107, 58);
		frame.getContentPane().add(btnNewButton);
	}
}
