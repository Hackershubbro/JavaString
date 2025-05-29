package JavaStrings;

public class CountWords {
    public static void main(String[] args) {
        int wordCount = 0;
        String sentence = "l  Hello  c  world to all my   n   a friends    l";
        int left, right, n;
        left = 0; right = 0; n = sentence.length(); 
        while(right < n || left < n){
            while (left < n && sentence.charAt(left) == ' ') left ++;
            right = left;
            while (right < n && sentence.charAt(right) != ' ') right ++;
            if (right == left) break;
            wordCount += 1;
            left = right + 1;
        }
        System.out.println(wordCount);
    }
}