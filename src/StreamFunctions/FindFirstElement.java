package StreamFunctions;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

    public static void main(String[] args) {

        List<Integer> mylist = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        mylist.stream()
                .findFirst()
                .ifPresent(System.out::println);

    }
}
