import java.util.*;

public class p17
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=n; i>=1;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<2*(n-i);k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<2*(n-i);k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}