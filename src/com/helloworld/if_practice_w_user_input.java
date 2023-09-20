package com.helloworld;

import java.util.Scanner;

public class if_practice_w_user_input {

	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		
		Scanner s = new Scanner (System.in);
		
		int n = s.nextInt();
		
		if (n %2 == 0)
			System.out.println("even number");
		
		if (!(n %2 == 0))
			System.out.println("odd number");
		
		
		
		
		
		
		
		

	}

}
