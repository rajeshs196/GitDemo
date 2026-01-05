package learnJava2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excepton04 
{

	public static void main(String[] args) 
	{
		try 
		{
			findFile();
		}
		catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
		
	}
	
	public static void findFile() throws FileNotFoundException 
	{
		File newfil = new File("max.txt");
		FileInputStream str = new FileInputStream(newfil);
	}

}
