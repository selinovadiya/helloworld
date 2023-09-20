package com.helloworld;

public class Overload_child extends Overload_parent{

	public static void main (String []args) {
		addme(1,2);
		addme(1,2,3);
	
		Overload_child.addme(5, 10);
		Overload_child.addme(10, 10);
		Overload_child.addme1(12, 10, 10);
		
		System.out.println(sum(2,3));
		System.out.println(sum(2,3,5));
		
		sayhi
	}
	
	
	public static int addme(int a, int b) {
		return (a+b);
	}
	public static int addme(int a, int b, int c) {
		return (a+b+c);
	}
	public static int sum (int y, int x) {
		return (x+y);
	}
	public static int sum (int y, int x, int z) {
		return (x+y+z);
	}
	public static void sayhi () {
		System.out.println("Hi");
	}
	public static String sayhi (String S2) {
		return("Hi"+ S2);
}
				
				
