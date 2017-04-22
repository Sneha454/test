package com.exceptions;

public class Six {

	public static void main(String[] args) throws NullPointerException {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		String s1 = null;
		int i = s1.length();
		System.out.println(i);
		System.out.println("main end");

	}

}
