
import java.util.Arrays;
import java.util.stream.IntStream;

public class MainRotate {

        public static void main(String[] args) {
            int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] rotatedArray = rotateArrayInPairs(inputArray);
            System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
        }

        public static int[] rotateArrayInPairs(int[] arr) {
            return IntStream.range(0, arr.length)
                    .mapToObj(i -> {
                        if (i % 6 < 3) {
                            return arr[Math.min(i + 2, arr.length - 1 - (i % 3))];
                        } else {
                            return arr[i - 2];
                        }
                    })
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }


