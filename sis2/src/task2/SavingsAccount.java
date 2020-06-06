package task2;

public class SavingsAccount extends Account {
	private int counter;
    private final int FREE_TRANSACTIONS = 10;
    private double fee = 0.02;
	public SavingsAccount(int a) {
		super(a);
        counter = 0;		
	}
	@Override
    public void deposit(double sum) {
        if (counter >= FREE_TRANSACTIONS) {
            super.deposit(sum - fee);
        }
        else super.deposit(sum);
        counter++;
    }

    @Override
    public void withdraw(double sum) {
        if (counter >= FREE_TRANSACTIONS) super.withdraw(sum + fee);
        super.withdraw(sum);
        counter++;
    }

    @Override
    public void transfer(double amount, Account a) {
        if (counter < FREE_TRANSACTIONS) super.transfer(amount, a);
        else super.transfer(amount + fee, a);
        counter++;
    }

    public void divideFee(double amount) {
        this.fee = fee + amount;
    }

}
