package StreamFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SequentialAndParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sequential Stream
        System.out.println("Sequential Stream:");
        Stream<Integer> sequentialStream = numbers.stream();
        sequentialStream.forEach(System.out::println);

        // Parallel Stream
        System.out.println("\nParallel Stream:");
        Stream<Integer> parallelStream = numbers.parallelStream();
        parallelStream.forEach(System.out::println);
    }
}
