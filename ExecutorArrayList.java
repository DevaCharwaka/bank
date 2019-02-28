package Threading;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ExecutorArrayList implements Callable{
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> list = new ArrayList<String>();
	static String name;
	
	public String call() {
		
		Scanner sc = new Scanner(System.in);
		this.name = sc.next();
		return name;
		}
	public static void main(String args[])throws Exception {
		
		
		int i;
		ExecutorService obj1 = Executors.newFixedThreadPool(5);
		ArrayList<Future<String>> list = new ArrayList<Future<String>>();
		Callable cust = new ExecutorArrayList();
		
		for(i=0;i<5;i++)
		{
		Future future = obj1.submit(cust);
		list.add(future);
		}
		
		for(Future<String> obj:list) {
			
			System.out.println(obj.get());
			
		}
		
	}

}
