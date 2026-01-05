package learnJava2;

public class Excepton07 
{

	public static void main(String[] args) 
	{
		try 
		{
			int arr1[] = new int[4];
			arr1[5] = 89;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) 
		{
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
		finally 
		{
			System.out.println("close the db connection");
		}

	}

}
