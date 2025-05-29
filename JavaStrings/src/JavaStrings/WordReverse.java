package JavaStrings;

public class WordReverse {

	public static void main(String[] args) {
		String str = "Hello to all   my  friends";
		String strArray[] = str.split(" ");
		String temp;
		for (int i = 0; i < strArray.length; i++) {
			temp = "";
			for (int j = strArray[i].length() - 1; j >= 0; j--) {
				temp += strArray[i].charAt(j);
			}
			strArray[i] = temp;
		}
		for(int i = 0; i < strArray.length; i ++) System.out.println(strArray[i]);
	}
}
