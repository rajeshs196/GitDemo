package rajeshsele;

public class ConstructorTest 
{

	public static void main(String[] args) 
	{
		
//		Cars cr = new Cars("Toyota", 40);
//		cr.display();
		
//		new count();
//		count.displ();
//		
//		new count();
//		count.displ();

		new count().dispp();
		new count().dispp();
		
	}

}

class Cars
{
	String brand;
	int speed;
	
	Cars(String brand, int speed)
	{
		this.brand = brand;
		this.speed = speed;
	}
	
	void display() 
	{
		System.out.println(brand + " " + speed);
	}
}

class count
{
	static int count;
	int cnt; 
	
	count()
	{
		count++;
		cnt++;
	}
	
	static void displ() 
	{
		System.out.println(count);
	}
	
	void dispp() 
	{
		System.out.println(this.cnt);
	}
}