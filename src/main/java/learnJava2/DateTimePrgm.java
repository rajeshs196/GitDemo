package learnJava2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePrgm 
{

	public static void main(String[] args) 
	{
		//LocalDate, LocalTime, LocalDateTime, ZonedDateTime, DateTimeFormatter
		
//		LocalDate ld = LocalDate.now();
//		System.out.println(ld);
//		
//		LocalTime lt = LocalTime.now();
//		System.out.println(lt);

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //hh - 12hrs format, HH - 24hrs format
		String forms = ldt.format(dft);
		
		System.out.println(forms);
		
//		ZonedDateTime zdt = ZonedDateTime.now();
//		System.out.println(zdt);
	}

}
