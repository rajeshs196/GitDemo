package learnJava1;

public class FactorialIterative 
{
	public static void main(String[] args) 
	{
		int a = 6;
		System.out.println(factIterative(a));
		System.out.println(factRecursive(a));
		System.out.println(ternaryfact(a));
	}
	
	static int factIterative(int x) 
	{
		int res = 1, i;
		
		for(i = 2; i <= x; i++)
				res *= i;
		return res;
	}
	
	static int factRecursive(int y) 
	{
		if(y == 0)
			return 1;
		
		return y * factRecursive(y - 1);
	}
	
	static int ternaryfact(int h) 
	{
		return (h == 1 || h == 0) ? 1: h * ternaryfact(h - 1);
	}
	
	public void Steup() 
	{
		System.out.println("the streets branch");
	}
}
