package learnJava2;

import rajeshsele.AirIndia;

public class PrivateTest1 //we cannot declare class as private or protected. only public, abstract and final can be used
{
	public static void main(String[] args) 
	{
		FinalTest3 ft3 = new FinalTest3();
		ft3.abs();
		
		AirIndia ai = new AirIndia();
		ai.planeColor();
		
		System.out.println(ft3.x);
	}

}
