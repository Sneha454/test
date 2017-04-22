package com.exceptions;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		//String s1=null;
		//System.out.println(s1.length());
		try
		{
			System.out.println("try block");
			String s1=null;
			System.out.println(s1.length());
			System.out.println("try ends");
		}
		catch(Exception e)
		{
			System.out.println("catch block");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("final block");
		}
	}

}
