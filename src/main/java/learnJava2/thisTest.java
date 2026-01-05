package learnJava2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class thisTest 
{
	String name = "john wick";
	int x;
	int y;
	String nam1;
	String nam2;
	
	public void dispy() 
	{
		String name = "mad max";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(this.x + " " + this.y + " " + this.nam1 + " " + this.nam2);
	}
	
	public thisTest(int x, int y, String nam1, String nam2) 
	{
		this.x = x;
		this.y = y;
		this.nam1 = nam1;
		this.nam2 = nam2;
	}
	
	public thisTest() 
	{
		this(12, 15, "hyper", "truck");
	}
	
	public static void main(String[] args) 
	{
		new thisTest().dispy();
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String str = ldt.format(dtf);
		
		System.out.println(str);
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonth());
		System.out.println(ldt.getDayOfWeek());

	}

}
