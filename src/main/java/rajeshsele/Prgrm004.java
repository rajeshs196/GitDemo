package rajeshsele;

public class Prgrm004 
{

	public static void main(String[] args) 
	{
		Prgrm004 pg = new Prgrm004();
		String st = pg.getData();
		System.out.println(st);
		System.out.println(getData2());
	    
	    System.out.println("************");
	    System.out.println(Prgrm005.GetMaths2());
	    Prgrm005 pg5 = new Prgrm005();
	    int st1 = pg5.GetMaths();
	    System.out.println(st1);
	}
	
	public String getData() 
	{
		System.out.println("mad max");
		return "John wick";
	}

	public static String getData2() 
	{
		System.out.println("fast car");
		return "f1 car";
	}
}
