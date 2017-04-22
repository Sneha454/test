package com.polymorphism;

public class Two {
int id;
String name;
double sal;
void setData(int id,String name,double sal)
{
	this.id = id;
	this.name = name;
	this.sal = sal;
}
void setData(int id,String name)
{
	this.id = id;
	this.name = name;
	//sal = 55000;
}
void setData(String name)
{
	//id = 100;
	this.name = name;
	//sal = 500000;
}
void display()
{
	System.out.println("Id::"+this.id);
	System.out.println("Name::"+this.name);
	System.out.println("sal::"+this.sal);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two t = new Two();
		t.setData("sneha");
		t.display();
		System.out.println("------------");
		t.setData(100,"sneha");
		t.display();
		System.out.println("------------");
		t.setData(100,"sneha",5000);
		t.display();
	}

}
