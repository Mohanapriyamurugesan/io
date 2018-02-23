package sum;
import java.util.*;
public class Alphabet 
{
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = Sc.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println(" Alphabet");
		}
		else
			System.out.println("Constant");
	}
}
