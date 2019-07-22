class Box {
	double width;
	double height;
	double depth;
	Box(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
		
		
	}
	double volume()
	{
		return(width*height*depth);
		
	}
	

}
public class Boxdemo

{
	public static void main(String[]args)
	{
	Box B1 = new Box(14.0,15.0,16.0);
	System.out.println("volume"+B1.volume());
	}
}
