package Package1;


	class A
	{
		public A()
		{
		System.out.println("A()");
		}
	}
	class B extends A
	{
		public B()
		{
			System.out.println("B()");
			
		}
	}
	class C 
	{
		public C()
		{
			System.out.println("B()");
			
		}
		public C(int i)
		{
			System.out.println("C()");
		}
	}
	class D extends C
	{
		public D()
		{
			super(10);
			System.out.println("D()");
		}
	}
	public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println("-----------");
		B b = new B();
		System.out.println("-----------");
		C c = new C();
		System.out.println("-----------");
		D d = new D();
		System.out.println("-----------");

	}

}
