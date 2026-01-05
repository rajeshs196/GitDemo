package learnJava2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CalendarPrgm 
{

	public static void main(String[] args) 
	{
//		LocalDate ld = LocalDate.now();
//		LocalTime lt = LocalTime.now();
//		
//		System.out.println(ld + " " + lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(ldt.format(dtf));

		System.out.println(ldt.getClass());
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getDayOfWeek());
		System.out.println(ldt.getDayOfYear());
		System.out.println(ldt.getMonth());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.minusYears(-1));
		System.out.println(ldt.getYear());
	}

}
