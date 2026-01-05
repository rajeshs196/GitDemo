package rajeshsele;

public abstract class Shape 
{
	abstract void draw();
	
	public static void main(String[] args) 
	{
		Shape sp = new Circle();
		sp.draw();
		
		Shape sp1 = new Rectangle();
		sp1.draw();
		
	}
}
