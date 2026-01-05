package learnJava2;

public class Doggy extends Animal
{
	public String type = "Doggymation";
	public static int num = 10;
	
	@Override
	public void Max() 
	{
		//super();
		System.out.println("john wick");
	} 
	
	public Doggy() 
	{
		super();
		System.out.println("doggs constru");
		//super(); //super class constructor should be called in first line, or else it throws error
	}
	
	public void Disps() 
	{
//		System.out.println(super.type);
//		System.out.println(type);
		
//		Max();
//		super.Max();
		
		System.out.println(super.num);
		System.out.println(num);
	}
	
	public static void main(String[] args) 
	{
		Doggy dg = new Doggy();
		dg.Disps();

	}

}
