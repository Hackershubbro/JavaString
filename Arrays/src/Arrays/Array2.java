package Arrays;
import java.util.Scanner;

public class Array2 {
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
		int mini = arr[0][0];
		for(int i = 0; i < n; i+=1) {
			for(int j = 0; j < n; j += 1) {
				if (mini > arr[i][j]) mini = arr[i][j];
			}
		}
		System.out.println(mini);
		scan.close();
	}
}