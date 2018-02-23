package sum;
import java.util.*;
public class Num 
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int N = Sc.nextInt();
		System.out.println("Enter the value of K:");
		int K = Sc.nextInt();
		for(int i=0; i<N; i++)
		{
			a[i]=Sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<N; i++)
		{
			sum=a[i]+sum;
		}
		System.out.println("Sum of K value is"+"\n"+sum);
	}
}
