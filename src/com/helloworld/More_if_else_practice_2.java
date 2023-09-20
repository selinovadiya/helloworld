package com.helloworld;

import java.util.Scanner;

public class More_if_else_practice_2 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		
		Scanner s = new Scanner (System.in);
				
		int n = s.nextInt();

		if (n % 2 == 0) {
			
			System.out.println("even number");}
		
		
		else {
					
			System.out.println("odd number");}
		

	}

}
