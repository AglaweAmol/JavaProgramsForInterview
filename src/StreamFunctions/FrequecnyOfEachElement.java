package StreamFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequecnyOfEachElement {

    public static void main(String[] args) {

        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> stationaryCountMap =
                stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stationaryCountMap);


    }


}
