import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoCallable implements Callable {
	
	public String call() {
		
	System.out.println(Thread.currentThread().getName());
	
		return Thread.currentThread().getName();
	}
	public static void main(String args[]) {
		ExecutorService obj1 = Executors.newSingleThreadExecutor();
	
		Callable task = new DemoCallable();
		
		Future<String> name = obj1.submit(task);
		
		System.out.println(name);
	
	}

}
