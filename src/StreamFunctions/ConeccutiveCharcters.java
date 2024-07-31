package StreamFunctions;

import java.util.ArrayList;
import java.util.List;

public class ConeccutiveCharcters {
    public static void main(String[] args) {

        String str = "ABCDDEFEFGGH";
        List<Character> consecutiveChars = findConsecutiveChars(str);
        System.out.println("Consecutive characters: " + consecutiveChars);
    }

    public static List<Character> findConsecutiveChars(String str) {
        List<Character> result = new ArrayList<>();

        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);
            if (currentChar == nextChar) {
                result.add(nextChar);
            }
        }
        return result;
    }
}
