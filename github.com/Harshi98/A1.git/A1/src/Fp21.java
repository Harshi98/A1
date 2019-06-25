import java.util.*;
public class Fp21 {
	public static void main(String[]args)
	{
		int Number, Reminder, Sum = 0;
		Scanner SC = new Scanner(System.in);		
		System.out.println(" Enter any Number: ");
		Number = SC.nextInt();
		
		for (Sum = 0; Number > 0; Number = Number/10){
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
		}
		System.out.format("Sum of the digits of Given Number %d",Sum);
	}

}
