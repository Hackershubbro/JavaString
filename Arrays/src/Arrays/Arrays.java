package Arrays;
import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		int n = 2;
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i+=1) {
			for(int j = 0; j < n; j += 1) {
				System.out.println("Enter values for " + (i + 1) + " " + (j + 1));
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.print("Largest Element from the provided matrix is ");
		int maxi = arr[0][0];
		for(int i = 0; i < n; i+=1) {
			for(int j = 0; j < n; j += 1) {
				if (maxi < arr[i][j]) maxi = arr[i][j];
			}
		}
		System.out.println(maxi);
		scan.close();
	}
}
