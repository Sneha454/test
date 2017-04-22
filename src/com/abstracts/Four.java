package com.abstracts;

abstract class Three {
	void test1()
	{
		System.out.println("tets1()");
	}
	void test2()
	{
		System.out.println("tets2()");
		
}

abstract void test3();
}
public class Four extends Three {
	/*void test1()
	{
		System.out.println("tets1()");
	}
	void test2()
	{
		System.out.println("tets2()");
		
}*/

	void test3()
	{
		System.out.println("test3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three th= new Four();
		th.test3();
		th.test1();
		th.test2();

	}

}
