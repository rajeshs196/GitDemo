package learnJava2;

public class Excepton01 
{

	public static void main(String[] args) 
	{
		try 
		{
			int x = 5/0;
		}
		catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
		
		//int x = 5/0;

	}

}
