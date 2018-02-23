package sum;
import java.util.*;
public class Leap
{
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		long n = Sc.nextLong();
		if(n%4==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Non leap year");
		}
	}
}
