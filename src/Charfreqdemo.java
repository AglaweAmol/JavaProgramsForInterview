import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Charfreqdemo {

    public static void main(String[] args) {

                String inputString="AmolAglawe";

                Map<Character,Long> charCount=inputString.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

                System.out.println("Char frequecny" +charCount);

            }
        }
