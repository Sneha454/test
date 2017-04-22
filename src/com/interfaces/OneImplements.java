package com.interfaces;

public  class OneImplements  implements One{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 OneImplements oi= new OneImplements();
 oi.test1();
 oi.test2();
 oi.test3();
 oi.test4();
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("test3");
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		System.out.println("test4");
	}

}
