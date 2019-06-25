import java.util.*;
public class Fp11 {
	public static void main(String[]args)
	{
	String Gen=args[0];
	int age=Integer.parseInt(args[1]);
	if(Gen.equals("Female")&&(age>=1&&age<=58)){
		System.out.println("Percentage Interest=8.2%");	
	}
	if(Gen.equals("Female")&&(age>=59&&age<=100)) {
		System.out.println("Percentage Interest=9.2%");
		
	}
	else {
		if(Gen.equals("Male")&&(age>=1&&age<=58)){
			System.out.println("Percentage Interest=8.4%");
		}
		else {
			if(Gen.equals("Male")&&(age>=59&&age<=100)) {
				System.out.println("Percentage Interest=10.5%");
				
			}
		}
			
		
	}
	}
}

