package sum;
import java.util.*;

public class Vowel 
{
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = Sc.next().charAt(0);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
			System.out.println("\n Vowel");
		}
		else
			System.out.println("\n Consonent");
	}
}
