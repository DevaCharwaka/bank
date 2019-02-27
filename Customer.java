package com.bank.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer implements Serializable {
	
	
		
	private	String name;
	private	long mobNo;
	private	String address;
	private	long accNo;
	private	long aadharNo;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getMobNo() {
			return mobNo;
		}
		public void setMobNo(long mobNo) {
			this.mobNo = mobNo;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getAccNo() {
			return accNo;
		}
		public void setAccNo(long accNo) {
			this.accNo = accNo;
		}
		public long getAadharNo() {
			return aadharNo;
		}
		public void setAadharNo(long aadharNo) {
			this.aadharNo = aadharNo;
		}
		
		
}
