package bankProject17aug;

public class Operaion {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount("Sbi2133", "urvashi", 5000, 2000, 1000);
		sa.withdraw(500);
          CheckingAccount ca= new CheckingAccount("Sbi2133", "urvashi", 5000, 2000, 1000);
          ca.withdraw(500);
	}

}
