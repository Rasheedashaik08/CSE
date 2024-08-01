package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reg {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reg window = new Reg();
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
	public Reg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 437, 536);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Footlight MT Light", Font.BOLD, 22));
		lblNewLabel.setBounds(135, 31, 123, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Footlight MT Light", Font.BOLD, 22));
		lblNewLabel_1.setBounds(51, 90, 74, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch");
		lblNewLabel_2.setFont(new Font("Footlight MT Light", Font.BOLD, 22));
		lblNewLabel_2.setBounds(50, 143, 75, 43);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setFont(new Font("Footlight MT Light", Font.BOLD, 22));
		lblNewLabel_3.setBounds(51, 197, 81, 36);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Programming");
		lblNewLabel_4.setFont(new Font("Footlight MT Light", Font.BOLD, 22));
		lblNewLabel_4.setBounds(51, 257, 133, 36);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Tahoma", Font.BOLD, 12));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "CSE", "IT", "ECE", "ME"}));
		cb1.setBounds(183, 143, 108, 34);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("female");
		r1.setFont(new Font("Tahoma", Font.BOLD, 12));
		r1.setBounds(155, 207, 103, 26);
		frame.getContentPane().add(r1);
		
		JCheckBox c1 = new JCheckBox("JAVA");
		c1.setFont(new Font("Tahoma", Font.BOLD, 12));
		c1.setBounds(198, 267, 93, 21);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("PYTHON");
		c2.setFont(new Font("Tahoma", Font.BOLD, 12));
		c2.setBounds(324, 267, 93, 21);
		frame.getContentPane().add(c2);

		JRadioButton r2 = new JRadioButton("male");
		r2.setFont(new Font("Tahoma", Font.BOLD, 12));
		r2.setBounds(287, 207, 103, 26);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		tb1 = new JTextField();
		tb1.setBounds(183, 92, 108, 34);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JCheckBox c3 = new JCheckBox("C");
		c3.setFont(new Font("Tahoma", Font.BOLD, 12));
		c3.setBounds(198, 324, 93, 21);
		frame.getContentPane().add(c3);
		
		JCheckBox c4 = new JCheckBox("React JS");
		c4.setFont(new Font("Tahoma", Font.BOLD, 12));
		c4.setBounds(324, 325, 93, 21);
		frame.getContentPane().add(c4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String n=tb1.getText();
				String b=(String) cb1.getSelectedItem();
				String g;
				if(r1.isSelected())
				{
					g="female";
				}
				else if(r2.isSelected())
				{
					g="male";
				}
				else
				{
					g="Invalid";
				}
				String pl="";
				if(c1.isSelected())
				{
					pl=pl+" JAVA";
				}
				 if(c2.isSelected())
				{
					pl=pl+" PYTHON";
				}
				 if(c3.isSelected())
				{
					pl=pl+" C";
				}
				 if(c4.isSelected())
				{
					pl=pl+" React JS";
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, " Hello "+n+"\nPlease confirm your details : \nBranch:"+b+"\n Gender :"+g+"\n Programming:"+pl);
				if(res==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton,"Registration done!");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"Registration Cancelled!");
				}
			}
		});
		btnNewButton.setFont(new Font("Footlight MT Light", Font.BOLD, 22));
		btnNewButton.setBounds(167, 397, 124, 36);
		frame.getContentPane().add(btnNewButton);
		
	}
}
