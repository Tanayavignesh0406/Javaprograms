package javaassignment;

class SavingsAccount{
	int savingsBalance;
	static int annualInterest;
	
	public int calculateMonthlyInterest() {
		int interest = (this.savingsBalance * annualInterest)/12;
		this.savingsBalance += interest;
		return interest;
	}
	
	public static void setAnnualInterest(int interest) {
		annualInterest = interest;
	}
}
public class SavingsAccountTest {
	public static void main(String args[]) {
		SavingsAccount saver1 = new SavingsAccount();
		saver1.savingsBalance = 2000;
		
		SavingsAccount saver2 = new SavingsAccount();
		saver2.savingsBalance = 3000;
		
		SavingsAccount.annualInterest = 4;
		
		System.out.println(saver1.calculateMonthlyInterest());
		System.out.println(saver2.calculateMonthlyInterest());
		
		SavingsAccount.annualInterest = 5;
		
		System.out.println(saver1.calculateMonthlyInterest());
		System.out.println(saver2.calculateMonthlyInterest());	

	}
}
