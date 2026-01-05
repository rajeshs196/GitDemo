package rajeshsele;

public interface ContinentalTraffic 
{
	public void TrainCrossSymbol();
	
	//can declare default static methods in interface from Java 8
	static void FastSignal() 
	{
		System.out.println("fast cars");
	}
}
