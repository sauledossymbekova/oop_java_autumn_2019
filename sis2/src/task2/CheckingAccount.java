package task2;

public class CheckingAccount extends Account {
    private double interestRate;
	public CheckingAccount(int a, double rate) {
		super(a);
        interestRate = rate;
	}
	public double getInterestRate() {
        return interestRate;
    }
    public void addInterestRate() {
        this.balance *= (1 + interestRate);
    }
}
