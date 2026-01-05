package rajeshsele;

public class Dog extends Animal
{

	public static void main(String[] args) 
	{
		Dog dg = new Dog();
		dg.Sound();
		
		Animal an = new Animal();
		an.Sound();
		
		Animal an1 = new Dog();
		an1.Sound();
		
		//Dog dg1 = new Animal(); //cannot convert from Animal to Dog
		//Dog dg1 = (Dog) new Animal(); //have to cast 

	}
	
	@Override
	public void Sound() 
	{
		System.out.println("dog barks: bow wow");
	}

}
