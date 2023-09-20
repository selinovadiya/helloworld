package com.helloworld;

import java.util.Scanner;

public class If_else_read_each_digit_in_number {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter a 4 digit number");
		
		int n = s.nextInt();
		
		int third_digit = (n/10)%10;
		int second_digit = (n/100)%10;
		int first_digit = (n/1000)%10;
		int fourth_digit = n%10;
		
		if (first_digit+second_digit == third_digit + fourth_digit) {
			System.out.println("lucky number");
			
		}else
		{System.out.println("not a lucky number");
			
		}
	}

}
