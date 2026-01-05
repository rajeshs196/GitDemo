package rajeshsele;

public class AirIndia extends ParentAircraft{

	public static void main(String[] args) 
	{
		
		//ParentAircraft pa = new ParentAircraft(); //cannot instantiate abstract class
		
//		ParentAircraft pa = new AirIndia();
//		pa.engine();
//		pa.safetyGuidelines();
//		pa.planeColor();
		
		AirIndia ai = new AirIndia();
		ai.engine();
		ai.safetyGuidelines();
		ai.planeColor();
		
		
	}

	@Override
	public void planeColor() 
	{
		System.out.println("plane color is Red & White");
		
	}

}
