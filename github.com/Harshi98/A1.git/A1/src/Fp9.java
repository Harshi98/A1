import java.util.*;
public class Fp9 {
	public static void main(String[]args)
	{
		int n,rev=0;
		System.out.println("Enter a number");
		Scanner SC= new Scanner (System.in);
		n=SC.nextInt();
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+(n%10);
			n=n/10;
		}
		System.out.println(+rev);		
		}
	}
