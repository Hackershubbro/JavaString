package Arrays;

public class Array4 {
	public static void main(String[] args) {
		int arr[] = {0, 1, 0, 1, 1, 1, 0, 1, 0, 1};

		int o = 0;
		for (int x : arr) if (x == 0) o++;
		for (int i = 0; i < o; i++) arr[i] = 0;
		for (int i = o; i < arr.length; i ++) arr[i] = 1;
		for (int i = 0; i < arr.length; i ++) System.out.print(arr[i] + " ");
		
//		int l=0, r = 0;
//		while (r < arr.length) {
//			while (arr[r] == 1 && r < arr.length - 1) r++;
//			while (arr[l] == 0 && l < arr.length - 1) l++;
//			
//			if (r > l) {
//				arr[r] = 1;
//				arr[l] = 0;
//			}
//			r ++;
//		}
//		for (int i = 0; i < arr.length; i ++) System.out.print(arr[i] + " ");
	}
}