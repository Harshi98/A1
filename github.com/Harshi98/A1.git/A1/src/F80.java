public class F80 {

	private int pin;

	public int CreatPIN(int input1,int input2,int input3)
	{
		int i;
		int s1,s2,s3;
		int arrs[] = new int[10];
		int a1=input1%10;
		arrs[0]=a1;
		int a2=input2%10;
		arrs[1]=a2;
		int a3=input3%10;
		arrs[2]=a3;
		s1=a1<a2?(a1<a3?a1:a3):(a2<a3?a2:a3);
		int a4=(input1/10)%10;
		arrs[3]=a4;
		int a5=(input2/10)%10;
		arrs[4]=a5;
		int a6=(input3/10)%10;
		arrs[5]=a6;
		s2=a4<a5?(a4<a6?a4:a6):(a5<a6?a5:a6);
		int a7=input1/100;
		arrs[6]=a7;
		int a8=input2/100;
		arrs[7]=a8;
		int a9=input3/100;
		arrs[8]=a9;
		s3=a7<a8?(a7<a9?a7:a9):(a8<a9?a8:a9);
		int l=arrs[0];
		for(i=0;i<=9;i++)
		{
			if(arrs[1]>l)
			{
				l=arrs[i];
						
			}
			int pin=l*1000+s3*100+s2*10+s1;
		}
		return pin;
		
	}

}
