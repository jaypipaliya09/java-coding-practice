import java.util.*;

public class Magicsquare{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for Magic Square and Number Should be odd manner \n");
		n = sc.nextInt();

		if(n%2==0)
		{
			System.exit(0);
		}


		int[][] magicSquare = new int[n][n];
		int sum=0,row_sum;
		for(int i=1;i<=n*n;i++)
		{
			sum = sum + i;
		}

		row_sum = sum/n;

		System.out.println("Sum : "+sum);
		System.out.println("Each Row Sum : "+row_sum);

		int row = n/2;
		int column = n-1;

		for(int counter = 1 ; counter <= n*n ;)
		{
			if(row==-1 && column == n)
			{
				column = n-2;
				row = 0;
			}
			else
			{
				if(column==n)
				{
					column=0;
				}
				if(row<0)
				{
					row = n-1;
				}
			}

			if(magicSquare[row][column]!=0)
			{
				column = column - 2;
				row++;
				continue;
			}
			else
			{
				magicSquare[row][column] = counter;
				canMatrixFill(magicSquare);
				counter++;
			}
			column++;
			row--;
		}
		
		System.out.println();

		//Print the Magic Square

		for(int i=0;i<n;i++)
		{
			System.out.print("	|	");
			for(int j=0;j<n;j++)
			{
				System.out.print(magicSquare[i][j]+"	|	");
			}
			System.out.println();
		}


	}


	//Backend Process
	public static boolean canMatrixFill(int magicSquare[][])
	{
		for(int i=0;i<magicSquare.length;i++)
		{

			for(int j=0;j<magicSquare.length;j++)
			{
				System.out.print(magicSquare[i][j]+"	");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		return true;
	}
}