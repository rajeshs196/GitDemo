package rajeshsele;

public class Calci 
{
	public int add(int a, int b) 
	{
		return a + b;
	}
	
	public double add(double a, double b) 
	{
		return a + b;
	}
	
	public static void main(String[] args) 
	{
		Calci cc = new Calci();
		System.out.println(cc.add(25, 50));
		System.out.println(cc.add(5.5, 6.5));

	}

}
