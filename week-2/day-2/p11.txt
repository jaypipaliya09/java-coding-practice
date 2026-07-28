import java.util.*;

public class p11{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=2*n-1;k++)
			{
				if(k==1 || k==2*i-1)
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
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*n;k++)
			{
				if(k==1 || k==2*i-1)
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