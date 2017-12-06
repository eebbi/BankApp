package Bank;

// A class for the exception if the account doesn't have enough funds
public class InsufficientFundsException extends Exception {
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException() {
        super("Not enough money on the account!");
    }
}