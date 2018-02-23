package sum;
import java.util.*;
public class Larger 
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Enter the array elements:");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		int larger=a[0];
		for(int i=0; i<n; i++)
		{
			if(larger<a[i])
			{
				larger=a[i];
			}
		}
		System.out.println(" Large number is:"+larger);
	}
}
