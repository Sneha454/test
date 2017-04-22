
public class IIB {
	int id;
	String name;
	public IIB()
	{
		System.out.println("H()");
	}
	public IIB(int id,String name)
	{
		this.id= id;
		this.name = name;
		System.out.println("H(int,String)");
	}
	// nameless block
	{
		System.out.println("IIB");
	}
	static
	{
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		IIB h= new IIB(10,"xxx");
		IIB h1= new IIB();
		IIB h2= new IIB(20,"aaa");
		System.out.println("main end");
	}
	static 
	{
		System.out.println("SIB2");
	}

}
