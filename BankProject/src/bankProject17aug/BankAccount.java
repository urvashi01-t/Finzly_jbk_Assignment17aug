package bankProject17aug;

public abstract class BankAccount {
	 protected String accountNumber;
	 protected String accountHolderName;
	 protected double balance;
	 protected double minimumBalance;
	public BankAccount(String accountNumber,String accountHolderName,double balance,double minimumBalance) {
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.minimumBalance=minimumBalance;
		
	}
	



abstract void getAccountNumber() ;
   abstract void getAccountHolderName() ;
   abstract void getBalance() ;
   abstract void deposit(double amount) ;
   abstract void withdraw(double amount) ;

}
