package task2;

import java.util.Random;
import java.util.Vector;

public class Bank {
	 Vector<Account> accounts;
	    public Bank() {
	        accounts = new Vector<Account>();
	    }
	    public void openAccount(Account a) {
	        if (accounts.contains(a)) {
	            System.out.println("Exists");
	        }
	        else accounts.add(a);
	    }
	    public void closeAccount(Account a) {
	        if (accounts.contains(a)) {
	            accounts.remove(a);
	        }
	        else {
	            System.out.println("Does not exist");
	        }
	    }
	    public void update() {
	        Random r = new Random();
	        for(Account a: accounts) {
	            if (r.nextInt() % 2 == 0) {
	                a.deposit(4);
	            }
	            else {
	                a.withdraw(4);
	            }
	            if (a.getClass() == SavingsAccount.class) {
	                SavingsAccount s = (SavingsAccount) a;
	                s.divideFee(0.03);
	            }
	            else if (a.getClass() == CheckingAccount.class) {
	                CheckingAccount c = (CheckingAccount) a;
	                c.addInterestRate();
	            }
	        }
	    }

}
