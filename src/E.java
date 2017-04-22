
public class E {
	int id,salary;
	String name;

	public E(int id,String name,int salary){
		this.id= id;
		this.name= name;
		this.salary= salary;
		
	}
     public E(int id,String name){
		this.id=id;
		this.name= name;
	}
	public E(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e =new E();
		e.id= 1;
		e.name= "sneha";
		e.salary=50000;
		System.out.println("------Using constructor with no parameter-------");
		System.out.println("id is :"+e.id+"\nname is :" +e.name+"\nsalary is:"+e.salary);
		System.out.println("-----Using three parameters-------------------");
		E e1= new E(1,"Sneha",50000);
		System.out.println("id is :"+e1.id+"\nname is :" +e1.name+ "\nsalary is:" +e1.salary);
		System.out.println("-----Using no parameters-------------------");
		E e2= new E();
		System.out.println("id is :"+e2.id+"\nname is :" +e2.name+ "\nsalary is:" +e2.salary);
		System.out.println("------Using two parameters------------------");
		E e4= new E(1,"Sneha");
		System.out.println("id is :"+e4.id+"\nname is :"  +e4.name);
		
		
	}

}
