import java.util.*;
public class Fp18 {
	public static void main(String[] args)
	{
		int r,sum=0,temp; 
		int n;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter a Number:");
		n=SC.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;	
		}
		if(temp==sum)
		{
			System.out.println("palindrome number");
			
		}
		else
		{
			System.out.println("Not a palindrome number");
			
			
		}
	}

}
