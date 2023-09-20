package com.helloworld;

import java.util.Random;

public class Practice_overload {

	public static void main(String[] args) {
		int result1 = addnumbers(1,2);
		double result2 = addnumbers(1.1,2.1);
		int result3 = addnumbers(1,2,3);
		
		Practice_overload p = new Practice_overload();
				
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		p.addnumbers();
		
}

	
	public static int addnumbers(int a, int b) {
		return a+b;
	}
	public static double addnumbers(double a, double b) {
		return a+b;
	}
	public static int addnumbers(int a, int b, int c) {
		return a+b+c;
	}
	public void addnumbers() {
		Random r = new Random();
		System.out.println(r.nextInt(23));
	}
		
}
		