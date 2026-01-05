package rajeshsele;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prgrm002 
{

	public static void main(String[] args) 
	{
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[2] = 20;
//		arr[3] = 30;
//		arr[4] = 40;
//		arr[1] = 50;
//		
//		int arr1[] = {4, 5, 6, 7, 8, 9, 10};
//		
//		for(int i = 0; i < arr.length; i++) 
//		{
//			System.out.println(arr[i]);
//		}
//		
//		for(int x : arr1) 
//		{
//			System.out.println(x);
//		}
		
		ArrayList arli = new ArrayList();
		arli.add(20);
		arli.add("max");
		arli.add('c');
		arli.add(78.9f);
		arli.add(100.9);
		
		System.out.println(arli);
		System.out.println("*********");
		
		List<String> str = new ArrayList<String>();
		str.add("mad");
		str.add("max");
		str.add(2, "john");
		str.add("wick");
		//str.add(22);
		
		for(String xx : str) 
		{
			System.out.println(xx);
		}
		
		str.set(1, "jumper");
		
		System.out.println("*********");
		for(int j = 0; j < str.size(); j++) 
		{
			System.out.println(str.get(j));
		}
		
		str.remove(0);
		str.remove("john");
		
		System.out.println("*********");
		for(int h = 0; h < str.size(); h++) 
		{
			System.out.println(str.get(h));
		}
		
		System.out.println(str.size());
		
		System.out.println("*********");
		
		String cars[] = {"venue", "hilux", "vellfire"};
		
		
		List<String> arr3 = Arrays.asList(cars);
		System.out.println(arr3.contains("hilux"));
		
		System.out.println(arr3.size());

	}

}
