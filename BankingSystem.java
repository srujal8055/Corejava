package multithreading;

import java.util.Scanner;

class BankAccount
 		{
	private int balance=1000;
	 		public synchronized void deposit(int amount) {
	 			System.out.println("depositing " +amount);
	 			balance=balance+amount;
	 					System.out.println("BALANCE After Deposit "+balance);
	 		}
	 		public synchronized void withdraw(int amount) {
	 			System.out.println("trying to withdraw " +amount );
	 			if (balance>=amount) {
					balance-=amount;
					System.out.println("withdraw successfull,remaining balance is "+balance);
				}
	 			else {
	 				System.out.println("low balance try again ");
				}		
	 		 }
   		}
class DepositThread extends Thread {
    BankAccount account;
    int amount;

    DepositThread(BankAccount acc, int amt) {
        this.account = acc;
        this.amount = amt;
    }

    public void run() {
        account.deposit(amount);
    }
}
class WithdrawThread extends Thread {
    BankAccount account;
    int amount;

    WithdrawThread(BankAccount acc, int amt) {
        this.account = acc;
        this.amount = amt;
    }

    public void run() {
        account.withdraw(amount);
    }
}
public class BankingSystem {
	public static void main(String[] args) {
		BankAccount account= new BankAccount();
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter amount to deposit: ");
	        int depositAmount = scanner.nextInt();

	        System.out.print("Enter amount to withdraw: ");
	        int withdrawAmount = scanner.nextInt();
		DepositThread d=new DepositThread(account,depositAmount);
		WithdrawThread w=new WithdrawThread(account, withdrawAmount);
		d.start();
		w.start();
		
	}

}
