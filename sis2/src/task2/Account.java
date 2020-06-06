package task2;

public class Account {
	protected double balance;
    private int id;
    public Account() {}
    public Account(int a) {
        balance = 0;
        id = a;
    }
    public void deposit(double sum) {
        balance += sum;
    }
    public void withdraw(double sum) {
        if (balance < sum) {
            System.out.println("Denied");
        }
        else {
            balance -= sum;
        }
    }
    public double getBalance() {
        return balance;
    }
    public int getId() {
        return id;
    }
    public void transfer(double amount, Account a) {
        if (balance < amount) {
            System.out.println("Denied");
        }
        else {
        this.withdraw(amount);
        a.deposit(amount);
        }
    }
    public String toString() {
        return id + " " + balance;
    }
    public final void print() {
        System.out.println(toString());
    }
}
