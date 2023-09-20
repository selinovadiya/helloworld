package com.helloworld;

public class Overload_parent {

	public static void main (String []args) {
		addme1(1,2);
		addme1(1,2,3);
	}
	
	
	public static int addme1(int a, int b) {
		return (a+b);
	}
	public static String addme1(int a, int b, int i) {
		return ("hello");
	}

}
				
				
