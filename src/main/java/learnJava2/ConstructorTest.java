package learnJava2;

public class ConstructorTest
{
	int x;
	
	int modelYear;
	String modelName;
	
	public ConstructorTest()
	{
		x++;
	}
	
	public ConstructorTest(int y) 
	{
		x = y;
	}
	
	public ConstructorTest(int year, String name) 
	{
		modelYear = year;
		modelName = name;
	}

	public static void main(String[] args)
	{
		ConstructorTest ct = new ConstructorTest();
		System.out.println(ct.x);
		
		ConstructorTest ct1 = new ConstructorTest();
		System.out.println(ct1.x);
		
		ConstructorTest ct2 = new ConstructorTest(1990, "MadMax");
		System.out.println(ct2.modelYear +  " " + ct2.modelName);

	}

}
