import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org,reverse ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		org = sc.nextLine();
		System.out.println(org);
		for(int i=org.length()-1;i>=0;i--)

	{
		reverse =reverse+org.charAt(i);
			}
		System.out.println(reverse);
	}

}
