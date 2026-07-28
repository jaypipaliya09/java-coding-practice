import java.util.*;
public class p6{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=(2*n-1);y++)
			{
				if(y==1 || y==2*i-1)
				{
					System.out.print("*");
				}
				else if(i==n && y%2!=0)
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