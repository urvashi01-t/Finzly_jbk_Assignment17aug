package bankProject17aug;

public class SavingAccount extends BankAccount {
	private double intrestRate;
public SavingAccount(String accountNumber,String accountHolderName,double balance, double minimumBalance,double intrestRate) {
	super(accountNumber,accountHolderName,balance,minimumBalance);
	this.intrestRate=intrestRate;
	
	
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
	if (balance - amount >= minimumBalance) {
        balance =balance- amount;
        System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
    } else {
        System.out.println("Insufficient funds for withdrawal.");
    }
}
}
