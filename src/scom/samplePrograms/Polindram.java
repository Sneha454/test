package scom.samplePrograms;
import java.util.Scanner;

public class Polindram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,temp;
Scanner sc = new Scanner(System.in);
System.out.println("enter num");
num = sc.nextInt();
int rem,rev=0;
temp= num;
while(num != 0)
{
	rem = num % 10;
	rev = rem + rev*10;
	num = num/10;
}
if(temp == rev)
{
	System.out.println("palindorme");
}
else
{
	System.out.println("not palindrome");
}
	
	}

}
