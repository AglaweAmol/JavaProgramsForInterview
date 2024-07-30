package StreamFunctions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {

    public static void main(String[] args) {

        String inputstring="Java Concept of the day";

        Map<Character,Long> chharCountMap=
                inputstring.chars().mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("Character count to Map "+chharCountMap);



    }


}
