package com.bank.view;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;


import com.bank.model.Customer;

public class Registration {
	static	Scanner sc = new Scanner(System.in);
	static int scan() {
		
		int n;
		System.out.println("enter the number of customers");
		n=sc.nextInt();
		return n;
	}

static ArrayList<Customer> arraylist = new ArrayList<Customer>();

	static void details(int n){
	for(int i=0;i<n;i++) {
		Customer cust = new Customer();
		System.out.println("Enter name ");
		cust.setName(sc.next());
		System.out.println("Enter mobile number ");
		cust.setMobNo(sc.nextLong());
		System.out.println("Enter Address ");
		cust.setAddress(sc.next());
		System.out.println("Enter Account number ");
		cust.setAccNo(sc.nextLong());
		System.out.println("Enter aadhar number");
		cust.setAadharNo(sc.nextLong());
		arraylist.add(cust);
	
	}
	}
	static void  serializable()throws Exception {
		
		 
		
		FileOutputStream fileoutputstream = new FileOutputStream("E:\\custdetails.txt");
		ObjectOutputStream objoutputStream = new ObjectOutputStream(fileoutputstream);
		objoutputStream.writeObject(arraylist);
	
	}
	static void  deserializable()throws Exception {
		
		 
		long aadharnum;
		System.out.println("enter new cust aadhar number");
		aadharnum= sc.nextLong();
		 FileInputStream fileinputstream = new FileInputStream("E:\\custdetails.txt");
		ObjectInputStream objinputStream = new ObjectInputStream(fileinputstream);
		ArrayList<Customer> arraylist2 = (ArrayList<Customer>)objinputStream.readObject();
	
		for(Customer obj:arraylist2) {
			
			if(obj.getAadharNo()==aadharnum)
			{	System.out.println("already exist");
				break;
				
			}
				else {
					System.out.println("you can do registration, enter the registration");
					details(1);
					break;
		}
		}
		for(Customer obj2:arraylist)		
			System.out.println(obj2.getName()+" "+obj2.getMobNo()+" "+obj2.getAddress()+" "+obj2.getAccNo()+" "+obj2.getAadharNo());
	
	}
	
	public static void main(String args[]) {

		
		details(scan());
		
		try {
			serializable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			deserializable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
