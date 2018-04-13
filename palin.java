import java.util.*;

public class Palindrome

{
    
	public static void main(String args[]) 
    
	{
       
		int n=121, sum=0, remainder;
       	
		int original = n;
 
	        while(n!=0)
	
       {
           
			remainder=n%10;
          
		        sum=sum*10+remainder;
           
			n=n/10;
       
	       }
        
	       if(original==sum)
       
	       {
                   
			System.out.println("Given number is palindrome");
        
	       }
        
	       else
   
	       {
                   
			System.out.println("Given number is not palindrome");
        
	       }
       
    
	}

}
