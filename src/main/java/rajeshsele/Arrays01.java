package rajeshsele;

public class Arrays01 
{
	public static void main(String[] args) 
	{
//		int[]  arr = new int[5];
//		
//		int arr1[] = {2, 3, 4, 5, 6, 7};
//		
//		int[] arr2;
//		arr2 = new int[6];
//		
//		String str[] = {"mad", "max", "john", "wick"};
//		
//		for(int i = 0;i < arr1.length; i++) 
//		{
//			System.out.print(arr1[i] + " ");
//		}
//		
//		System.out.println();
//		
//		for(String strs: str) 
//		{
//			System.out.print(strs + " ");
//		}
		
		int[][] matrix;
		int matrix1[][];
		
		int[][] matrix2 = new int[2][3]; //2 - rows, 3 - columns
		
		int matrix3[][] = {{1,2,3}, {4,5,6,}, {7,8,9,}};
		
		for(int i = 0; i < matrix3.length; i++) //rows 
		{
			for(int j = 0; j < matrix3[i].length; j++) //columns
			{
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
