import java.util.*;

class P2
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of an array :\n");
		n = sc.nextInt();

		int[] arr = new int[n];
		System.out.print("Enter an element of array \n");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a  Element Number : "+(i+1));
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		boolean first_element = true;
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
			arr[i] = sum;
			if(arr[i]>0)
			{
				System.out.print(arr[i]+"	");
			}
		}
		System.out.print("]");
		
	}
}