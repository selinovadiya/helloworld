package com.helloworld;

import java.util.Scanner;

public class Various_practice {

	public static void main(String[] args) {
		
				Scanner s = new Scanner (System.in);
						
				System.out.println("Enter a number between 1 and 10");		
				
				int i = s.nextInt();
				
				while 	(i <1 || i>10) {
						
						System.out.println(i + " is not between 1 and 10");
					
						i = s.nextInt();
				}
				System.out.println(i + " is between 1 and 10");
						
					}
}
				
				
