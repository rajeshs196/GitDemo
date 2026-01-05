package rajeshsele;

public class Cow extends Mammal
{
	@Override
	public void Sound() 
	{
		System.out.println("Mooo");
	}

	public static void main(String[] args) 
	{
		Mammal mam = new Mammal();
		mam.Sound();
		
		Mammal mam1 = new Cow();
		mam1.Sound();

		
	}

}
