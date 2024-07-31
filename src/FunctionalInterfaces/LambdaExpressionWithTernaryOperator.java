package FunctionalInterfaces;

import java.util.function.Predicate;

public class LambdaExpressionWithTernaryOperator {

    public static void main(String[] args) {

        Predicate<Integer> isEven = (n) -> n % 3 == 0;

        String result = isEven.test(10) ? "Even" : "Odd";

        System.out.println(result);


    }

}
