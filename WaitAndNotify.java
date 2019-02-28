package Thread;

import java.util.Scanner;


public class WaitAndNotify implements Runnable{
	static Scanner sc =  new Scanner(System.in);
public String threadName;
WaitAndNotify(String thread){
	this.threadName=thread;
}
static	int bal=0,amt;
public synchronized void deposit(int amt) {
	bal = bal+amt;
	System.out.println("after deposit, your current balance is "+bal);
	notify();
	}

public synchronized void withdraw(int amt)throws Exception{
	
		if((bal>amt)&&(amt>100)) {
				bal=bal-amt;
				System.out.println("after withdraw, your current balance is "+bal);
				}
		else {
				System.out.println("you dont have enough balance, plz deposit");
			wait();
			}
		}

public void run(){
	
	//	String a ="run"; 
	
}


public static void main(String args[])throws Exception {
	
	WaitAndNotify obj1 = new WaitAndNotify("thread1");
	Thread threadobj1  = new Thread(obj1);
	threadobj1.start();
	System.out.println("enter amt to withdraw");
	obj1.withdraw(sc.nextInt());
	

	WaitAndNotify obj2 = new WaitAndNotify("thread2");
	Thread threadobj2  = new Thread(obj2);
	threadobj2.start();
	System.out.println("enter amt to deposit");
	obj2.deposit(sc.nextInt());
	
	
	//	obj2.withdraw(2000);
}
}

