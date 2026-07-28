import java.util.*;

class P1{
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter Size of an array");
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		if(n<0)
		{
			System.exit(0);
		}
		else
		{
			expandArray(n);	
		}
		
	}

	public static void expandArray(int n)
	{
		int size = (n*2)-1;
		int count = 1;

		int[][] arr = new int[size][];
		int start = 1;
		int position = 1;
		while(count!=0)
		{
			arr[start-1] = new int[count];

			for(int i=0;i<count;i++)
			{
				arr[start-1][i] = count;
				
			}
			if((count<n) &&(position==1))
			{
				count++;
			}
			else
			{
				position=0;
				count--;
			}
			start++;

		}

		System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print("[");
            for(int j = 0; j < arr[i].length; j++){
                if((arr[i].length-1) == j){
                    System.out.print(arr[i][j] + "");
                }
                else{
                    System.out.print(arr[i][j] + ",");
                }
            }
            if((arr.length-1) == i){
                System.out.print("]");
            }
            else{
                System.out.print("],");
            }
        }
        System.out.print("]");



	}
}