package rajeshsele;

public class Calculator 
{
	public int add(int a, int b) 
	{
		return a + b;
	}
	
	public double add(double a, double b) 
	{
		return a + b;
	}
	
	public int add(int a, int b, int c) 
	{
		return a + b + c;
	}

	public static void main(String[] args) 
	{
		Calculator cc = new Calculator();
		System.out.println(cc.add(23.5, 56.7));
		System.out.println(cc.add(3, 90));
		System.out.println(cc.add(34, 6, 10));
	}

}
