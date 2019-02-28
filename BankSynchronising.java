package multi.threading;
import java.util.Scanner;

public class BankSynchronising implements Runnable{
	static Scanner sc =  new Scanner(System.in);
	
	static	int bal=0,amt;
	public static void deposit(int amt) {
		bal = bal+amt;
		System.out.println("after deposit, your current balance is "+bal);
	}
	
	public static void withdraw(int amt){
		
			if((bal>amt)&&(amt>100)) {
					bal=bal-amt;
					System.out.println("after withdraw, your current balance is "+bal);
					}
				else 
			System.out.println("you dont have enough balance, plz deposit");
		}
	
	
	
	Thread thread =  Thread.currentThread();	
	
			
	public void run(){
		synchronized(thread) {
		System.out.println("enter to withdraw");
		withdraw(sc.nextInt());
		System.out.println("enter to deposit");
		deposit(sc.nextInt());
	}
	}
	
	
	public static void main(String args[]) {
		
		BankSynchronising obj1 = new BankSynchronising();
		Thread threadobj1  = new Thread(obj1);
		threadobj1.start();
	
		BankSynchronising obj2 = new BankSynchronising();
		Thread threadobj2  = new Thread(obj2);
		threadobj2.start();
	
	/*	synchronized(obj2){
			System.out.println("enter to withdraw");
			withdraw(sc.nextInt());
			System.out.println("enter to deposit");
			
			deposit(sc.nextInt());
		}*/
	
		//	obj2.withdraw(2000);
	}
}

