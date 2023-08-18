package bankProject17aug;

public class CheckingAccount extends BankAccount{
	private double overdraftLimit;
	public CheckingAccount(String accountNumber,String accountHolderName,double balance,double minimumBalance,double overdraftLimit) {
		super(accountNumber,accountHolderName,balance,minimumBalance);
		this. overdraftLimit=overdraftLimit;
	}
	void getAccountNumber() {
		
	}
	void getAccountHolderName() {
		 
	}
	void getBalance() {
		
	}
	void deposit(double amount) {
		
	}
	void withdraw(double amount) {
		if (balance - amount >= minimumBalance &&  amount<=overdraftLimit) {
	        balance =balance- amount;
	        System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
	    } else {
	        System.out.println("withdraw limit exceeds.");
	    }
		
	}
}
