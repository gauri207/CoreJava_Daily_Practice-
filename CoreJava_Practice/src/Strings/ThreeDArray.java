package Strings;

import java.util.Iterator;

public class ThreeDArray {
	public static void main(String[] args) {
		int[][][] a= {{{10,20},{20,40,50},{20,30}}};
		for (int i = 0; i < a.length; i++) 
		{
			for(int j=0;j<a[i].length;j++) 
			{
				for(int k=0;k<a[i][j].length;k++) 
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
	
		}
		
		
	}
}
