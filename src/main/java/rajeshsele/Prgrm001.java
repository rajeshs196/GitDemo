package rajeshsele;

public class Prgrm001 
{

	public static void main(String[] args) 
	{
		int myNum = 8;
		String name = "max";
		char lett = 'm';
		float deci = 4.5f;
		double dec = 11.44;
		boolean myCard = true;
		
		
//		System.out.println(myNum + " this is number"); 
//		System.out.println(name + " "+ lett +" " + deci +" " + dec + " " + myCard);
		
		int[] arr = new int[5];
		arr[0] = 22;
		arr[1] = 33;
		arr[2] = 44;
		
		
		String str[] = {"max", "john", "wick"};
		
//		for(int i = 0; i < arr.length; i++) 
//		{
//			System.out.print(arr[i] + " ");
//		}
//		
//		for(int i = 0; i < str.length; i++) 
//		{
//			System.out.print(str[i] + " ");
//		}
		
		
		int[]  arr3 = {1, 2, 3, 4, 5, 6};
//		for(int x : arr3) 
//		{
//			System.out.println(x);
//		}
		
		int arr2[] = new int[8];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 6;
		arr2[3] = 10;
		arr2[4] = 17;
		arr2[5] = 24;
		arr2[6] = 25;
		arr2[7] = 33;
		
//		for(int j = 0; j < arr2.length; j++) 
//		{
//			if(arr2[j] % 2 == 0) 
//			{
//				System.out.println(arr2[j]);
//			}
//			else 
//			{
//				System.out.println(arr2[j] + " not divisble by 2");
//			}
//		}
//		
//		for(int z : arr2) 
//		{
//			System.out.println(z);
//		}
		
		int numbers[] = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);
        
        
        for(int i = numbers.length - 1; i >= 0; i--)
        {
            System.out.println(numbers[i]);
        }
        
        System.out.println(numbers.length);
 	}

}
