package StreamFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllJavaPrograms {


//    public static List<Character> findConsecutiveChars(String str)
//    {
// List<Character> result= new ArrayList<>();
//
// for (int i=0;i<str.length()-1;i++)
// {
//     if (str.charAt(i)==str.charAt(i+1))
//     {
//         result.add(str.charAt(i+1));
//     }
// }
// return result;
//    }

    public static void main(String[] args) {


        //Average of Numbers

//        List<Integer> list= Arrays.asList(1,2,3,4,5);
////
////        double avg=list.stream().mapToInt(e->e).average().getAsDouble();
////
////
////    System.out.println("Avg is" +avg);


        //Char Frequency

//   String inputString="Java Concept Of the day";
//
//        Map<Character,Long> charCountMap=inputString.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//        System.out.println("Charcter count to Map"+charCountMap);

//Consecutive Characters

// String str="ABCDDEFEFGGH";
//
// List<Character> consecutiveChars=findConsecutiveChars(str);
//
//        System.out.println("Consecutive Characters"+consecutiveChars);
//
//

        //Duplicate Element from list

//List<Integer> myList= Arrays.asList(10,15,8,49,25,98,98,32,15);
//
// Set<Integer> uniqeIn=new HashSet<>();
//
// myList.stream().filter(s -> uniqeIn.add(s))
//         .collect(Collectors.toList());
//
//        System.out.println(uniqeIn);
//    }


//Frequecny of each element
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> stationaryCountMap = stationeryList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stationaryCountMap);


    }
}
