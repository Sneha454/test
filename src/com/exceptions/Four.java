package com.exceptions;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		try
		{
			System.out.println("try start");
			String s1=null;
			System.out.println(s1.length());
			int i=10/0;
			
			System.out.println("try ends");
			
		}
		/*catch(Exception e)
		{
			System.out.println("catch start");
			e.printStackTrace();
			System.out.println("catch ends");
		}*/
		catch(ArithmeticException ex)
		{
			System.out.println("catch start");
			ex.printStackTrace();
			System.out.println("catch ends");
		}
		catch(NullPointerException ex)
		{
			System.out.println("catch start");
			ex.printStackTrace();
			System.out.println("catch ends");
		}
		System.out.println("main ends");

	}

}
