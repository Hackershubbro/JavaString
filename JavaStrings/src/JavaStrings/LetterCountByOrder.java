package JavaStrings;

public class LetterCountByOrder {
    public static void main(String[] args) {
        String str = "Seenu Seen";
        int[] countArray = new int[127];

        for (int i = 0; i < str.length(); i++) {
            // System.out.println((int) str.charAt(i));
            char c = str.charAt(i);
            countArray[(int) c]++;
        }

        // for(int i = 0; i < 128; i ++){
        //     System.out.print("num" +i + " ");
        //     System.out.print((char) i);System.out.println();
        // }
        // for (int i = 0; i < countArray.length; i++) {
        //     System.out.print(countArray[i] + " ");
        // }
        // System.out.println();
        // for(int i = 0; i < n; i ++){
        //     for(char x : arr[i])
        //     System.out.println(i+" "+x);
        // }

        for(int i = 48; i < 58; i ++){
            if (countArray[i] != 0){
                System.out.print(countArray[i]);
                System.out.print((char) i);
            }
        }
        int small = 97; 
        int caps = 65;
        while (small <= 122 || caps <= 90){
            if (small <= 122 && countArray[small] != 0) {
                System.out.print(countArray[small]);
                System.out.print((char) small);
            }
            if (caps <= 90 && countArray[caps] != 0) {
                System.out.print(countArray[caps]);
                System.out.print((char) caps);
            }
            small ++;
            caps ++;
        }
        System.out.println();
    }
}