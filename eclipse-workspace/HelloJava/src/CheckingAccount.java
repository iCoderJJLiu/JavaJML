public class CheckingAccount extends BankAccount{
	private static double FEE = 0.15;
	public CheckingAccount(String name,double amount) {
		super(name,amount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	public boolean withdraw(double amount) {
		setBalance(getBalance() - FEE);
		return super.withdraw(amount);
	}
}
