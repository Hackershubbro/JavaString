package Arrays;
import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no employees ");
		int n = scan.nextInt();
		scan.nextLine();
		String arr[] = new String[n];
		
		for (int i = 0; i < n; i += 1) {
			System.out.println("Enter name of employees " + (i + 1));
			arr[i] = scan.nextLine(); 
		}
		scan.close();
		System.out.println("Elements in the array are");
		for (int i = 0; i < n; i += 1) {
			System.out.print(arr[i] + " ");
		}
	}
}