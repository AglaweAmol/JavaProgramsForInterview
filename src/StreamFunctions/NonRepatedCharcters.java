package StreamFunctions;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class NonRepatedCharcters {

    public static void main(String[] args) {


        String inputString = "Amol Aglawe";

        String nonRepeatedChars = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> String.valueOf(entry.getKey()))
                .collect(Collectors.joining());

        System.out.println("Non-repeated characters: " + nonRepeatedChars);
    }
}