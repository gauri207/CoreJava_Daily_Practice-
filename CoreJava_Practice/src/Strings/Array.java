package Strings;

public class Array {
	public static void main(String[] args) {
//		int[] arr= new int[] {10,20,30};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println(a[2].length);
		//2d array printing
		
		int[][] a= {{1,2,3},{20,30},{2,3,4,5,6}};
		for (int i = 0; i < a.length; i++) 
		{
			for(int j=0;j<a[i].length;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
//		int []a=new int[0];
//		System.out.println(a);
//		
//		int[][] a1=new int[2][];
//		a1[0]=new int[] {1,2,3};
//		a1[1]=new int[] {20,30};
//		System.out.println(a1[1][1]);
	}

}
