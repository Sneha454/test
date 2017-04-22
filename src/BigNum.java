import java.util.Scanner;

public class BigNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		a= sc.nextInt();
		System.out.println("enter b value");
		b= sc.nextInt();
		System.out.println("enter c value");
		c= sc.nextInt();
		if ((a>b)& (a>c))
		{
			System.out.println("a is big");
		
		}
		else if((b>a)& (b>c))
		{
			System.out.println("b is big");
		}
		else if((c>a)& (c>b))
		{
			System.out.println("c is big");
		}
		else if(a==b)
		{
			System.out.println("a and b are equal");
		}
		else if(b==c)
		{
			System.out.println("b and c are equal");
		}
		else if(c==a)
		{
			System.out.println("a and c are equal");
		}
		else if((a==b)&&(b==c))
		{
			System.out.println("a ,b and c are equal");
		}
	}

}
