package com.helloworld;

import java.util.Arrays;

public class Array_practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] randomint = new int [4];
		randomint[0]= 1;
		randomint[1]= 2;
		randomint[2]= 3;
		randomint[3]= 4;
		
		Arrays.sort(randomint);

		System.out.println(Arrays.toString(randomint));
		System.out.println(randomint.length);
				

	}

}
