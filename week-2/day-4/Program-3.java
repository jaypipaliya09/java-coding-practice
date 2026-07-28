import java.util.*;

class P3 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of an array :");
		n = sc.nextInt();
		String[] arr = new String[n];

		if (n == 0) {
			System.exit(0);
		}
		System.out.println("Enter an element of an array :");
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element : " + (i + 1) + " ");
			arr[i] = sc.next();
		}

		System.out.println(Match(arr, n));
	}

	public static boolean Match(String[] arr, int n) {

		boolean flag = true;
		for (int i = 0; i < n - 1; i++) {
			if (!arr[i].equals(arr[i + 1])) {
				flag = false;
				break;
			}
		}
		return flag;

	}
}