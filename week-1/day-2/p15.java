import java.util.*;

public class p15
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=(2*n)-1;y++)
			{
				if(y==1 || y==(2*i)-1 || i==n || i==y)
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
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=(2*n)-1;y++)
			{
				if(y==1 || y==(2*i)-1 || i==n || i==y)
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