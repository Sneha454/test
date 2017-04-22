package com.finals.variables;
class B
{
	final int id ;
	final String name ;
	{
	//	id =1111;
	//	name ="abc";
	}
	
	public B()
	{
		id =101;
		name ="xxx";
	}
	public B(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
}
class C extends B
{
	
}
public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		B b1 = new B(111,"aaa");
		C c= new C();
		System.out.println("id"+c.id);
		System.out.println("name"+c.name);
		
	}

}
