package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecom {

	private JFrame frame;
	int i=0;
	int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom window = new ecom();
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
	public ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 695, 581);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel tb1 = new JLabel("DHARM");
		tb1.setFont(new Font("Tahoma", Font.BOLD, 25));
		tb1.setBounds(221, 10, 143, 60);
		frame.getContentPane().add(tb1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\users\\asus\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-21 120221.png"));
		lblNewLabel.setBounds(45, 80, 150, 241);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\users\\asus\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-21 121200.png"));
		lblNewLabel_1.setBounds(333, 80, 150, 241);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("300/-");
		lblNewLabel_2.setFont(new Font("Footlight MT Light", Font.BOLD, 22));
		lblNewLabel_2.setBounds(69, 331, 89, 51);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("500/-");
		lblNewLabel_3.setFont(new Font("Footlight MT Light", Font.BOLD, 22));
		lblNewLabel_3.setBounds(385, 331, 74, 46);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lb = new JLabel("CART:0");
		lb.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb.setBounds(503, 40, 133, 36);
		frame.getContentPane().add(lb);
		
		JLabel lb2 = new JLabel("Bill : 0");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb2.setBounds(508, 90, 163, 36);
		frame.getContentPane().add(lb2);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART :"+i);
				bill=bill+300;
				lb2.setText("bill :"+bill);
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(45, 392, 150, 28);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				bill=bill+500;
				lb2.setText("bill :"+bill);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(353, 387, 143, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}

}
