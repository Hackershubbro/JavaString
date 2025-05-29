package JavaStrings;

public class Anagram {
	public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() == str2.length()) {
            int[] countArray1 = new int[127];
            int[] countArray2 = new int[127];

            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                countArray1[(int) c]++;
            }
            
            for (int i = 0; i < str2.length(); i++) {
                char c = str2.charAt(i);
                countArray2[(int) c]++;
            }

            for (int i = 0; i < 127; i++) {
                if (countArray1[i] != countArray2[i]) return false;
            }
        } else return false;
        return true;
	}
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.print(Anagram.checkAnagram(str1, str2));
    }
}