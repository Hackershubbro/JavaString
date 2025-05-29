package JavaStrings;

import java.util.ArrayList;

public class LetterCount {
    public static void main(String[] args) {
        String str = "happy";
        int n = str.length() + 1;
        int[] countArray = new int[127];
        ArrayList<Character>[] arr = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < str.length(); i++) {
            // System.out.println((int) str.charAt(i));
            char c = str.charAt(i);
            countArray[(int) c]++;
            arr[countArray[(int) c] - 1].remove((Character) c);
            arr[countArray[(int) c]].add(c);
        }

        // for (int i = 0; i < countArray.length; i++) {
        //     System.out.print(countArray[i] + " ");
        // }
        // System.out.println();
        // for(int i = 0; i < n; i ++){
        //     for(char x : arr[i])
        //     System.out.println(i+" "+x);
        // }

        for (int i = n - 1; i >= 0; i--){
            if (!arr[i].isEmpty()){
                for(char x: arr[i]){
                    System.out.print(i);
                    System.out.print(x);
                }
            }
        }
        System.out.println();
    }
}