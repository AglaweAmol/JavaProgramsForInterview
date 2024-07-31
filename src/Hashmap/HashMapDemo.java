package Hashmap;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Mango", 30);
        map.put("Orange", 40);

        map.put("Apple1", 50);
        map.put("Banana1", 60);
        map.put("Mango", 70);
        map.put("Orange1", 80);

        map.put("Apple2", 90);
        map.put("Banana2", 100);
        map.put("Mango2", 110);
        map.put("Orange2", 120);

        System.out.println(map.size());


        //  System.out.println("Initial HashMap: " + map);

        //  int value=map.get("Apple");

        // System.out.println("Value for key 'Apple': " + value);
//
//        // Check if a key exists
//        if (map.containsKey("Banana")) {
//            System.out.println("Banana is present in the HashMap.");
//        }
//
//        // Remove a key-value pair
//        map.remove("Orange");
//        System.out.println("HashMap after removing 'Orange': " + map);
//
//        // Iterate over the HashMap
//        System.out.println("Iterating over HashMap:");
//        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
//
//        // Get the size of the HashMap
//        System.out.println("Size of the HashMap: " + map.size());
//


    }

}
