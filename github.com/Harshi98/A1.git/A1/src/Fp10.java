import java.util.*;
public class Fp10 {
	public static void main(String[]args)
	{
		char ch=0;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the characters");
		ch=SC.next().charAt(0);
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
			System.out.println("Alphabets");
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println("Digits");
			
		}
		else {
			System.out.println("Special characters");
		}
		
	}
	}


