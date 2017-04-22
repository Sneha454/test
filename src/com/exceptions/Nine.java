package com.exceptions;

import java.util.Scanner;

public class Nine {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter age");
		age = sc.nextInt();
		if(age<=0)
		{ 
			throw new ArithmeticException("Age should not be zero or negative");
			
		}
		System.out.println("done");
		

	}

}
