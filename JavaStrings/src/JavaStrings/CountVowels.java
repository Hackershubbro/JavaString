package JavaStrings;
import java.util.*;

public class CountVowels {
    public static void main(String[] args) {
        ArrayList<Character> charArr = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
        String input = "Hello world hEllo";
        input = input.toLowerCase();
        int count = 0;
        for(int i = 0; i < input.length(); i ++){
            if (charArr.contains(input.charAt(i))) count++; 
        }
        System.out.println(count);
    }
}
