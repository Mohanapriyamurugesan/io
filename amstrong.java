import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int remain, sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int original=n;
		while(n!=0)
		{
		    remain=n%10;
		    sum=remain*remain*remain+sum;
		    n=n/10;
		}
		if(sum==original)
		{
		    System.out.println("Yes");
		}
		else
		{
		    System.out.println("No");
		}
	}
}
