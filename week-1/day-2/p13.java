import java.util.*;

public class p13{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		int number=1;
		int number1;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<(2*i)-1;j++)
			{
				if(j%2!=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(number++);
				}
			}
			System.out.println();
		}

		for(int i=n;i>=1;i--)
		{
			for(int j=0;j<(2*i)-1;j++)
			{
				if(j%2!=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print((number-i)+j);
					number--;
				}
			}
			System.out.println();
		}
	}
}