package sum;
import java.util.*;
class Main 
{
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = Sc.nextInt();
		if(n<0)
		{
			System.out.println("Negative");
		}
		else if(n>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Zero");
		}
	}

}
