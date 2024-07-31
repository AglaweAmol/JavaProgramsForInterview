import java.util.Arrays;

public class RotateArray {
    public static void rotateArrayInPairsOf3(int[] arr) {
        for (int i = 0; i < arr.length; i += 3) {
            int start = i;
            int end = Math.min(i + 2, arr.length - 1);
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Input Array: " + Arrays.toString(inputArray));

        rotateArrayInPairsOf3(inputArray);

        System.out.println("Output Array: " + Arrays.toString(inputArray));
    }
}


