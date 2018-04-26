import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		int i, j, n, temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements:");
		for(i=0; i<n; i++)
		{
		    a[i]=s.nextInt();
		}
		System.out.println("The duplicate number is:");
		for(i=0; i<n; i++)
		{
		    for(j=i+1; j<n; j++)
		    {
		        if(a[i]==a[j])
		        {
		            temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		            System.out.println(a[i]);
		        }
		    }
		}
		System.out.println("The sorted list:");
		for(i=0; i<n; i++)
		{
		    for(j=i+1; j<n;i++)
		    {
		        if(a[i]>a[j])
		        {
		            temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		            System.out.println(a[i]);
		        }
		    }
		}
		
		
	}
}
