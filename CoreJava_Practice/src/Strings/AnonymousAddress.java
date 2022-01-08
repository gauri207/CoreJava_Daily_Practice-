package Strings;
//anonymous array is used for instance used
public class AnonymousAddress {
	public static void main(String[] args) {
//		new int[]{10,20};
		AnonymousAddress.sum(new int[] {10,20,30});
		
	}
	static void sum(int arr[])
	{
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			total+=arr[i];
		}
		System.out.println("Total is :"+total);
	}

}
