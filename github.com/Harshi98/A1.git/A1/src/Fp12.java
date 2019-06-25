import java.util.*;
public class Fp12 {
	public static void main(String[]args)
	{
		char ch;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the character:");
		ch=SC.next().charAt(0);
		switch (ch) {
		case 'R':
		{
			System.out.println("RED");
			break;
		}
		case 'B':
		{
			System.out.println("BLUE");
			break;
		}
		case 'Y':
		{
			System.out.println("YELLOW");
			break;
		}
		case 'G':
		{
			System.out.println("GREEN");
			break;
		}
		case 'O':
		{
			System.out.println("ORANGE");
			break;
		}
		case 'W':
		{
			System.out.println("WHITE");
			break;
			
		}
		default:
		{
			System.out.println("Invalid input");
		}
		
		
		}
	}

}
