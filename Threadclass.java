
public class Threadclass extends Thread {

	public String threadName;
	Threadclass(String thread){
		this.threadName=thread;
	}
	
		public void run() {
			System.out.println(threadName+ " is executing ");
		}
	public static void main(String args[])
	{
		
		Threadclass obj1 = new Threadclass("thread1");
		Thread threadobj1  = new Thread(obj1);
		threadobj1.start();
		
		Threadclass obj2 = new Threadclass("thread2");
		Thread threadobj2  = new Thread(obj2);
		threadobj2.start();
		
		Threadclass obj3 = new Threadclass("thread3");
		Thread threadobj3  = new Thread(obj3);
		threadobj3.start();
	}
	

}
