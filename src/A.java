
public class A {
	
	int b=50;
	
	static
	{
		init();
		
		
	}
	
	static int i ;
	static String str="abgc";
	static void init()
	{
		System.out.println("First action to be performed");
	}
	static int test()
	{
		System.out.println("Test()");
		return 30;
	}
	
	public void call(){
		
		System.out.println("calling method");
	}
	
public static void main(String[] args)
{
	System.out.println(str);
	int i=10;
	int j=i;
	
	System.out.println(i);
	System.out.println(j);
	System.out.println(A.i);
	
	int res = test();
	System.out.println(res);
}
}
