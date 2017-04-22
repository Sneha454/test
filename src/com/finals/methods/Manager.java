package com.finals.methods;
class A
{
	final void test1()
	{
		System.out.println("test A()");
	}
	void test2()
	{
		System.out.println("test2-A()");
	}
}
class B extends A
{
	void test2()
	{
		System.out.println("test2-B()");
	}
}
public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.test1();
		a.test2();
		B b= new B();
		b.test2();
	}

}
