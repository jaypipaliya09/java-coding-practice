import java.util.*;
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            k=i;
            for(int s=1;s<=i;s++)
            {
                System.out.print(k++);
            }
            k=k-2;
            for(int t=1;t<i;t++)
            {
                System.out.print(k--);
            }
            System.out.println();
        }
    }
}