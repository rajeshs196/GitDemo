package learnJava1;

public class swapNumbers 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 8;
		
		System.out.println("before " + a + " " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("after " + a + " " + b);
	}
}
