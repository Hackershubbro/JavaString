package Arrays;

public class Array5 {
	static int swap = 3;
	static int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
	protected static void rotate(int start, int end, int[] arr) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
	}
	public static void main(String[] args) {
		
//		int sol[] = new int[arr.length];
//		int temp = 0;
//		for(int i = swap; i < arr.length; i++) sol[temp++] = arr[i];
//		for(int i = 0; i < swap; i ++) sol[temp++] = arr[i];
//		for(int i = 0; i < arr.length; i ++) System.out.print(sol[i] + " ");
		
		Array5.rotate(0, swap - 1, arr);
		Array5.rotate(swap, arr.length - 1, arr);
		Array5.rotate(0, arr.length - 1, arr);
		
 		for(int i = 0; i < arr.length; i ++) System.out.print(arr[i] + " ");	
	}
}