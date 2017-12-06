package Bank;

import javax.swing.*;
import java.awt.event.*;


public class Login extends JFrame {
	private static final long serialVersionUID = 1L;
	
	Main frame2 = new Main();
	
	public Login() {
		super("Bank App");
		setResizable(false); // the user cannot resize the JFrame
		getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Position the JFrame at the center of the screen
		
		// Button, Label and TextField setups
		JLabel lblName = new JLabel("Your name:");
		JTextField textName = new JTextField();
		JButton btnLaunch = new JButton("Launch the app");


		// "Your name: " Label
		lblName.setBounds(10, 29, 76, 28);
		getContentPane().add(lblName);
		
		// Name JTextField setup
		textName.setBounds(77, 33, 162, 20);
		getContentPane().add(textName);
		textName.setColumns(10);
		
		// Determine what the "Login" button does when clicked
		btnLaunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false); // Close this Login JFrame
				frame2.setVisible(true); // Open the bank application JFrame
			}
		});
		btnLaunch.setBounds(10, 85, 229, 96);
		getContentPane().add(btnLaunch);
	}
}
