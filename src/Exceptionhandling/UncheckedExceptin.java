package Exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class UncheckedExceptin {

//    public static int calculateSquareRoot(int number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Number must be non-negative");
//        }
//        return (int) Math.sqrt(number);
//    }

    public static void main(String[] args) {


        //ArithmeticException
//        try {
//            System.out.println(10/0);
//        }
//        catch (ArithmeticException e)
//        {
//            e.printStackTrace();
//            System.out.println(e);
//            System.out.println(e.getMessage());
//        }

//NullPointerException
//        String str = null;
//        System.out.println(str.length());

//ArrayIndexOutOfBoundsException

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers[5]);

        //StringIndexOutOfBoundsException example

//        String str = "Hello";
//        System.out.println(str.charAt(10));


        //IllegalArgumentException

//        int result = calculateSquareRoot(-1);
//        System.out.println("Square root: " + result);

//NumberFormatException
//        String str = "abc";
//        try {
//            int number = Integer.parseInt(str);
//            System.out.println("Number: " + number);
//        } catch (NumberFormatException e) {
//            System.out.println("NumberFormatException" + e.getMessage());
//        }

        //ClassCastException

//        Object obj = new Integer(10);
//        String str = (String) obj; // This line will throw ClassCastException
//        System.out.println("String: " + str);


        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");

        // Use an iterator to safely remove elements
        for (String item : list) {
            if (item.equals("banana")) {
                list.remove(item); // This line will throw IllegalStateException
            }
        }
    }

}
