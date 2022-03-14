package javaassignment;

class Account{
	int balance = 0;
	Account(int balance){
		this.balance = balance;
	}
	
	public void debit(int debitAmount) {
		if(balance >= debitAmount) {
			balance -= debitAmount;
		} else {
			System.out.println("Debit amount exceeded account balance");
		}
	}
}


public class DebitAmount {
	public static void main(String args[]){
		Account acc = new Account(6000);
		acc.debit(100);
		System.out.println(acc.balance);
		acc.debit(5901);
		System.out.println(acc.balance);
		acc.debit(5900);
		System.out.println(acc.balance);

	}

}
