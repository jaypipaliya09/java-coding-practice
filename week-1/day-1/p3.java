import java.util.*;
public class p3{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==n||j==1||j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}