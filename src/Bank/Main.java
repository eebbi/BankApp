package Bank;

import java.awt.event.*;
import javax.swing.*;


public class Main extends JFrame  {
	private static final long serialVersionUID = 1L;

	
	public Main() {
        super("Bank App");
        setResizable(false); // the user cannot resize the JFrame
        setBounds(0,0,450,280); // Set the size of the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Position the JFrame at the center of the screen
		
		
		Account user = new Account(); // create an instance of the Account class
		
		// JLabel setups
		JLabel lblBalance = new JLabel("");
		JLabel lblInfo = new JLabel("");
        
		//JButtons setups
		JButton btnWithdraw = new JButton("Withdraw");
		JButton btnDeposit = new JButton("Deposit");
		JButton btnCheckBalance = new JButton("Check balance");
		JButton btnClear = new JButton("Clear textfield");
		JButton btnExit = new JButton("Exit");
		JButton numberOne = new JButton("1");
		JButton numberTwo = new JButton("2");
		JButton numberThree = new JButton("3");
		JButton numberFour = new JButton("4");
		JButton numberFive = new JButton("5");
		JButton numberSix = new JButton("6");
		JButton numberSeven = new JButton("7");
		JButton numberEight = new JButton("8");
		JButton numberNine = new JButton("9");
		JButton numberZero = new JButton("0");
		
		//JTextField setups
		JTextField txtInput = new JTextField();
		txtInput.setEditable(false);
		getContentPane().setLayout(null);
	
		// Number JButton setups, from 0 to 9
		numberZero.setBounds(317, 149, 48, 23);
		getContentPane().add(numberZero);
		numberZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = ((JButton)e.getSource()).getText();
                txtInput.setText(txtInput.getText()+val);
			}
		});
		
		numberOne.setBounds(259, 49, 48, 23);
		getContentPane().add(numberOne);
		numberOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = ((JButton)e.getSource()).getText();
                txtInput.setText(txtInput.getText()+val);
			}
		});
		
		numberTwo.setBounds(317, 49, 48, 23);
		getContentPane().add(numberTwo);
		numberTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = ((JButton)e.getSource()).getText();
                txtInput.setText(txtInput.getText()+val);
			}
		});
		
		numberThree.setBounds(375, 49, 48, 23);
		getContentPane().add(numberThree);
		numberThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = ((JButton)e.getSource()).getText();
                txtInput.setText(txtInput.getText()+val);
			}
		});
		
		numberFour.setBounds(259, 81, 48, 23);
		getContentPane().add(numberFour);
		numberFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = ((JButton)e.getSource()).getText();
                txtInput.setText(txtInput.getText()+val);
			}
		});
		
		numberFive.setBounds(317, 81, 48, 23);
		getContentPane().add(numberFive);
		numberFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = ((JButton)e.getSource()).getText();
                txtInput.setText(txtInput.getText()+val);
			}
		});
		
		numberSix.setBounds(375, 81, 48, 23);
		getContentPane().add(numberSix);
		numberSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = ((JButton)e.getSource()).getText();
                txtInput.setText(txtInput.getText()+val);
			}
		});
		
		numberSeven.setBounds(259, 115, 48, 23);
		getContentPane().add(numberSeven);
		numberSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = ((JButton)e.getSource()).getText();
                txtInput.setText(txtInput.getText()+val);
			}
		});
		
		numberEight.setBounds(317, 115, 48, 23);
		getContentPane().add(numberEight);
		numberEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = ((JButton)e.getSource()).getText();
                txtInput.setText(txtInput.getText()+val);
			}
		});
		
		numberNine.setBounds(375, 115, 48, 23);
		getContentPane().add(numberNine);
		numberNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = ((JButton)e.getSource()).getText();
                txtInput.setText(txtInput.getText()+val);
			}
		});
		
		
		// a JButton to clear the textfield with
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					txtInput.setText(null);
					lblInfo.setText(null);
			}
		});
		btnClear.setBounds(46, 115, 122, 23);
		getContentPane().add(btnClear);
		
		// a text field to select how much money to withdraw
		txtInput.setBounds(10, 50, 196, 20);
		getContentPane().add(txtInput);
		txtInput.setColumns(10);
		
		
		// Label that shows deposit and withdraw info
		lblInfo.setBounds(10, 11, 424, 30);
		getContentPane().add(lblInfo);
		
		
		// label that shows the accounts balance
		lblBalance.setBounds(10, 216, 196, 34);
		getContentPane().add(lblBalance);
		
		
		// Withdraw button setup when clicked
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double w = Double.parseDouble(txtInput.getText()); // Convert the Textfield String into Double
				user.withdraw(w); // Get the amount to withdraw
				lblInfo.setText(user.withdraw(0)); // give the info in lblInfo field about withdrawal
				txtInput.setText(null);
				
				}
				// catch the exception and show an error message if the user doesn't have enough funds
				catch (InsufficientFundsException exc){
                    JOptionPane.showMessageDialog(null, "You have insufficient funds to complete this withdrawal. Try again", 
                            "Not enough money on your account!", JOptionPane.ERROR_MESSAGE);
				}
				// catch the exception and show an error message if the user didn't input numbers into the JTextField
				catch (NumberFormatException nfexc) {
	                    JOptionPane.showMessageDialog(null, "You didn't type a number. Try again", 
	                    		"Input was not numerical", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnWithdraw.setBounds(10, 81, 89, 23);
		getContentPane().add(btnWithdraw);
		
		
		
		// Deposit button setup when clicked
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			try{
				double d = Double.parseDouble(txtInput.getText()); // Convert the Textfield String into Double
				user.deposit(d); // Get the amount to deposit
				lblInfo.setText(user.deposit(0));
				txtInput.setText(null);
				} 
			// catch the exception and show an error message if the user doesn't have enough funds
			catch (InsufficientFundsException exc){
                JOptionPane.showMessageDialog(null, "You have insufficient funds to complete this deposit. Try again", 
                        "Not enough money on your account!", JOptionPane.ERROR_MESSAGE);
			}
			// catch the exception and show an error message if the user didn't input numbers into the JTextField
			catch (NumberFormatException nfexc) {
                JOptionPane.showMessageDialog(null, "You didn't type a number."
                        + " Try again", 
                        "Input was not numerical", JOptionPane.ERROR_MESSAGE);
		}
	}
});
		btnDeposit.setBounds(117, 81, 89, 23);
		getContentPane().add(btnDeposit);
		
		
		// a button to check the balance with
		btnCheckBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblBalance.setText(user.getBalance()); // show the balance on the bottom of the JFrame
			}
		});
		btnCheckBalance.setBounds(10, 154, 196, 51);
		getContentPane().add(btnCheckBalance);
		
		// a button to exit the app with
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnExit.setBounds(345, 216, 89, 24);
		getContentPane().add(btnExit);
	}		
}

