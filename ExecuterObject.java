import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecuterObject implements Runnable {
	
	public void run() {
		
		System.out.println("runn");
	}
	public static void main(String args[])throws Exception {
	
		Executor obj = Executors.newSingleThreadExecutor();
		obj.execute(new ExecuterObject());
		
	//	ExecutorService obj1 = Executors.newSingleThreadExecutor();
	//	obj1.execute(new ExecuterObject());
		
	//	ScheduledExecutorService obj2 = Executors.newSingleThreadScheduledExecutor();
	//	obj2.execute(new ExecuterObject());
		
		Executor obj2 = Executors.newFixedThreadPool(10);
		obj2.execute(new ExecuterObject());		
		
	}
}

