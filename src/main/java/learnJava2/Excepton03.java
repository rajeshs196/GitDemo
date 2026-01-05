package learnJava2;

public class Excepton03 
{
	public static void main(String[] args) 
	{
		try 
		{
			//int y = 5/0;
			divids();
		}
		catch(Exception ex) 
		{
			System.out.println(ex.getLocalizedMessage());
			System.out.println(ex.getMessage());
		}
	}
	
	public static void divids() 
	{
		throw new ArithmeticException("trying to divide by zero 0");
	}
}
