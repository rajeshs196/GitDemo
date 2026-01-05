package rajeshsele;

public class Prgrm003 
{

	public static void main(String[] args) 
	{
		//string literals
		String s = "mad max";
		String s1 = "mad max"; //points to same memory location as 's' variable, as both hold same value
		String s2 = "john wick"; // new memory location is created
		
		System.out.println(System.identityHashCode(s)); //prints identical to memory address, cant get or print actual memory address in java 
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("*******");
		
		//creates in new memory location in both
		//creating string objects using 'new' keyword
		String s3 = new String("Cars");
		String s4 = new String("Cars");
		
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println("*******");
		
		String str = "mad max is in the mustang";
		String[] spltstrs = str.split(" ");// splits the string with reference to white space(" ") and returns an array of strings
		
		for(String xx : spltstrs) 
		{
			System.out.println(xx);
		}
			
		System.out.println("*******");
		
		String str1 = "mustang is great";
		String[] spltstrs1 = str1.split("is");
		
		System.out.println(spltstrs1[0]);
		System.out.println(spltstrs1[1]);
		System.out.println(spltstrs1[1].trim()); //removes any white spaces around the string
		
		System.out.println("*******");
		
		//printing each character in above string
		for(int i = 0; i < str1.length(); i++) 
		{
			System.out.println(str1.charAt(i)); // str1.charAt(i) => Returns the char value at the specified index
		}
		
		System.out.println("*******");
		
		//printing characters in a string in reverse order
		int aa = 0;
		for(int j = str1.length() - 1; j >= 0; j--) 
		{
			System.out.print(str1.charAt(j));
			aa++;
		}
		
		System.out.println("\n" + aa); //number of characters count
		
		System.out.println(System.identityHashCode(str1));
	}

}
