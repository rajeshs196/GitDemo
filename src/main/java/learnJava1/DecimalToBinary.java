package learnJava1;

public class DecimalToBinary 
{
	public static void main(String args[]) 
	{
		int x = 9;
		System.out.println("Decimal: " + x);
		System.out.print("Binary: ");
		deci2bin(x);
	}
	
	public static void deci2bin(int n) 
	{
		int[] binary = new int[50];
		
		int i = 0;
		while(n > 0) 
		{
			binary[i] = n % 2;
			n = n / 2;
			i++;
		}
		
		for(int j = i-1; j >= 0; j--)
			System.out.print(binary[j]);
	}
}
