package StreamFunctions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDescending {

    public static void main(String[] args) {

        List<Integer> mylist = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        mylist.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

    }

}
