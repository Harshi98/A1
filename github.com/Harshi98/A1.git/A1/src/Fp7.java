import java.util.*;
public class Fp7 {
	public static void main(String []args)
	{
		char ch1;
		char p;
		Scanner SC= new Scanner(System.in);
		ch1=SC.next().charAt(0);
		if((ch1>='a')&&(ch1<='z'))
		{
			p=(char)(ch1-32);
			System.out.println(p);
		}
		else
		{
			p=(char)(ch1+32);
			System.out.println(p);		}
		
	}

}
