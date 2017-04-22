package com.polymorphism;

public class One {
	public void test()
	{
		System.out.println("test()");
	}
	void test(int i)
	{
		System.out.println("test(int)");
	}
	int test(int i,int j)
	{
		System.out.println("test(int,int)");
		return 0;
	}
	void test(String name)
	{
		System.out.println("test(String)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One o = new One();
		o.test();
		o.test(1);
		o.test(1,1);
		o.test("sneha");

	}

}
