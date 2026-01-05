package learnJava2;

public class Excepton06 
{

	public static void main(String[] args) 
	{
		try 
		{
			int[] arr = new int[5];
			//arr[6] = 30/0;
			arr[7] = 9;
			
			String str = null;
			System.out.println(str.length());
		}
//		catch(Exception ex) //have to write this code piece at last, at decalring all known exceptions, or else below code blocks will be unreachable
//		{
//			
//		}
		catch(ArithmeticException ex) 
		{
			System.out.println(ex.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ex) 
		{
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}

	}

}
