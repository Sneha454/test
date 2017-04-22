package scom.samplePrograms;

import java.util.Scanner;

class A
{
	static
	{
		System.out.println("A-SIB");
	}
	
double total;
public double add(double i, double j)
{
	total =i+j;
	return total;
	
}
public double sub(double i, double j)
{
	total =i-j;
	return total;
	
}
public double mul(double i, double j)
{
	total =i*j;
	return total;
	
}

public double div(double i, double j)
{
	total =i/j;
	return total;
	
}
}

public class Computation {
	static
	{
		System.out.println("compu-SIB");
	}
	
public static void main(String[] args)
{

System.out.println("main-SIB");

A a= new A();
double i,j;
char opr;
double tot;
String decider;
Scanner sc = new Scanner(System.in);
do{
System.out.println("enter i valiue");
i = sc.nextDouble();
System.out.println("entere j value");
j = sc.nextDouble();
System.out.println("enter operator::");
opr = sc.next().charAt(0);
switch(opr)
{
	case '+': System.out.println("addition");
	tot=a.add(i, j);
	System.out.println(+tot);
	break;
	case '-': System.out.println("sub");
	tot=a.sub(i, j);
	System.out.println(+tot);
	break;
	case '*': System.out.println("multi");
	tot=a.mul(i, j);
	System.out.println(+tot);
	break;
	case '/': System.out.println("divide");
	tot=a.div(i, j);
	System.out.println(+tot);
	break;
	default :
	System.out.println("invalid");

}
	System.out.println("Do you want to continue (Y/N)::");
	decider =sc.next();

}while("Y".equalsIgnoreCase(decider));

	System.out.println("done");
}
}
