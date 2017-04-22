package com.exceptions;

import java.util.Scanner;

public class OwnException  extends ArithmeticException{
	public OwnException()
	{
		System.out.println("own exception");
	}
	public OwnException( String msg)
	{
		super(msg);
		System.out.println("Own excepyion 1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter age");
		age = sc.nextInt();
		if(age<=0)
		{ 
			System.out.println("hello");
			throw new OwnException("Age should not be zero or negative");
			
		}
		System.out.println("done");
		

	}

}
