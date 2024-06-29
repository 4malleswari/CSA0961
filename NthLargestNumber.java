import java.util.Arrays;

public class NthLargestNumber {
    public static int findNthLargestNumber(int[] arr, int n) {
        Arrays.sort(arr); // Sort the array in ascending order
        return arr[arr.length - n]; // Return the Nth largest number from the end of the sorted array
    }

    public static void main(String[] args) {
        int[] arr = {14, 67, 48, 23, 5, 62};
        int N = 4;

        // Find the Nth largest number
        int result = findNthLargestNumber(arr, N);

        // Display the output
        System.out.println(N + "th Largest number: " + result);
    }
}