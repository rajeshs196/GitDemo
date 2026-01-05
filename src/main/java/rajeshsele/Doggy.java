package rajeshsele;

public class Doggy extends Animl
{
	public void bark()
	{
		System.out.println("bow wow");
	}
	
	public static void main(String[] args) 
	{
		
		Doggy dgg = new Doggy();
		dgg.bark();
		dgg.eats();
		
		Animl an = new Doggy();
		an.eats();
		//an.bark(); //need Doggy reference
		
	}

}
