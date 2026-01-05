package rajeshsele;

public class IndianTraffic implements CentralTraffic, ContinentalTraffic
{

	public static void main(String[] args) 
	{
		CentralTraffic ct = new IndianTraffic();

		ct.redLight();
		ct.yellowLight();
		ct.greenLight();
		//ct.pedestrianWalkLight(); //we cannot call local method pedestrianWalkLight() with CentralTraffic as reference, 
									//as its not declared in CentralTraffic interface, so need IndianTraffic reference to access it
		
		IndianTraffic it = new IndianTraffic();
		it.pedestrianWalkLight();
		//it.redLight(); //works
		
		//ct.TrainCrossSymbol();
		
		//it.TrainCrossSymbol();
		
		ContinentalTraffic cot = new IndianTraffic();
		cot.TrainCrossSymbol();
		ContinentalTraffic.FastSignal();
		
	}

	@Override
	public void redLight() 
	{
		System.out.println("stop the vehicle");
		
	}

	@Override
	public void yellowLight() 
	{
		System.out.println("start the vehicle");
		
	}

	@Override
	public void greenLight() 
	{
		System.out.println("move the vehicle");
		
	}

	public void pedestrianWalkLight() 
	{
		System.out.println("pedestrian can cross road");
	}

	@Override
	public void TrainCrossSymbol() 
	{
		System.out.println("Train runs over ur head");
		
	}
	
}
