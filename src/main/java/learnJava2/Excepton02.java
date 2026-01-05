package learnJava2;

public class Excepton02 
{

	public static void main(String[] args) 
	{
		String str = null;
		
		try 
		{
			System.out.println(str.length());
		}	
		catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.getStackTrace());
		}
		finally
		{
			System.out.println("closing the db connection");
		}

	}

}
