import java.util.*;

public class p14{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int number=1;

		for(int i=0;i<n;i++)
		{
				if(i!=0)
				{
					System.out.print("* ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(k+" ");
				}

				for(int l=i-1;l>=1;l--)
				{
					System.out.print(l+" ");
				}
				for(int j=0;j<=(2*i);j++)
				{
					if(j==2*i)
					{
						System.out.print("* ");
					}
				}

			System.out.println();
		}
		for(int i=n-2;i>=0;i--)
		{
				if(i!=0)
				{
					System.out.print("* ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(k+" ");
				}

				for(int l=i-1;l>=1;l--)
				{
					System.out.print(l+" ");
				}
				for(int j=0;j<=(2*i);j++)
				{
					if(j==2*i)
					{
						System.out.print("* ");
					}
				}

			System.out.println();
		}
			
	}
}