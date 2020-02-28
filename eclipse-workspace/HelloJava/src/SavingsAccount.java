public class SavingsAccount extends BankAccount{
	private double rate = 0.025 ;
	private int savingsNumber = 0;
	private String accountNumber;
	public SavingsAccount (String name,double amount) 
	{
		super(name,amount);
		savingsNumber ++;
		setAccountNumber(super.getAccountNumber() + "-" + savingsNumber);
	}
	public SavingsAccount (SavingsAccount oldAccount,double amount)
	{
		super(oldAccount, amount);
		oldAccount.deposit(amount);
	}
	public void postInterest() 
	{
		setBalance(getBalance() + getBalance() * rate / 12);
	}
	public String getAccountNumber() {
		savingsNumber --;
		return super.getAccountNumber();
	}
}
