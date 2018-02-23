package sum;
import java.util.*;
public class Digits 
{
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long n = Sc.nextLong();
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count=count+1;
		}
		System.out.println("The number of digits:"+count);
	}
}
