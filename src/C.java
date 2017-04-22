
public class C {
	
	int id;
	String name;
	int age;
	
	void test()
	{
		System.out.println(" from test()");
	}
	public static void main(String[] args)
	{
		C ref = new C();
		C ref1 = new C();
		System.out.println(ref.id);
		System.out.println(ref.name);
		System.out.println(ref.age);
		ref.test();
        ref.id = 101;
        ref.name = "sneha";
        ref.age = 26;
        System.out.println("---------------------");
        ref.test();
        System.out.println(ref.id);
		System.out.println(ref.name);
		System.out.println(ref.age);
		 System.out.println("---------------------");
	        System.out.println(ref1.id);
			System.out.println(ref1.name);
			System.out.println(ref1.age);
        ref1.id = 102;
        ref1.name="janga";
        ref1.age =23;
        System.out.println("---------------------");
        System.out.println(ref1.id);
		System.out.println(ref1.name);
		System.out.println(ref1.age);
	}
	

}
