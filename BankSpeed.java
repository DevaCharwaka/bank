package com.bank.thread;



public class BankSpeed implements Runnable {
	public String threadName;
	BankSpeed(String thread){
		this.threadName=thread;
	}
	static	int bal=0,amt;
	
	public static void withdraw(int amt){
		long a= System.currentTimeMillis();
		if(amt>100)
			System.out.println("after withdraw, your current balance is "+bal);
		else
			System.out.println("you dont have enough balance, plz deposit");
		long start= System.currentTimeMillis();
		System.out.println(start);
	
	}
	public static void deposit(int amt) {
		bal = bal+amt;
		System.out.println("after deposit, your current balance is "+bal);
		long end= System.currentTimeMillis();
		System.out.println(end);
	}
	public void run(){
		
		
	}
	
	
	public static void main(String args[]) {
		long start1= System.currentTimeMillis();
		System.out.println(start1);
		
		BankSpeed obj1 = new BankSpeed("thread1");
		Thread threadobj1  = new Thread(obj1);
		threadobj1.start();
		
		obj1.deposit(1000);
		
		BankSpeed obj2 = new BankSpeed("thread2");
		Thread threadobj2  = new Thread(obj2);
		threadobj2.start();
		obj2.withdraw(500);
		long end1= System.currentTimeMillis();
		long diff=start1-end1;
		System.out.println(diff);
	}
}
