import java.util.*;
public class p1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        for (int i = 0; i < n; i++) 
        {
            for(int j=0; j<n-i+3;j++){
                System.out.print("*");
            }
            for(int k=0;k<=i;k++){
                System.out.print(i+1+"*");
            }
            for(int j=0; j<n-i+3;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 