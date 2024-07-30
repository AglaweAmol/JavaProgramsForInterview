package Hashmap;
import java.util.HashMap;
import java.util.LinkedList;
public class HashmapCollsionHandlingExample {


        public static void main(String[] args) {
            // Create a HashMap with chaining
            HashMap<Key, String> map = new HashMap<>();

            // Create two keys with the same hash code but different values
            Key key1 = new Key(1);
            Key key2 = new Key(2);

            // Put key-value pairs into the HashMap
            map.put(key1, "Value1");
            map.put(key2, "Value2");

            // Retrieve values using the keys
            System.out.println("Value for key1: " + map.get(key1));
            System.out.println("Value for key2: " + map.get(key2));
        }
    }

    class Key {
        private int value;

        public Key(int value) {
            this.value = value;
        }

        @Override
        public int hashCode() {
            // Returning the same hash code for both keys
            return 1;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Key key = (Key) obj;
            return value == key.value;
        }
    }

