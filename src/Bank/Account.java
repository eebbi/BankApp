package Bank;

public class Account {
	
	private double balance;
	
	// A getter for the balance
	public String getBalance(){
		String Stringbalance = String.format(balance + "€ on your account.");
		return Stringbalance;
	}
	
	// A method to add money into the account with
	public String deposit(double amount) throws InsufficientFundsException{
		String text;
		balance = balance + amount;
		text = "Funds deposited into the account, " + "your current balance is " + balance + "€";
		return text;
	}
	
	// A method to withdraw money from the account with
	public String withdraw(double amount) throws InsufficientFundsException{
		String text;
		if (balance >= amount) {
			balance = balance - amount;
			text = "Funds successfully withdrawn," + " your current balance is " + balance + "€";
		} else {
			throw new InsufficientFundsException();
		}
		return text;
	}
}
