
public class D {
	int id,age;
	String name;

	public D(int id,String name,int age){
		this.id= id;
		this.name= name;
		this.age= age;
		
	}
	public D(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1= new D(101,"Sneha",23);
		System.out.println(+d1.id+"\n"  +d1.name+ "\n" +d1.age);
		D d2= new D(101,"Sneha",23);
		System.out.println(+d2.id+ "\n"  +d2.name+ "\n" +d2.age);
	    D d3= new D();
        System.out.println(+d3.id+ "\n"  +d3.name+ "\n"  +d3.age);
	}

}
