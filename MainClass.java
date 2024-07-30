public class MainClass {

    public static void main(String[] args) {

        String inputString="Hello World";

        Map<Character,Long> charCount=inputString.chars()
                .mapToObj(c -> c)
                .collect(Collectors.groupingBy(function.identity(),Collectors.counting()));

        System.out.println("Char frequecny" +charCount);

    }
}
