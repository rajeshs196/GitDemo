package rajeshsele;

public class childClassDemo extends parentClassDemo
{
	public static void main(String[] args) 
	{
		childClassDemo ccd = new childClassDemo();
		ccd.brakes();
		ccd.Gear();
		ccd.differential();
		ccd.engine();
		ccd.colour();
		
		//parentClassDemo pcd = new parentClassDemo();
		//pcd.colour();
	}
	
	public void engine() 
	{
		System.out.println("1litre turbo gdi");
	}
	
	public void colour() 
	{
		System.out.println(color);
	}
}
